package hu.bme.aut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kkrisz
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Planner {

    private Stop start;
    private Stop end;
    private Day day;
    private DateTime at;
    private ScheduleData scheduleData;
    private boolean debugMode;

    private final static Logger LOG = LoggerFactory.getLogger(Planner.class);

    public Planner(PlanParams planParams, ScheduleData scheduleData) {
        this.start = planParams.getFrom();
        this.end = planParams.getTo();
        this.day = planParams.getDay();
        this.at = planParams.getAt();
        this.debugMode = planParams.isDebugMode();
        this.scheduleData = scheduleData;
    }

    public String calculateRoute(int recursion) {
        try {
            Map<Integer, Solution> solutions = calculateRouteR(start, recursion, 1, new ArrayList<>(), new HashMap<>(), 0);
            String result;
            if (!debugMode) {
                result =  solutions.entrySet().stream().filter((entry) -> entry.getValue().getSuccessful()).map((entry)
                    -> entry.getKey().toString() + "-" + entry.getValue().toDisplayString())
                    .collect(Collectors.joining("<br/><br/>"));
            } else {
                result = solutions.entrySet().stream().map((entry)
                    -> entry.getKey().toString() + "-" + entry.getValue().toDisplayString())
                    .collect(Collectors.joining("<br/><br/>"));
            }

            if (!result.isEmpty()) {
                return result;
            } else {
                return "The desired endpoint seems unreachable. For more information, please choose debug mode.";
            }
        } catch (Throwable e) {
            LOG.error(e.getMessage(), e);
            return e.getMessage();
        }
    }

    private Map<Integer, Solution> calculateRouteR(Stop currentStop, int recursion, int branch, List<Stop> visited, Map<Integer, Solution> solutions, int parent) {
        visited.add(currentStop);

        if (start.equals(end)) {
            solutions.put(branch, new Solution(Arrays.asList(new String[]{"Start point equals end point, there's nowhere to go."}), false, recursion));
            return solutions;
        }

        if (currentStop.equals(end)) {
            solutions.get(branch).getParts().add(" And you're there. ");
            return solutions;
        }

        if (recursion == 0) {
            Solution sr = solutions.get(branch);
            sr.getParts().add(" Recursion over. ");
            sr.setSuccessful(false);
            return solutions;
        }

        Map<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLines = findFirstLine(currentStop);

        if (possibleLines.isEmpty()) {
            solutions.put(branch, new Solution(Arrays.asList(new String[]{"We couldn't find any ways of transportation on the specified day."}), false, recursion));
            return solutions;
        }

        for (Line line : possibleLines.keySet()) {
            Solution solution;
            if (!solutions.containsKey(branch)) {
                solution = getNewSolution(recursion);
            } else {
                Solution temp = solutions.get(branch);
                if (temp.getDepth() <= recursion) {
                    branch++;
                    solution = getNewSolution(recursion);
                } else {
                    solution = temp;
                    solution.setDepth(recursion);
                }
            }
            solutions.put(branch, solution);
            
            if (parent < branch && parent > 0) {
                Solution parentSol = solutions.get(parent);
                List<String> parentParts = new ArrayList<>();
                parentParts.addAll(parentSol.getParts().subList(0, 5 - recursion));
                parentParts.addAll(solution.getParts());
                solution.setParts(parentParts);
                parent = branch;
            }
            
            List<String> parts = solution.getParts();
            
            parts.add(recursionLog(branch, recursion, line, parent));

            Trip trip = scheduleData.getTrips().get(line);
            List<Stop> tripAllTargetStops = trip.getAllTargetStops();

            if (firstStopAvaliable(trip, currentStop) && !visited.contains(getFirstStop(trip))) {
                solutions = firstStop(trip, currentStop, recursion, branch, visited, solutions);
            } else if (tripAllTargetStops.contains(currentStop)) {
                int currentIdx = tripAllTargetStops.indexOf(currentStop);
                if (connectionAvaliable(tripAllTargetStops, currentIdx) && !visited.contains(getConnection(tripAllTargetStops, currentIdx))) {
                    solutions = connectingStop(tripAllTargetStops, currentIdx, currentStop, recursion, branch, visited, solutions);
                } else {
                    appendLast(parts, lastStop(line));
                    solution.setSuccessful(false);
                }
            } else {
                appendLast(parts, alreadyVisited(line));
                solution.setSuccessful(false);
            }

            branch++;
        }


        return solutions;
    }

    private void appendLast(List<String> list, String str) {
        list.set(list.size() - 1, list.get(list.size() - 1) + str);
    }

    private static Solution getNewSolution(int recursion) {
        return new Solution(new ArrayList<>(), true, recursion);
    }

    private Map<Line, Map<Day, Map<Stop, DailySchedule>>> findFirstLine(Stop currentStop) {
        // find a first line
        Map<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLines = new HashMap<>();
        for (Map.Entry<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLine : scheduleData.getSchedules().entrySet()) {
            Line line = possibleLine.getKey();
            Map<Day, Map<Stop, DailySchedule>> linesSchedule = possibleLine.getValue();

            // the line works on said day
            if (linesSchedule.containsKey(day)) {

                // it stops on
                if (linesSchedule.get(day).containsKey(currentStop)) {
                    possibleLines.put(line, linesSchedule);
                }
            }
        }
        return possibleLines;
    }

    private static Stop getConnection(List<Stop> tripAllTargetStops, int currentIdx) {
        return tripAllTargetStops.get(currentIdx + 1);
    }

    private static boolean connectionAvaliable(List<Stop> tripAllTargetStops, int currentIdx) {
        return tripAllTargetStops.size() > currentIdx + 1;
    }

    private String recursionLog(int branch, int recursion, Line line, int parent) {
        return "<br/> parent" + parent + "branch" + branch + "recursion" + recursion + "<br/> use the " + line.toDisplayString() + ": ";
    }

    private static Stop getFirstStop(Trip tr) {
        return tr.getTargets().get(0).getTarget();
    }

    private static boolean firstStopAvaliable(Trip tr, Stop currentStop) {
        return tr.getStart().equals(currentStop) && tr.getTargets().size() > 0;
    }

    private Map<Integer, Solution> firstStop(Trip tr, Stop currentStop, int recursion, int branch, List<Stop> visited, Map<Integer, Solution> solutions) {
        Stop nextStop = getFirstStop(tr);
        String stopPart = "get on its first stop (" + currentStop.getName() + ") then go to " + nextStop.getName();
        appendLast(solutions.get(branch).getParts(),stopPart);
        return calculateRouteR(nextStop, recursion - 1, branch, visited, solutions, branch);
    }

    private Map<Integer, Solution> connectingStop(List<Stop> tripAllTargetStops, int currentIdx, Stop currentStop, int recursion, int branch, List<Stop> visited, Map<Integer, Solution> solutions) {
        Stop nextStop = getConnection(tripAllTargetStops, currentIdx);
        String stopPart = " connect in at " + currentStop.getName() + " and go to " + nextStop.getName();
        appendLast(solutions.get(branch).getParts(),stopPart);
        return calculateRouteR(nextStop, recursion - 1, branch, visited, solutions, branch);
    }

    private String lastStop(Line line) {
        return " sorry you wont get there with " + line.toDisplayString() + " its the last stop.";
    }

    private String alreadyVisited(Line line) {
        return " sorry you wont get there with " + line.toDisplayString() + " you were already there.";
    }
}

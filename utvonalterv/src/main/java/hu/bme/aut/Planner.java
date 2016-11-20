package hu.bme.aut;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;
import org.joda.time.DateTime;

/**
 *
 * @author kkrisz
 */
@Data
public class Planner {
    private Stop start;
    private Stop end;
    private Day day;
    private DateTime at;
    private ScheduleData scheduleData;
    
    public Planner (PlanParams planParams, ScheduleData scheduleData) {
        this.start = planParams.getFrom();
        this.end = planParams.getTo();
        this.day = planParams.getDay();
        this.at = planParams.getAt();
        this.scheduleData = scheduleData;
    }
    
    public String calculateRoute(int recursion) {
        return calculateRouteR(start, recursion, 1);
    }
    
    public String calculateRouteR(Stop currentStop, int recursion, int branch) {
        if (start.equals(end)) {
            return "Start point equals end point, there's nowhere to go.";
        } 
        
        if (currentStop.equals(end)) {
            return " And you're there. ";
        }
        
        if (recursion == 0) {
            return " recursion-over.";
        }
        
        
        // find a first line
        Map<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLines = new HashMap<>();
        for (Map.Entry<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLine : scheduleData.getSchedules().entrySet()) {
            Line line = possibleLine.getKey();
            Map<Day, Map<Stop, DailySchedule>> linesSchedule = possibleLine.getValue();
            
            // the line works on said day
            if (linesSchedule.containsKey(day)) {
                
                // it stops on 
                if (linesSchedule.get(day).containsKey(currentStop)){
                    possibleLines.put(line, linesSchedule);
                }
            }
        }
        
        if (possibleLines.isEmpty()) {
            return "We couldn't find any ways of transportation on the specified day.";
        }
        
        String result = "";
        
        
        int possibilities = possibleLines.keySet().size();
        for (Line line : possibleLines.keySet()) {
            result += "<br/>"+branch+"R(" + recursion+"): <br/>" + " use the " + line.toDisplayString() +": ";
            
            Trip tr = scheduleData.getTrips().get(line);
            if (tr.getStart().equals(currentStop) && tr.getTargets().size() > 0) {
                Stop nextStop = tr.getTargets().get(0).getTarget();
                
                result += "get on its first stop ("+currentStop.getName()+") then go to "+ nextStop.getName() + calculateRouteR(nextStop, recursion - 1, branch*10);
                
            } else if (tr.getAllTargetStops().contains(currentStop)) {
                int currentIdx = tr.getAllTargetStops().indexOf(currentStop);
                if (tr.getAllTargetStops().size() > currentIdx + 1){
                    Stop nextStop = tr.getAllTargetStops().get(currentIdx+1);
                    result += " connect in at " + currentStop.getName() + " and go to " + nextStop.getName() + calculateRouteR(nextStop, recursion - 1, branch*10);                    
                } else {
                    result +=  " sorry you wont get there with " + line.toDisplayString() + " its the last stop.";
                }
            } else {
                result += " sorry you wont get there with " + line.toDisplayString() + " idk why...";
            }
            
            if (possibilities > 1) {
                result += "<br/> or you can <br/>";
            }
            possibilities--;
            branch++;
        }
        
        return result;
    }
}

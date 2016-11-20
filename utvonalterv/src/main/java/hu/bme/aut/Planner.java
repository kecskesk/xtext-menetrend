package hu.bme.aut;

import java.util.HashMap;
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
    
    public String calculateRoute() {
        if (start.equals(end)) {
            return "Start point equals end point, there's nowhere to go.";
        } 
        
        // find a first line
        Map<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLines = new HashMap<>();
        for (Map.Entry<Line, Map<Day, Map<Stop, DailySchedule>>> possibleLine : scheduleData.getSchedules().entrySet()) {
            Line line = possibleLine.getKey();
            Map<Day, Map<Stop, DailySchedule>> linesSchedule = possibleLine.getValue();
            
            if (linesSchedule.containsKey(day)) {
                if (linesSchedule.get(day).containsKey(start)){
                    possibleLines.put(line, linesSchedule);
                }
            }
        }
        
        if (possibleLines.isEmpty()) {
            return "We couldn't find any ways of transportation on the specified day.";
        }
        
        String result = "";
        
        result += "Get on ";
        int possibilities = possibleLines.keySet().size();
        for (Line line : possibleLines.keySet()) {
            result += line.toDisplayString();
            if (possibilities > 1) {
                result += " or ";
            }
            possibilities --;
        }
        
        return result;
    }
}

package hu.bme.aut;

import java.util.List;
import lombok.Data;
import org.joda.time.DateTime;

/**
 *
 * @author kkrisz
 */
@Data
public class DailySchedule {
    private Day day;
    private Stop stop;
    private List<DateTime> departures;    

    public DailySchedule(Day day, Stop stop, List<DateTime> departures) {
        this.day = day;
        this.stop = stop;
        this.departures = departures;
    }
}

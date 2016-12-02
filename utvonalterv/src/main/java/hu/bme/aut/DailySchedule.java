package hu.bme.aut;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.joda.time.DateTime;

/**
 *
 * @author kkrisz
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class DailySchedule {
    private Day day;
    private Stop stop;
    private List<DateTime> departures;
}

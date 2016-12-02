package hu.bme.aut;

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
public class PlanParams {
    private Stop from;
    private Stop to;
    private Day day;
    private DateTime at;
    private boolean debugMode;
}

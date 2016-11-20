package hu.bme.aut;

import lombok.Data;
import org.joda.time.DateTime;

/**
 *
 * @author kkrisz
 */
@Data
public class PlanParams {
    private Stop from;
    private Stop to;
    private Day day;
    private DateTime at;

    public PlanParams() {    
    }
    
    public PlanParams(Stop from, Stop to, Day day, DateTime at) {
        this.from = from;
        this.to = to;
        this.day = day;
        this.at = at;
    }
}

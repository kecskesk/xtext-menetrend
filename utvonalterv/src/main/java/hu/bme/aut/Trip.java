package hu.bme.aut;

import java.util.List;
import lombok.Data;

/**
 *
 * @author kkrisz
 */
@Data
public class Trip {
    private Stop start;
    private List<TripTarget> targets;    

    public Trip(Stop start, List<TripTarget> targets) {
        this.start = start;
        this.targets = targets;
    }
}

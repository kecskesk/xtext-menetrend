package hu.bme.aut;

import java.util.List;
import java.util.stream.Collectors;
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
    
    public List<Stop> getAllTargetStops() {
        return targets.stream().map((triptarget) -> triptarget.getTarget()).collect(Collectors.toList());
    }
}

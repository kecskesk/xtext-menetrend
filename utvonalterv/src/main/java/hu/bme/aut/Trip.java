package hu.bme.aut;

import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kkrisz
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Trip {
    private Stop start;
    private List<TripTarget> targets;
    
    public List<Stop> getAllTargetStops() {
        return targets.stream().map((triptarget) -> triptarget.getTarget()).collect(Collectors.toList());
    }
}

package hu.bme.aut;

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
public class TripTarget {
    private Stop target;
    private int length;
}

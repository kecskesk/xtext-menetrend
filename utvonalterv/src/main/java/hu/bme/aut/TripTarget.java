package hu.bme.aut;

import lombok.Data;

/**
 *
 * @author kkrisz
 */
@Data
public class TripTarget {
    private Stop target;
    private int length;

    public TripTarget(Stop target, int length) {
        this.target = target;
        this.length = length;
    }
}

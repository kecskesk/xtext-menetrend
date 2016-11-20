package hu.bme.aut;

import lombok.Data;

/**
 *
 * @author kkrisz
 */
@Data
public class Stop {
    private String name;

    public Stop(String name) {
        this.name = name;
    }
}

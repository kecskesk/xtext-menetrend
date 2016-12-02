package hu.bme.aut;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author kkrisz
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Line {
    private LineType lineType;
    private String lineId;
    
    public String toDisplayString() {
        return lineType.getName() + "-" + lineId;
    }
}

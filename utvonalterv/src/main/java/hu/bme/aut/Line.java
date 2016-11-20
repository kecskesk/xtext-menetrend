package hu.bme.aut;

import lombok.Data;

/**
 *
 * @author kkrisz
 */
@Data
public class Line {
    private LineType lineType;
    private String lineId;

    public Line(LineType lineType, String lineId) {
        this.lineType = lineType;
        this.lineId = lineId;
    }
    
    public String toDisplayString() {
        return lineType.getName() + "-" + lineId;
    }
}

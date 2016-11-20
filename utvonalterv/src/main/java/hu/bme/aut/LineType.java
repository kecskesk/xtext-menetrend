package hu.bme.aut;

/**
 *
 * @author kkrisz
 */
public enum LineType {
    BUS("Bus"), 
    METRO("Metro"), 
    TRAM("Tram"), 
    TROLI("Troli"), 
    HEV("Hev");

    private final String name;    

    private LineType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public static LineType fromString(String lineType) {
        for (LineType lt : LineType.values()) {
            if (lt.getName().equals(lineType)) return lt;
        }
        return null;
    }
}

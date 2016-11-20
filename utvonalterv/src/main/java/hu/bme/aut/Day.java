package hu.bme.aut;

/**
 *
 * @author kkrisz
 */
public enum Day {
    MONDAY("monday"), 
    TUESDAY("tuesday"), 
    WEDNESDAY("wednesday"), 
    THURSDAY("thursday"), 
    FRIDAY("friday"), 
    SATURDAY("saturday"), 
    SUNDAY("sunday");

    private final String name;    

    private Day(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }   
    
    public static Day fromString(String day) {
        for (Day d : Day.values()) {
            if (d.getName().equals(day)) return d;
        }
        return null;
    } 
}

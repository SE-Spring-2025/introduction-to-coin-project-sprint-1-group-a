import java.util.Calendar;

public class Penny extends Coin {

    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR)); // Default to current year
    }
    
    public Penny(int year) {
        super(0.01, "Penny", "IN GOD WE TRUST", year, "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT", false, new Copper());
    }
}

import java.util.Calendar;

public class Nickel extends Coin {
    public Nickel() {
        this(Calendar.getInstance().get(Calendar.YEAR)); // Default to current year
    }
    
    public Nickel(int year) {
        super(0.05, "Nickel", "IN GOD WE TRUST", year, "T_Jefferson", "Jefferson_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "FIVE CENTS", false, new CuproNickel());
    }
}

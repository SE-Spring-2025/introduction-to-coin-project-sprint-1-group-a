import java.util.Calendar;

public class Dollar extends Coin {
    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR)); // Default to current year
    }

    public Dollar(int year) {
        super(1.00, "Dollar", "IN GOD WE TRUST", year, "S_Anthony", "Moon_Eagle", 
              "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", 
              "ONE DOLLAR", true, new CuproNickel());
    }
}

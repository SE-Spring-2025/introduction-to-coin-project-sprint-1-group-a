package Main;

import java.util.Calendar;

public class Penny extends Coin {
    
    // Default constructor with current year + default Copper metallurgy
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR), new Copper());
    }

    // Year-specific constructor with default Copper metallurgy
    public Penny(int year) {
        this(year, new Copper());
    }

    // Custom constructor allowing alternate metallurgy
    public Penny(int year, Metallurgy smelter) {
        super(0.01, "Penny", "IN GOD WE TRUST", year,
              "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT",
              false, smelter);
    }
}

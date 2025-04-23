package Main;

import java.util.Calendar;

public class Penny extends Coin {
    public Penny() {
        this(Calendar.getInstance().get(Calendar.YEAR), new Copper());
    }

    public Penny(int year) {
        this(year, new Copper());
    }

    public Penny(int year, Metallurgy smelter) {
        super(0.01, "Penny", "IN GOD WE TRUST", year,
              "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT",
              false, smelter);
    }
}

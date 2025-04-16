package Main;

import java.util.Calendar;

public class Quarter extends Coin {
    public Quarter() {
        this(Calendar.getInstance().get(Calendar.YEAR), new CuproNickel());
    }

    public Quarter(int year) {
        this(year, new CuproNickel());
    }

    public Quarter(int year, Metallurgy smelter) {
        super(0.25, "Quarter", "IN GOD WE TRUST", year,
              "G_Washington", "Eagle", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "QUARTER DOLLAR",
              true, smelter);
    }
}

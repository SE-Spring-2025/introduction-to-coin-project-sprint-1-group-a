package Main;

import java.util.Calendar;

public class Dollar extends Coin {
    public Dollar() {
        this(Calendar.getInstance().get(Calendar.YEAR), new CuproNickel());
    }

    public Dollar(int year) {
        this(year, new CuproNickel());
    }

    public Dollar(int year, Metallurgy smelter) {
        super(1.00, "Dollar", "IN GOD WE TRUST", year,
              "S_Anthony", "Moon_Eagle", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "ONE DOLLAR",
              true, smelter);
    }
}


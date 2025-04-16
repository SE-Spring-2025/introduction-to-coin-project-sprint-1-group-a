package Main;

import java.util.Calendar;

public class Nickel extends Coin {
    public Nickel() {
        this(Calendar.getInstance().get(Calendar.YEAR), new CuproNickel());
    }

    public Nickel(int year) {
        this(year, new CuproNickel());
    }

    public Nickel(int year, Metallurgy smelter) {
        super(0.05, "Nickel", "IN GOD WE TRUST", year,
              "T_Jefferson", "Jefferson_Memorial", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "FIVE CENTS",
              false, smelter);
    }
}

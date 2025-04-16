package Main;

import java.util.Calendar;

public class HalfDollar extends Coin {
    public HalfDollar() {
        this(Calendar.getInstance().get(Calendar.YEAR), new CuproNickel());
    }

    public HalfDollar(int year) {
        this(year, new CuproNickel());
    }

    public HalfDollar(int year, Metallurgy smelter) {
        super(0.50, "HalfDollar", "IN GOD WE TRUST", year,
              "J_Kennedy", "Presidential_Seal", "E PLURIBUS UNUM",
              "LIBERTY", "UNITED STATES OF AMERICA", "HALF DOLLAR",
              true, smelter);
    }
}

import java.util.Calendar;

public class Dime extends Coin {
    public Dime() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(int year) {
        super(0.10, "Dime", "IN GOD WE TRUST", year,
              "F_Roosevelt", "Torch_Branches",
              "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA",
              "ONE DIME", true, new CuproNickel());
    }
}

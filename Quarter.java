import java.util.Calendar;

public class Quarter extends Coin {

    public Quarter() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Quarter(int manufactureYear) {
        super(0.25,
                "Quarter",
                "IN GOD WE TRUST",
                manufactureYear,
                "G_Washington",
                "Eagle",
                "E PLURIBUS UNUM",
                "LIBERTY",
                "UNITED STATES OF AMERICA",
                "QUARTER DOLLAR",
                true,
                new CuproNickel());
                coinCounts.incrementTotal();
                coinCounts.incrementQuarters();
    }
}

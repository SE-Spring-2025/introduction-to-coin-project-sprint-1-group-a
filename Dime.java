import java.util.Calendar;

public class Dime extends Coin {
    public Dime() {
        this(Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(int year) {
        super(0.10, year);

        setCommonName("Dime");
        setFrontImage("F_Roosevelt");
        setBackImage("Torch_Branches");
        setBackMotto("E PLURIBUS UNUM");
        setFrontLabel("LIBERTY");
        setBackLabel("UNITED STATES OF AMERICA");
        setValueDescription("ONE DIME");
        setRidgedEdge(true);
        setMetallurgy("Cupro-Nickel");
    }
}

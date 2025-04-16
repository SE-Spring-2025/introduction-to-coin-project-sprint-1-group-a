package Main;
public class Nickel extends Coin {
    public Nickel() {
        super(0.05, "Nickel", "IN GOD WE TRUST", 2024, "T_Jefferson", "Jefferson_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "FIVE CENTS", false, "Cupro-Nickel");
    }
    
    public Nickel(int year) {
        super(0.05, "Nickel", "IN GOD WE TRUST", year, "T_Jefferson", "Jefferson_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "FIVE CENTS", false, "Cupro-Nickel");
    }
}

package Main;
public class Penny extends Coin {
    public Penny() {
        super(0.01, "Penny", "IN GOD WE TRUST", 2024, "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT", false, "Copper");
    }
    
    public Penny(int year) {
        super(0.01, "Penny", "IN GOD WE TRUST", year, "A_Lincoln", "Lincoln_Memorial", "E PLURIBUS UNUM", "LIBERTY", "UNITED STATES OF AMERICA", "ONE CENT", false, "Copper");
    }
}

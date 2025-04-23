package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PennyTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testPennyDefaultConstructor() {
        Penny penny = new Penny();
        assertEquals(0.01, penny.getValue(), 0.0001);
        assertEquals("Penny", penny.getCommonName());
        assertEquals("IN GOD WE TRUST", penny.getFrontMotto());
        assertEquals("A_Lincoln", penny.getFrontImage());
        assertEquals("Lincoln_Memorial", penny.getBackImage());
        assertEquals("E PLURIBUS UNUM", penny.getBackMotto());
        assertEquals("LIBERTY", penny.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", penny.getBackLabel());
        assertEquals("ONE CENT", penny.getValueDescription());
        assertFalse(penny.getRidgedEdge());
        assertEquals("Copper", penny.getMetallurgy());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }

    @Test
    public void testPennyYearConstructor() {
        Penny penny = new Penny(1999);
        assertEquals(0.01, penny.getValue(), 0.0001);
        assertEquals(1999, penny.getManufactureYear());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }

    @Test
    public void testPennyCustomMetallurgy() {
        Penny penny = new Penny(2005, new CuproNickel());
        assertEquals("Cupro-Nickel", penny.getMetallurgy());
        assertEquals(2005, penny.getManufactureYear());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }
}

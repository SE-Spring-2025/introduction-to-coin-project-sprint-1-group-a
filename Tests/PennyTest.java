package Tests;

import Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PennyTest {

    @Test
    public void testDefaultPenny() {
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
    }

    @Test
    public void testCustomMetallurgyPenny() {
        Penny testPenny = new Penny(1982, new CuproNickel());
        assertEquals("Cupro-Nickel", testPenny.getMetallurgy());
        assertEquals(1982, testPenny.getManufactureYear());
    }
}

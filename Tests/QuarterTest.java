package Tests;
import Main.Quarter;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuarterTest {
    @Test
    public void testQuarterDefaultConstructor() {
        Quarter quarter = new Quarter();  // Correct object

        assertEquals(0.25, quarter.getValue(), 0.0001);
        assertEquals("Quarter", quarter.getCommonName());
        assertEquals("IN GOD WE TRUST", quarter.getFrontMotto());
        assertEquals("G_Washington", quarter.getFrontImage());
        assertEquals("Eagle", quarter.getBackImage());
        assertEquals("E PLURIBUS UNUM", quarter.getBackMotto());
        assertEquals("LIBERTY", quarter.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", quarter.getBackLabel());
        assertEquals("QUARTER DOLLAR", quarter.getValueDescription());
        assertTrue(quarter.getRidgedEdge());
        assertEquals("Cupro-Nickel", quarter.getMetallurgy());
    }

    @Test
    public void testQuarterYearConstructor() {
        Quarter quarter = new Quarter(1999);
        assertEquals(1999, quarter.getManufactureYear());
    }
}

package Tests;

import Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuarterTest {
    @Test
    public void testQuarterDefaultConstructor() {
        Quarter q = new Quarter();
        assertEquals(0.25, q.getValue(), 0.0001);
        assertEquals("Quarter", q.getCommonName());
        assertEquals("G_Washington", q.getFrontImage());
        assertEquals("Eagle", q.getBackImage());
        assertEquals("QUARTER DOLLAR", q.getValueDescription());
        assertTrue(q.getRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
    }

    @Test
    public void testQuarterCustomMetallurgy() {
        Quarter q = new Quarter(2001, new Copper());
        assertEquals("Copper", q.getMetallurgy());
    }
}

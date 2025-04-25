package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HalfDollarTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testHalfDollarManufacture() {
        HalfDollar h = new HalfDollar();
        h = (HalfDollar) h.manufacture(h);

        assertEquals(0.50, h.getValue(), 0.0001);
        assertEquals("HalfDollar", h.getCommonName());
        assertEquals("J_Kennedy", h.getFrontImage());
        assertEquals("Presidential_Seal", h.getBackImage());
        assertEquals("HALF DOLLAR", h.getValueDescription());
        assertTrue(h.getRidgedEdge());
        assertEquals("Cupro-Nickel", h.getMetallurgy());
        assertTrue(h.wasFlipped());
        assertTrue(h.wasBuffed());
    }
}

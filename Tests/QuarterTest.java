package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuarterTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testQuarterManufacture() {
        Quarter q = new Quarter();
        q = (Quarter) q.manufacture(q);

        assertEquals(0.25, q.getValue(), 0.0001);
        assertEquals("Quarter", q.getCommonName());
        assertEquals("G_Washington", q.getFrontImage());
        assertEquals("Eagle", q.getBackImage());
        assertEquals("QUARTER DOLLAR", q.getValueDescription());
        assertTrue(q.getRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
        assertTrue(q.wasFlipped());
        assertTrue(q.wasBuffed());
        assertEquals(1, Coin.getCoinCounts().getQuarters());
    }
}

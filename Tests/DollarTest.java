package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DollarTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testDollarManufacture() {
        Dollar d = new Dollar();
        d = (Dollar) d.manufacture(d);

        assertEquals(1.00, d.getValue(), 0.0001);
        assertEquals("Dollar", d.getCommonName());
        assertEquals("S_Anthony", d.getFrontImage());
        assertEquals("Moon_Eagle", d.getBackImage());
        assertEquals("ONE DOLLAR", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertTrue(d.wasFlipped());
        assertTrue(d.wasBuffed());
    }
}

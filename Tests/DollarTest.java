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
    public void testDollarConstructor() {
        Dollar d = new Dollar(2022);
        assertEquals(1.00, d.getValue(), 0.0001);
        assertEquals("Dollar", d.getCommonName());
        assertEquals("S_Anthony", d.getFrontImage());
        assertEquals("Moon_Eagle", d.getBackImage());
        assertEquals("ONE DOLLAR", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }

    @Test
    public void testDollarWithCustomMetallurgy() {
        Dollar d = new Dollar(1990, new Copper());
        assertEquals("Copper", d.getMetallurgy());
        assertEquals(1990, d.getManufactureYear());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }
}

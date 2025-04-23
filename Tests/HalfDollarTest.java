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
    public void testHalfDollarConstructor() {
        HalfDollar h = new HalfDollar(2022);
        assertEquals(0.50, h.getValue(), 0.0001);
        assertEquals("HalfDollar", h.getCommonName());
        assertEquals("J_Kennedy", h.getFrontImage());
        assertEquals("Presidential_Seal", h.getBackImage());
        assertEquals("HALF DOLLAR", h.getValueDescription());
        assertTrue(h.getRidgedEdge());
        assertEquals("Cupro-Nickel", h.getMetallurgy());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }

    @Test
    public void testHalfDollarWithAltMetal() {
        HalfDollar h = new HalfDollar(1965, new Copper());
        assertEquals("Copper", h.getMetallurgy());
        assertEquals(1965, h.getManufactureYear());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }
}

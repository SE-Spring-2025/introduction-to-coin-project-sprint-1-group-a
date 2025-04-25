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
    public void testPennyManufacture() {
        Penny p = new Penny();
        p = (Penny) p.manufacture(p);

        assertEquals(0.01, p.getValue(), 0.0001);
        assertEquals("Penny", p.getCommonName());
        assertEquals("A_Lincoln", p.getFrontImage());
        assertEquals("Lincoln_Memorial", p.getBackImage());
        assertEquals("ONE CENT", p.getValueDescription());
        assertFalse(p.getRidgedEdge());
        assertEquals("Copper", p.getMetallurgy());
        assertTrue(p.wasFlipped());
        assertTrue(p.wasBuffed());
    }
}

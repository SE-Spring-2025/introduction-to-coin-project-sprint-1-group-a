package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NickelTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testNickelManufacture() {
        Nickel n = new Nickel();
        n = (Nickel) n.manufacture(n);

        assertEquals(0.05, n.getValue(), 0.0001);
        assertEquals("Nickel", n.getCommonName());
        assertEquals("T_Jefferson", n.getFrontImage());
        assertEquals("Jefferson_Memorial", n.getBackImage());
        assertEquals("FIVE CENTS", n.getValueDescription());
        assertFalse(n.getRidgedEdge());
        assertEquals("Cupro-Nickel", n.getMetallurgy());
        assertTrue(n.wasFlipped());
        assertTrue(n.wasBuffed());
    }
}

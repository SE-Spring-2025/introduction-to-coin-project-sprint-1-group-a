package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DimeTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testDimeManufacture() {
        Dime d = new Dime();
        d = (Dime) d.manufacture(d);

        assertEquals(0.10, d.getValue(), 0.0001);
        assertEquals("Dime", d.getCommonName());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertTrue(d.wasFlipped());
        assertTrue(d.wasBuffed());
    }
}

package Tests;

import Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DimeTest {
    @Test
    public void testDimeConstructor() {
        Dime d = new Dime(2022);
        assertEquals(0.10, d.getValue(), 0.0001);
        assertEquals("Dime", d.getCommonName());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
    }

    @Test
    public void testDimeWithCustomMetallurgy() {
        Dime d = new Dime(1971, new Copper());
        assertEquals("Copper", d.getMetallurgy());
        assertEquals(1971, d.getManufactureYear());
    }
}

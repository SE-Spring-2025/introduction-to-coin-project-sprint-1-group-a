package Tests;

import Main.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NickelTest {
    @Test
    public void testNickelDefaultConstructor() {
        Nickel nickel = new Nickel();
        assertEquals(0.05, nickel.getValue(), 0.0001);
        assertEquals("Nickel", nickel.getCommonName());
        assertEquals("T_Jefferson", nickel.getFrontImage());
        assertEquals("Jefferson_Memorial", nickel.getBackImage());
        assertEquals("FIVE CENTS", nickel.getValueDescription());
        assertFalse(nickel.getRidgedEdge());
        assertEquals("Cupro-Nickel", nickel.getMetallurgy());
    }

    @Test
    public void testNickelCustomYearAndMetallurgy() {
        Nickel nickel = new Nickel(1984, new Copper());
        assertEquals(1984, nickel.getManufactureYear());
        assertEquals("Copper", nickel.getMetallurgy());
    }
}


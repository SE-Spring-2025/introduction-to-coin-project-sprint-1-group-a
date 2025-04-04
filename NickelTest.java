import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NickelTest {
    @Test
    public void testNickelDefaultConstructor() {
        Nickel nickel = new Nickel();
        assertEquals(0.05, nickel.getValue());
        assertEquals("Nickel", nickel.getCommonName());
        assertEquals("IN GOD WE TRUST", nickel.getFrontMotto());
        assertEquals("T_Jefferson", nickel.getFrontImage());
        assertEquals("Jefferson_Memorial", nickel.getBackImage());
        assertEquals("E PLURIBUS UNUM", nickel.getBackMotto());
        assertEquals("LIBERTY", nickel.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", nickel.getBackLabel());
        assertEquals("FIVE CENTS", nickel.getValueDescription());
        assertFalse(nickel.getRidgedEdge());
        assertEquals("Cupro-Nickel", nickel.getMetallurgy());
    }
    
    @Test
    public void testNickelYearConstructor() {
        Nickel nickel = new Nickel(2000);
        assertEquals(2000, nickel.getManufactureYear());
    }
}

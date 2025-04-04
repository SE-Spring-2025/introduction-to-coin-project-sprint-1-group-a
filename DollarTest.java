import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest {
    @Test
    public void testDollarConstructor() {
        Dollar d = new Dollar(2022);
        assertEquals(1.00, d.getValue());
        assertEquals("Dollar", d.getCommonName());
        assertEquals("S_Anthony", d.getFrontImage());
        assertEquals("Moon_Eagle", d.getBackImage());
        assertEquals("ONE DOLLAR", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
    }
}

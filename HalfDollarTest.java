import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {
    @Test
    public void testHalfDollarConstructor() {
        HalfDollar h = new HalfDollar(2022);
        assertEquals(0.50, h.getValue());
        assertEquals("HalfDollar", h.getCommonName());
        assertEquals("J_Kennedy", h.getFrontImage());
        assertEquals("Presidential_Seal", h.getBackImage());
        assertEquals("HALF DOLLAR", h.getValueDescription());
        assertTrue(h.getRidgedEdge());
        assertEquals("Cupro-Nickel", h.getMetallurgy());
    }
}


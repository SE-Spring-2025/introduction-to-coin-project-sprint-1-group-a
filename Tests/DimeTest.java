package Tests;
import Main.Dime;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DimeTest {
    @Test
    public void testDimeConstructor() {
        Dime d = new Dime(2022);
        assertEquals(0.10, d.getValue());
        assertEquals("Dime", d.getCommonName());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertTrue(d.getRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
    }
}

package Tests;

import Main.Coin;
import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinTest {
	@SuppressWarnings("unused")
    private static int currYear;

    @BeforeAll
    public static void getCurrYear() {
        currYear = Calendar.getInstance().get(Calendar.YEAR);
    }

    @Test
    public void testMockCoinConstructorAndGetters() {
        Coin c = new MockCoin();

        assertEquals(0.24, c.getValue(), 0.0001);
        assertEquals("Mock", c.getCommonName());
        assertEquals("frontMotto", c.getFrontMotto());
        assertEquals(2000, c.getManufactureYear());
        assertEquals("frontImage", c.getFrontImage());
        assertEquals("backImage", c.getBackImage());
        assertEquals("backMotto", c.getBackMotto());
        assertEquals("frontLabel", c.getFrontLabel());
        assertEquals("backLabel", c.getBackLabel());
        assertEquals("twenty-four cents", c.getValueDescription());
        assertFalse(c.getRidgedEdge());
        assertEquals("metallurgy", c.getMetallurgy());
    }

    @Test
    public void testToString() {
        Coin c = new MockCoin();

        String expected = "[Mock,0.24,2000,'frontMotto','backMotto','frontImage','backImage','frontLabel','backLabel','twenty-four cents',smooth,'metallurgy']";
        assertEquals(expected, c.toString());
    }

    // Local test subclass of Coin to allow testing
    private static class MockCoin extends Coin {
        public MockCoin() {
            super(0.24, "Mock", "frontMotto", 2000,
                    "frontImage", "backImage", "backMotto",
                    "frontLabel", "backLabel", "twenty-four cents", false, "metallurgy");
        }
    }
}

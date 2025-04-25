package Tests;

import Main.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTest {

    @BeforeEach
    public void resetCounts() {
        Coin.getCoinCounts().reset();
    }

    @Test
    public void testMockCoinManufacture() {
        Coin c = new MockCoin();
        c = c.manufacture(c);

        assertEquals(0.24, c.getValue(), 0.0001);
        assertEquals("Mock", c.getCommonName());
        assertEquals("MockFrontImage", c.getFrontImage());
        assertEquals("MockBackImage", c.getBackImage());
        assertEquals("MOCK VALUE", c.getValueDescription());
        assertEquals("Copper", c.getMetallurgy());
        assertTrue(c.wasFlipped());
        assertTrue(c.wasBuffed());
        assertEquals(1, Coin.getCoinCounts().getTotalCoins());
    }

    private static class MockCoin extends Coin {
        public MockCoin() {
            super(0.24, "Mock", new Copper());
        }

        @Override
        protected boolean shouldHaveRidges() {
            return false;
        }

        @Override
        protected Coin imprintFrontImage(Coin c) {
            this.frontImage = "MockFrontImage";
            return this;
        }

        @Override
        protected Coin imprintFrontText(Coin c) {
            this.frontMotto = "MOCK FRONT";
            this.frontLabel = "MOCK LABEL";
            return this;
        }

        @Override
        protected Coin imprintBackImage(Coin c) {
            this.backImage = "MockBackImage";
            return this;
        }

        @Override
        protected Coin imprintBackText(Coin c) {
            this.backMotto = "MOCK BACK";
            this.backLabel = "MOCK COUNTRY";
            this.valueDescription = "MOCK VALUE";
            return this;
        }
    }
}

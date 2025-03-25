import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Coin tests.
 * 
 * @author Eva Anderson
 * @author
 * @author
 * @author
 * @version 1.0
 */
public class CoinTest {
    Coin testPenny;
    Coin testNickel;
    Coin testDime;
    Coin testQuarter;
    Coin testHalfDollar;
    Coin testDollar;

    /**
     * Tests constructors.
     */
    @Test
    public void testConstructors() {
        testPenny = new Coin(0.01, 2015);
        assertEquals(0.01, testPenny.getValue(), "Value should be 0.01");
        assertEquals(2015, testPenny.getManufactureYear(), "Year should be 2015");
        
        testNickel = new Coin(0.05, 2016);
        assertEquals(0.05, testNickel.getValue(), "Value should be 0.05");
        assertEquals(2016, testNickel.getManufactureYear(), "Year should be 2016");
        
        testDime = new Coin(0.10, 2017);
        assertEquals(0.10, testDime.getValue(), "Value should be 0.10");
        assertEquals(2017, testDime.getManufactureYear(), "Year should be 2017");

        testQuarter = new Coin(0.25, 2018);
        assertEquals(0.25, testQuarter.getValue(), "Value should be 0.25");
        assertEquals(2018, testQuarter.getManufactureYear(), "Year should be 2018");

        testHalfDollar = new Coin(0.50, 2019);
        assertEquals(0.50, testHalfDollar.getValue(), "Value should be 0.50");
        assertEquals(2019, testHalfDollar.getManufactureYear(), "Year should be 2019");

        testDollar = new Coin(1.00, 2020);
        assertEquals(1.00, testDollar.getValue(), "Value should be 1.00");
        assertEquals(2020, testDollar.getManufactureYear(), "Year should be 2020");
    }

    /**
     * Tests getters.
     */
    @Test
    public void testGetters() {
        testPenny = new Coin(0.01, 2015);
        testPenny.setCommonName("Penny");
        testPenny.setFrontMotto("In God We Trust");
        testPenny.setFrontImage("penny-front.jpg");
        testPenny.setBackImage("penny-back.jpg");
        testPenny.setBackMotto("E Pluribus Unum");
        testPenny.setFrontLabel("Front");
        testPenny.setBackLabel("Back");
        testPenny.setValueDescription("One cent");
        testPenny.setRidgedEdge(false);
        testPenny.setMetallurgy("Copper-plated zinc");

        assertEquals("Penny", testPenny.getCommonName(), "Common name should be Penny");
        assertEquals("In God We Trust", testPenny.getFrontMotto(), "Front motto should be In God We Trust");
        assertEquals("penny-front.jpg", testPenny.getFrontImage(), "Front image should be penny-front.jpg");
        assertEquals("penny-back.jpg", testPenny.getBackImage(), "Back image should be penny-back.jpg");
        assertEquals("E Pluribus Unum", testPenny.getBackMotto(), "Back motto should be E Pluribus Unum");
        assertEquals("Front", testPenny.getFrontLabel(), "Front label should be Front");
        assertEquals("Back", testPenny.getBackLabel(), "Back label should be Back");
        assertEquals("One cent", testPenny.getValueDescription(), "Value description should be One cent");
        assertFalse(testPenny.getRidgedEdge(), "Ridged edge should be false");
        assertEquals("Copper-plated zinc", testPenny.getMetallurgy(), "Metallurgy should be Copper-plated zinc");
    }
}
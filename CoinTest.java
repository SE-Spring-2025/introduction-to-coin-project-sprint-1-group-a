import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinTest {
    private static int currYear;
    
    @BeforeAll
    public static void getCurrYear() {
	currYear = (Calendar.getInstance()).get(Calendar.YEAR);
    }

    @Test
    public void testConstructors() {
	// Basically just make sure they don't blow up
	// parameterless constructor
	try { Coin c = new Penny(); } catch (Exception e) {
		fail("Penny constructor failed: " + e.getMessage());
	}

	try { Coin c = new Nickel(); } catch (Exception e) {
		fail("Nickel constructor failed: " + e.getMessage());
	}

	try { Coin c = new Dime(); } catch (Exception e) {
		fail("Dime constructor failed: " + e.getMessage());
	}

	try { Coin c = new Quarter(); } catch (Exception e) {
		fail("Quarter constructor failed: " + e.getMessage());
	}

	try { Coin c = new HalfDollar(); } catch (Exception e) {
		fail("HalfDollar constructor failed: " + e.getMessage());
	}

	try { Coin c = new Dollar(); } catch (Exception e) {
		fail("Dollar constructor failed: " + e.getMessage());
	}

	assertTrue(true); // if we got here, everything worked
	}

    @Test
    public void testGetters() {
		assertTrue(testPenny(), "Penny getters failed");
        assertTrue(testNickel(), "Nickel getters failed");
        assertTrue(testDime(), "Dime getters failed");
        assertTrue(testQuarter(), "Quarter getters failed");
        assertTrue(testHalfDollar(), "HalfDollar getters failed");
        assertTrue(testDollar(), "Dollar getters failed");
    }

    @Test
    public void testToString() {
		Coin c = new HalfDollar(1999);
        String expectedOutput = "[HalfDollar,0.50,1999,'IN GOD WE TRUST','E PLURIBUS UNUM'"
                + ",'J_Kennedy','Presidential_Seal','LIBERTY','UNITED STATES OF AMERICA','HALF DOLLAR',ridges,'Cupro-Nickel']";
        assertEquals(expectedOutput, c.toString());
    }

    //---------------------------------------------------------
    // private helper methods
    //---------------------------------------------------------
    private boolean testPenny() {
	Coin c = new Coin(Coin.PENNY_VALUE);
	
	if (! "Penny".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.PENNY_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "A_Lincoln".equals(c.getFrontImage())) return false;
	if (! "Lincoln_Memorial".equals(c.getBackImage())) return false;
	if (! "ONE CENT".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Copper".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	    
	// make it here then didn't fail!
	return true;
    }
    private boolean testNickel() {
	Coin c = new Coin(Coin.NICKEL_VALUE);
	
	if (! "Nickel".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.NICKEL_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "T_Jefferson".equals(c.getFrontImage())) return false;
	if (! "Jefferson_Memorial".equals(c.getBackImage())) return false;
	if (! "FIVE CENTS".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != false) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDime() {
	Coin c = new Coin(Coin.DIME_VALUE);
	
	if (! "Dime".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.DIME_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "F_Roosevelt".equals(c.getFrontImage())) return false;
	if (! "Torch_Branches".equals(c.getBackImage())) return false;
	if (! "ONE DIME".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testQuarter() {
	Coin c = new Coin(Coin.QUARTER_VALUE);
	
	if (! "Quarter".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.QUARTER_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "G_Washington".equals(c.getFrontImage())) return false;
	if (! "Eagle".equals(c.getBackImage())) return false;
	if (! "QUARTER DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testHalfDollar() {
	Coin c = new Coin(Coin.HALFDOLLAR_VALUE);
	
	if (! "HalfDollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.HALFDOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "J_Kennedy".equals(c.getFrontImage())) return false;
	if (! "Presidential_Seal".equals(c.getBackImage())) return false;
	if (! "HALF DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
    private boolean testDollar() {
	Coin c = new Coin(Coin.DOLLAR_VALUE);
	
	if (! "Dollar".equals(c.getCommonName())) return false;
	if (! cmpDoubles(c.getValue(), Coin.DOLLAR_VALUE)) return false;
	if (! "IN GOD WE TRUST".equals(c.getFrontMotto())) return false;
	if (! "E PLURIBUS UNUM".equals(c.getBackMotto())) return false;
	if (! "LIBERTY".equals(c.getFrontLabel())) return false;
	if (! "UNITED STATES OF AMERICA".equals(c.getBackLabel())) return false;
	if (! "S_Anthony".equals(c.getFrontImage())) return false;
	if (! "Moon_Eagle".equals(c.getBackImage())) return false;
	if (! "ONE DOLLAR".equals(c.getValueDescription())) return false;
	if (c.getRidgedEdge() != true) return false;
	if (! "Cupro-Nickel".equals(c.getMetallurgy())) return false;
	if (currYear != c.getYear()) return false;
	
	// make it here then didn't fail!
	return true;
    }
}
    

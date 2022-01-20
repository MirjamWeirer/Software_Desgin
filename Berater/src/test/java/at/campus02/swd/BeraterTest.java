package at.campus02.swd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BeraterTest {

	private Berater berater;
	private Rechnung rechnung;

	@Before
	public void setUp() throws Exception {
		berater = new Berater("Hugo", 30.80, 400.50);
		rechnung = new Rechnung(berater, 35);
	}

	@Test
	public void testBeraterGetter() {
		assertEquals("Hugo", berater.getName());
		assertEquals(30.80, berater.getStundensatz(), 0);
		assertEquals(400.50, berater.getTagsatz(), 0);
	}

	@Test
	public void testStundenStrategie() {
		IStrategie strategie = new StundenStrategie();
		double price = rechnung.calcPrice(strategie);
		assertEquals(1078.0, price, 0);
	}

	@Test
	public void testVolleTageStrategie() {
		IStrategie strategie = new VolleTageStrategie();
		double price = rechnung.calcPrice(strategie);
		assertEquals(2002.5, price, 0);
	}

}

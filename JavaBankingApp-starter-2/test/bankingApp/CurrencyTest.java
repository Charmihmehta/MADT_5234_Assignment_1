package bankingApp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bankingApp.Currency;

public class CurrencyTest {
	
	/* Example currencies: 
	 * 	CAD = Canadian dollar
	 * 	EUR = Euros
	 * 	GBP = Great British Pounds
	 * 	HKD = Hong Kong Dollars
	 */
	public Currency CAD, EUR, GBP, HKD,BRL;
	
	@Before
	public void setUp() throws Exception {
		// Setup some test currencies to use in the below test cases
		CAD = new Currency("CAD", 0.75);
		EUR = new Currency("EUR", 1.14);
		HKD = new Currency("HKD", 0.13);
		BRL = new Currency("BRL",0.27);
	}

	@Test
	public void testGetName() {
		// Write the test case for testing the getName() function
		
		assertEquals("CAD", CAD.getName());
			}
	
	@Test
	public void testGetRate() {
		// @TODO: Write the test case for testing the getRate() function
		
		assertEquals(1.14, EUR.getRate(),0);
	
	}
	
	@Test
	public void testSetRate() {
		// @TODO: Write the test case for testing the setRate() function
		
		// For this function, you should do:
		// 1. Assert that the oldRate is correct
		// 2. Change the rate
		// 3. Assert that the newRate is correct
		// You will end up with 2 assert() statements in this function.
		assertEquals(0.75, CAD.getRate(),0);
		CAD.setRate(0.88);
		assertEquals(0.88, CAD.getRate(),0);
		
		
		
	}
	
	@Test
	public void testValueInUSD() {
		// @TODO: Write the test case for testing the valueInUSD() function
		assertEquals(75,CAD.valueInUSD(100),0);
	}
	
	@Test
	public void testValueInThisCurrency() {
		// @TODO: Write the test case for testing the valueInThisCurrency() function
		// For this function, you should:
		// 1. Assert the value of the "other" currency
		// 2. Get the value in "this" currency
		// 3. Assert that the value in "this" currency is correct
		// You will end up with 2 assert() statements in this function.
		assertEquals(150,CAD.valueInUSD(200),0);
		assertEquals(131.58,CAD.valueInThisCurrency(200, EUR),0);
		 
		
	}

}

package cse360assign3;

/** Creating a calculator test case and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/20/2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{
	@Test // Junit test case to test Calculator method to see if it return NULL or not
	public void testCalculator()
	{
		Calculator TI83 = new Calculator();
		
		assertNotNull("The value is not null", TI83);
	}
	
	@Test // Junit test case to test getTotal() method
	public void testGetTotal()
	{
		Calculator TI83 = new Calculator();
		
		assertNotEquals(1, TI83.getTotal());
	}
	
	@Test // Junit test case to test add() method
	public void testAdd()
	{
		Calculator TI83 = new Calculator();

		TI83.add(6);
		TI83.add(0);
		
		assertEquals(6, TI83.getTotal());
	}

	@Test // Junit test case to test subtract() method
	public void testSubtract()
	{
		Calculator TI83 = new Calculator();
		
		TI83.subtract(5);
		
		assertEquals(-5, TI83.getTotal());
	}
	
	@Test // Junit test case to test multiply() method
	public void testMultiply()
	{
		Calculator TI83 = new Calculator();

		TI83.add(2);
		TI83.multiply(2);
		
		assertEquals(4, TI83.getTotal());
	} 
	
	@Test // Junit test case to test divide() method
	public void testDivide()
	{
		Calculator TI83 = new Calculator();

		TI83.add(2);
		TI83.divide(0);
		
		assertNotEquals(1, TI83.getTotal());
	}
	
	@Test // Junit test case to test getHistory() method
	public void testGetHistory()
	{
		fail("Not yet implemented");
	}
}

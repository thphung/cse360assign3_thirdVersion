package cse360assign3;

/** Creating a calculator test case and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/22/2016
 * 
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{
	/**
	 * Junit test case to test Calculator method to see if it return NULL or not
	 */
	@Test
	public void testCalculator()
	{
		Calculator TI83 = new Calculator();
		
		assertNotNull("The value is not null", TI83);
	}
	
	/**
	 * Junit test case to test getTotal() method
	 */
	@Test 
	public void testGetTotal()
	{
		Calculator TI83 = new Calculator();
		
		assertNotEquals(1, TI83.getTotal());
	}
	
	/**
	 * Junit test case to test add() method
	 */
	@Test 
	public void testAdd()
	{
		Calculator TI83 = new Calculator();

		TI83.add(6);
		TI83.add(0);
		
		assertEquals(6, TI83.getTotal());
	}

	/**
	 * Junit test case to test subtract() method
	 */
	@Test 
	public void testSubtract()
	{
		Calculator TI83 = new Calculator();
		
		TI83.subtract(5);
		
		assertEquals(-5, TI83.getTotal());
	}
	
	/**
	 * Junit test case to test multiply() method
	 */
	@Test 
	public void testMultiply()
	{
		Calculator TI83 = new Calculator();

		TI83.add(2);
		TI83.multiply(2);
		
		assertEquals(4, TI83.getTotal());
	} 
	
	/**
	 * Junit test case to test divide() method
	 */
	@Test
	public void testDivide()
	{
		Calculator TI83 = new Calculator();

		TI83.add(2);
		TI83.divide(0);
		
		assertNotEquals(1, TI83.getTotal());
	}
	
	/*
	 * Junit test case to test getHistory() method
	 */
	@Test 
	public void testGetHistory()
	{
		int value = 0;
		
		Calculator TI83 = new Calculator();
		
		System.out.print(value);
		
		value = 4;
		TI83.add(value);
		System.out.print(TI83.getHistory());
		
		value = 2;
		TI83.subtract(value);
		System.out.print(TI83.getHistory());
		
		value = 0;
		TI83.divide(value);
		System.out.print(TI83.getHistory());
		
		value = 4;
		TI83.subtract(value);
		System.out.print(TI83.getHistory());
		
		value = 3;
		TI83.multiply(value);
		System.out.print(TI83.getHistory());
	}
}

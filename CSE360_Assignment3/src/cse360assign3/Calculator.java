package cse360assign3;

/** Creating a calculator and commit to GitHub
 * @author Thien Duc Phung 
 * 		PIN#: 703
 * @version 2/22/2016
 * 
 */

public class Calculator 
{
	private int total;
	private String math;
	
	/**
	 * Calculator method
	 */
	public Calculator() 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Return total value 
	 * @return current value of total
	 */
	public int getTotal() 
	{
		return total;
	}
	
	/**
	 * Adding function of the calculator
	 * @param value - parameter from user
	 */
	public void add(int value) 
	{
		total = total + value;
		
		math = " + " + value;
	}
	
	/**
	 * Subtracting function of the calculator
	 * @param value - parameter from user
	 */
	public void subtract(int value) 
	{
		total = total - value;
		
		math = " - " + value;
	}
	
	/**
	 * Multiplying function of the calculator
	 * @param value - parameter from user
	 */
	public void multiply(int value) 
	{
		total = total * value;
		
		math = " * " + value;
	}
	
	/**
	 * Diving function of the calculator
	 * @param value parameter from user
	 */
	public void divide(int value) 
	{
		if (value == 0)
		{
			total = 0;
			
			math = " / " + value;
		}
		else 
		{
			total = total / value;
			
			math = " / " + value;
		}
	}
	
	/**
	 * Contain all the history of using any mathematical methods 
	 * @return math string contain the appropriate sign and value
	 */
	public String getHistory() 
	{
		return math;
	}
}
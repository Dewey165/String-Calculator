import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestingProblemFour {
	/*Calling Add with a negative number will throw an exception
	 *“Negatives not allowed: “ listing all negative numbers that were in
	 * the list of numbers.
	 */	
	@Test(expected = NoNegativeNumbersException.class)
	public void TestingThreeNumbersIncludingANegative() throws NoNegativeNumbersException 
	{
				assertEquals("Negatives not allowed: -1", Calculator.add("-1,2,3"));
	}
	@Test(expected = NoNegativeNumbersException.class)
	public void TestingFourNumberIncludingANegative() throws NoNegativeNumbersException 
	{
		assertEquals("Negatives not allowed: -2", Calculator.add("1,-2,3,4"));
	}
	@Test(expected = NoNegativeNumbersException.class)
	public void TestingFiveNumbersIncludingANegative() throws NoNegativeNumbersException 
	{
		assertEquals("Negatives not allowed: -4", Calculator.add("0,1,2,3,-4"));
	}
}

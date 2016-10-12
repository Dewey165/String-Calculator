import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestingProblemFour {
	/*Calling Add with a negative number will throw an exception
	 *“Negatives not allowed: “ listing all negative numbers that were in
	 * the list of numbers.
	 */	
	@Test(expected = NoNegativeNumbers.class)
	public void TestingThreeNumbersIncludingANegative() throws NoNegativeNumbers 
	{
				assertEquals("Negatives not allowed: -1", Calculator.add("-1,2,3"));
	}
	@Test(expected = NoNegativeNumbers.class) 
	public void TestingFourNumberIncludingANegative() throws NoNegativeNumbers 
	{
		assertEquals("Negatives not allowed: -2", Calculator.add("1,-2,3,4"));
	}
	@Test(expected = NoNegativeNumbers.class) 
	public void TestingFiveNumbersIncludingANegative() throws NoNegativeNumbers 
	{
		assertEquals("Negatives not allowed: -4", Calculator.add("0,1,2,3,-4"));
	}
}

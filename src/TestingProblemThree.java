import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingProblemThree {
	/*Allow the Add method to handle new lines between numbers
	 *(instead of commas).
	 */
	@Test
	public void TestingFourNumbers() throws NoNegativeNumbersException
	{
			assertEquals(10, Calculator.add("1\n2,3,4"));
	}
	@Test
	public void TestingFiveNumbers() throws NoNegativeNumbersException
	{
			assertEquals(15, Calculator.add("0,1\n3\n4,7"));
	}
	@Test
	public void TestingTenNumbers() throws NoNegativeNumbersException
	{
			assertEquals(45, Calculator.add("0\n1\n2\n3\n4\n5\n6\n7\n8\n9"));
	}
}
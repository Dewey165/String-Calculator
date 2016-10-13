import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestingProblemSix {
	/* Allow the Add method to handle an unknown number of
	 * arguments/numbers.
	 */
	@Test
	public void TestingDelimiter() throws NoNegativeNumbersException
	{
		assertEquals(12, Calculator.add("//;\n10;2"));
	}
	@Test
	public void TestingNewDelimiter() throws NoNegativeNumbersException
	{
		assertEquals(3, Calculator.add("//|\n1|2"));
	}
	@Test
	public void TestingNewDelimiterWithThreeNumbers() throws NoNegativeNumbersException
	{
		assertEquals(6, Calculator.add("//a\n1a2a3"));
	}
	
}

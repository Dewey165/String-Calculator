import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingProblemFive {
	/* Allow the Add method to handle an unknown number of
	 * arguments/numbers.
	 */
	@Test
	public void TestingNumbersBiggerThanOneThousand() throws NoNegativeNumbersException
	{
		assertEquals(2, Calculator.add("1001,2"));
	}
	@Test
	public void TestingTenNumbersBiggerThanOneThousand() throws NoNegativeNumbersException
	{
		assertEquals(1000, Calculator.add("0,1,2000,33213,4001,5321,6321,7000,8300,999"));
	}
	@Test
	public void TestingElevenNumbersBiggerThanOneThousand() throws NoNegativeNumbersException
	{
		assertEquals(1999, Calculator.add("0,1,2000,33213,4001,5321,6321,7000,8300,999,999"));
	}
}

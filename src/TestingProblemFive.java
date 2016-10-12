import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestingProblemFive {
	/* Allow the Add method to handle an unknown number of
	 * arguments/numbers.
	 */
	@Test
	public void TestingNumbersBiggerThanOneThousand() throws NoNegativeNumbers
	{
		assertEquals(10, Calculator.add("1001,2"));
	}
	@Test
	public void TestingTenNumbersBiggerThanOneThousand() throws NoNegativeNumbers
	{
		assertEquals(1000, Calculator.add("0,1,2000,33213,4001,5321,6321,7000,8300,999"));
	}
}

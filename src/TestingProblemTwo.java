import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestingProblemTwo {
	/* Allow the Add method to handle an unknown number of
	 * arguments/numbers.
	 */
	@Test
	public void TestingFourNumbers() throws NoNegativeNumbers
	{
		assertEquals(10, Calculator.add("1,2,3,4"));
	}
	@Test
	public void TestingTenNumbers() throws NoNegativeNumbers
	{
		assertEquals(45, Calculator.add("0,1,2,3,4,5,6,7,8,9"));
	}

	//seen at http://stackoverflow.com/questions/1096650/why-doesnt-junit-provide-assertnotequals-methods
	@Test
	public void WorstCaseTesting4Number() throws NoNegativeNumbers
	{
		assertThat(19, not(Calculator.add("5,5,5,5")));
	}
	@Test
	public void WorstCaseTesting10Number() throws NoNegativeNumbers
	{
		assertThat(90, not(Calculator.add("10,10,10,10,10,10,10,10,10,10")));
	}
}

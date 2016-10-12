import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class TestingProblemOne {
	/*Create a String calculator with a method int Add(string numbers)
	*/
	@Test
	public void TestingZeroNumber() throws NoNegativeNumbers
	{
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void TestingOneNumber() throws NoNegativeNumbers
	{
			assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void TestingTwoNumbers() throws NoNegativeNumbers
	{
			assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void TestingThreeNumbers() throws NoNegativeNumbers
	{
			assertEquals(6, Calculator.add("1,2,3"));
	}
	//seen at http://stackoverflow.com/questions/1096650/why-doesnt-junit-provide-assertnotequals-methods
	@Test
	public void WorstCaseTestingZeroNumber() throws NoNegativeNumbers
	{
			assertThat(1, not(Calculator.add("")));
	}
	@Test
	public void WorstCaseTestingOneNumber() throws NoNegativeNumbers
	{
			assertThat(2, not(Calculator.add("1")));
	}
	@Test
	public void WorstCaseTestingTwoNumbers() throws NoNegativeNumbers
	{
			assertThat(2, not(Calculator.add("1,2")));
	}
	@Test
	public void WorstCaseTestingThreeNumbers() throws NoNegativeNumbers
	{
		assertThat(2, not(Calculator.add("1,2,3")));
	}
}


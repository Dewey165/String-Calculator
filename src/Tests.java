import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class Tests {
	//Kata Steps 1
	@Test
	public void TestingZeroNumber()
	{
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void TestingOneNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void TestingTwoNumbers()
	{
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void TestingThreeNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3"));
	}
	//seen at http://stackoverflow.com/questions/1096650/why-doesnt-junit-provide-assertnotequals-methods
	@Test
	public void WorstCaseTestingZeroNumber()
	{
		assertThat(1, not(Calculator.add("")));
	}
	@Test
	public void WorstCaseTestingOneNumber()
	{
		assertThat(2, not(Calculator.add("1")));
	}
	@Test
	public void WorstCaseTestingTwoNumbers()
	{
		assertThat(2, not(Calculator.add("1,2")));
	}
	@Test
	public void WorstCaseTestingThreeNumbers()
	{
		assertThat(2, not(Calculator.add("1,2,3")));
	}
	
}

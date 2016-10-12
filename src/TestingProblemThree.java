import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestingProblemThree {
	//Kata Steps 1
	@Test
	public void TestingFourNumbers()
	{
		assertEquals(10, Calculator.add("1\n2,3,4"));
	}
	@Test
	public void TestingFiveNumbers()
	{
		assertEquals(15, Calculator.add("0,1\n3\n4,7"));
	}
	@Test
	public void TestingTenNumbers()
	{
		assertEquals(45, Calculator.add("0\n1\n2\n3\n4\n5\n6\n7\n8\n9"));
	}
}
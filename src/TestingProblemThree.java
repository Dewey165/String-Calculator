import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
		assertEquals(45, Calculator.add("0,1,2\n3\n4,5,6,7,8\n9"));
	}
}
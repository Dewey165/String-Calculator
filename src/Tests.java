import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Tests {
	//Kata Steps 1
	@Test
	public void testEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}
	@Test
	public void testOneNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}
	@Test
	public void testTwoNumbers()
	{
		assertEquals(3, Calculator.add("1,2"));
	}
	
	@Test
	public void testThreeNumbers()
	{
		assertEquals(0, Calculator.add("1,2,3"));
	}
	
}
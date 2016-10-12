import java.util.Scanner;

public class Calculator {
	private Scanner reader;
	
	public int main()
	{
		System.out.print("Input for Calculator: ");
		reader = new Scanner(System.in);
		String input = reader.next();
		System.out.println(add(input));
		return 0;
	}
	
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
		else if(text.length() == 1)
		{
			return Integer.parseInt(text);
		}
		else 
		{
			int total = 0;
			String[] inputs = splitNumbers(text);
			//Taken from the Hannes Petursson in lecture..
			for(String number : inputs)
			{
				total += Integer.parseInt(number);
			}
			return total;
		}
	}
	//Taken from Hannes Petursson in lecture..
	private static String[] splitNumbers(String numbers)
	{
		return numbers.split("(,|\n)");
	}
}

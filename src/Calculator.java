import java.util.ArrayList;

public class Calculator {
	
	public static int add(String text) throws NoNegativeNumbersException
	{
		if(text.contains("-"))
		{
			String numbers = findNegativeNumbers(text);
			throw new NoNegativeNumbersException(numbers);
		}
		if(text.contains("//") && text.contains("\n"))
		{
			return splitNumbersWithNewDelimiterAndReturnTotal(text);
			//Taken from the Hannes Petursson in lecture..
			
		}
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
				int temp = Integer.parseInt(number);
				if (temp > 1000)
				{
					temp = 0;
				}
				total += temp;
			}	
			return total;
		}
		
		
	}
	//Taken from Hannes Petursson in lecture..
	private static String[] splitNumbers(String numbers)
	{
		return numbers.split("(,|\n)");
	}
	
	private static String findNegativeNumbers(String numbersWithNegative)
	{
		String NegativeNumbers = "";
		String[] numbers = splitNumbers(numbersWithNegative);
		
		for(String number : numbers)
		{
			if(Integer.parseInt(number) < 0)
			{
				NegativeNumbers += number + ",";
			}
		}
		//found at http://stackoverflow.com/questions/7438612/how-to-remove-the-last-character-from-a-string
		NegativeNumbers = NegativeNumbers.replace(NegativeNumbers.substring(NegativeNumbers.length()-1), "");
		return NegativeNumbers;
	}
	private static int splitNumbersWithNewDelimiterAndReturnTotal(String numbers)
	{
		String[] findingDelimiter = numbers.split("\n");
		//finding the delimiter...
		String temp = findingDelimiter[0];
		String numbersWithoutStart = findingDelimiter[1];
		String delimiter = Character.toString(temp.charAt(2));
		
		ArrayList<String> ArrayOfNumbers = new ArrayList<String>();
		String number = "";
		for(int i = 0; i < findingDelimiter[1].length() - 1; i++)
		{
			String index = Character.toString(numbersWithoutStart.charAt(i));
			if( index != delimiter)
			{
				number += index;
			}
			else
			{
				ArrayOfNumbers.add(number);
				number = "";
			}
		}
		
		int total = 0;
		//tempest is temp
		for(String tempest : ArrayOfNumbers)
		{
			int n = Integer.parseInt(tempest);
			if (n > 1000)
			{
				n = 0;
			}
			total += n;
		}
		return total;
	}
}

public class Calculator {
	
	public static int add(String text) throws NoNegativeNumbers
	{
		if(text.contains("-"))
		{
			String numbers = findNegativeNumbers(text);
			throw new NoNegativeNumbers(numbers);
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
}

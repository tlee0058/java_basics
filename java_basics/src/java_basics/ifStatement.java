package java_basics;

public class ifStatement {
	public static void main(String[] args) {
		int summand1 = 5;
		int summand2 = 10;
		int sum = summand1 + summand2;
		System.out.println(sum);

		/**
		 * if statement examples
		 */
		if (sum > 10) 
		{
			System.out.println("Sum is larger than 10");
		}
		else
		{
			System.out.println("Sum is not larger than 10");
		}
		
		if (summand1 * 5 >= summand2 / 3)
		{
			System.out.println("The complex condition is fulfilled");
		}
		
		/**
		 * for loop example 
		 */
		sum = 0;
		for (int i = 1; i <= 10; ++i) 
		{
			sum = sum + i;
		}
		
		System.out.println("Result of summation: " + sum);
		
		
		/**
		 * while loop example
		 */
	
		int sumWhile = 0;
		int i = 1;

		while (i <= 10)
		{
			sumWhile = sumWhile + i;
			++i;
		}
		System.out.println(sumWhile);
	}

}

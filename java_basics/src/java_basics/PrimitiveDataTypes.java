package java_basics;

public class PrimitiveDataTypes 
{

	public static void main(String[] args)
	{
		/**
		 * Creating and initializing boolean variables
		 */
		boolean b1 = 3 > 2;
		boolean b2 = true;
		boolean b3 = false;
		
		System.out.println("b1 = " + b1 + ", b2 = " + b2 + ", b3 = " + b3);
		
		/**
		 * Note: When adding two byte values, you get an int value.
		 * To be able to store the result into a value of type byte, 
		 * we need an explicit type-cast.
		 */
		byte by1 = 127;
		by1 = (byte) (by1 + 1);
		
		System.out.println("by1 after addition: " + by1);
		
		/**
		 * Inaccuracies with floating-point numbers
		 */
		double a = 69.82;
		double b = 69.2 + 0.62;
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("Are a and b equal? " + (a == b));
		
		// Note: using the operator == we can compare two values to each other.
		// If the values are equal the result of the operation will be true,
		// false otherwise
		
		/**
		 * Creating character variables
		 */
		
		char c = 'a';
		System.out.println("c = " + c);
		
		/**
		 * Creating multiple variables at once
		 */
		int variable1, variable2 = 3, variable3;
		
		// Attention: variable1 and variable3 are not initialized.
		// If you would try to read the values of these variables,
		// it would lead to a compiler error. We can read variable2,
		// however.
		
		System.out.println("variable2 = " + variable2);
		
		/**
		 * Type casting
		 */
		
		long long1 = 2000;
		int int1 = (int) long1;
	
		System.out.println("int1 after conversion = " + int1);
		
		int var1 = 300;
		byte var2 = (byte) var1;
		
		System.out.println("var2 after conversion = " + var2);
		
		/**
		 * Type casting of char values using the ASCII code
		 * Note: The ASCII code of character A is 65
		 */
		
		char ch = (char) 65;
		System.out.println("ch = " + ch);
		
		int ascii = (int) 'A';
		System.out.println("ascii = " + ascii);
	}
}


package java_basics;

public class OperatorsDemo 
{
	public static boolean checkCondition() 
	{
		System.out.println("This is method checkCondition");
		
		return true;
	}
	
	public static boolean checkCondition2() 
	{
		System.out.println("This is method checkCondition2");
		
		return true;
	}
	
	public static void main(String[] args)
	{
		/**
		 * Assignment and addition
		 */
		int myInt = 1;
		myInt = myInt + 3;
		
		System.out.println("myInt = " + myInt);
		
		/**
		 * Division
		 */
		
		int myInt1 = 5;
		int myInt2 = 2;
		int result = myInt1 / myInt2;
		
		System.out.println("result = " + result);
		
		int myInt3 = 5;
		double myDouble3 = 2.0;
		double result3 = myInt3 / myDouble3;
		
		System.out.println("result3 = " + result3);
		
		/**
		 * Residual value operator
		 */
		
		int residualValue = myInt1 % myInt2;
		System.out.println("residualValue = " + residualValue);
		
		/**
		 * Unary negation
		 */
		
		int myInt4 = 5;
		int myInt5 = -myInt4;
		
		System.out.println("myInt5 = " + myInt5);
		
		/**
		 * Comparison operators
		 */
		
		int myInt6 = 5;
		int myInt7 = 7;

		boolean isEqual = myInt6 == myInt7;
		boolean isLower = myInt6 < myInt7;
		boolean isGreater = myInt6 > myInt7;
		
		System.out.println("isEqual = " + isEqual + ", isLower = " + isLower + 
				", isGreater = " + isGreater);
		
		/** 
		 * Logical operators
		 */
		
		boolean myBool1 = false;
		boolean resultBool = myBool1 && checkCondition();
		
		System.out.println("resultBool = " + resultBool);
		// Attention: if resultBool is evaluated, the method checkCondition isn't executed anymore:
		// after evaluation of myBool1 the final value of resultBool is determined to be false
		// already.
		// If the method checkCondition is executed, it prints a message to the command line. So you
		// can verify by execution of this example that the method isn't executed since the message
		// isn't printed.
		//
		// By the way: If you swap the two operands (i.e. resultBool = checkCondition() && myBool1)
		// the method is executed and the message is printed to the command line
		
		boolean resultBool2 = myBool1 & checkCondition2();
		System.out.println("resultBool2 = " + resultBool2);
		
		// You can force the evaluation of all operands by using the & operator instead
		// of the && operator. In this case the method checkCondition2 is executed and the
		// corresponding message stating the method was executed is printed to the command
		// line.
		
		
		/**
		 * Combining assignment and operation
		 */
		int myInt8 = 5;
		myInt8 += 8;
		
		System.out.println("myInt8 = " + myInt8);
		
		myInt8 -= 2; // a value of 2 is subtracted from the variable
		myInt8 *= 2; // variable is doubled
		myInt8 /= 2; // variable is divided by 2
		myInt8 %= 2; // variable is assigned the residual value  of division by 2
		
		boolean myBool = true;
		myBool |= false; // same as:  myBool = myBool | false;
		myBool &= true; // same as:  myBool = myBool & true;
		myBool ^= true; // same as:  myBool = myBool ^ true;
		
		/**
		 * Incremention and decremention
		 */
		
		int myInt9 = 2;
		myInt9++; // abbreviation for myInt9 = myInt9 + 1;
		++myInt9; // abbreviation for myInt9 = myInt9 + 1;
		
		/**
		 * Prefix and postfix
		 */
		
		int myInt10 = 2;
		int sumPostfix = myInt10++ + 5;
		
		System.out.println("sumPostfix = " + sumPostfix);
		
		int myInt11 = 2;
		int sumPraefix = ++myInt11 + 5;
		
		System.out.println("sumPraefix = " + sumPraefix);
		
		/**
		 * Conditional operator
		 */
		
		int a = 6;
		int resultIf;

		if (a > 5)
			resultIf = 7;
		else
			resultIf = 9;
		
		int resultConditional = a > 5 ? 7 : 9;
		
		System.out.println("resultIf = " + resultIf + ", resultConditional = " + resultConditional);
		
		/**
		 * Expressions
		 */
		
		int result1 = 2 * 3 + 5 - 8;
		int result2 = result1 > 4 ? 7 * 9 : 2 * 3 - 20;
		
		System.out.println("result1 = " + result1 + ", result2 = " + result2);
		
		boolean x = false, y = false, z = true;
		boolean bResult = x && y || z;
		boolean bResultBracket = x && (y || z);
		
		System.out.println("bResult = " + bResult + ", bResultBracket = " + bResultBracket);
		
	}
}


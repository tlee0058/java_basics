package java_basics;

public class StringUse {
	public static void main(String[] args)
	{
		/**
		 * Creating strings
		 */
		
		// Variant 1
		String myString;
		myString = "Hello world";
		
		// Variant 2
		String myString2 = "Hello world";
		
		// with escape sequence
		String myString3 = "William says:\"Look, how pretty it is.\" ";
		System.out.println(myString3);
		
		// Creating string with constructor call
		String myString4 = new String("Hello world");
		
		/**
		 * Assignment
		 */
		
		String myString5 = "How are you?";
		myString5 = "Good, thanks.";
		
		// With the second line, a new string object is created and assigned to variable
		// myString5.
		// The first string object "How are you?" remains unchanged, but isn't used 
		// (and not accessible) anymore.
		
		/**
		 * String methods
		 */
		
		myString = "Hey, you!";
		
		int sizeOfString = myString.length(); // returns number of characters within string
		boolean isEmpty = myString.isEmpty(); // decides if string is  empty
		boolean isEmptyEquiv = myString.length() == 0;  // same as isEmpty()-call
		char ch = myString.charAt(5); // returns the sixth character of the string
		boolean cont = myString.contains("hey"); // checks for a partial string
		int index = myString.indexOf("you"); // checks for position of a partial string
		boolean equality = myString.equals("hey you"); // compares two strings
		String conkat = myString + " How are you?";
		
		System.out.println("sizeOfString = " + sizeOfString + ", isEmpty = "+ isEmpty + ", isEmptyEquiv = " + isEmptyEquiv
				+ ", ch = " + ch+ ", cont = " + cont + ", index = " + index + ", equality = " +
				equality);
		System.out.println("conkat = " + conkat);
		
		/**
		 * Convertion of primitive data types
		 */
		String intAsString = "125";
		int intAsInt = Integer.parseInt(intAsString);
		
		int sum = intAsInt + 5;
		System.out.println("sum = " + sum);
		
		int intAsInt2 = 130;
		String intAsString2 = String.valueOf(intAsInt2);
		
		System.out.println(intAsString2);
	}
}

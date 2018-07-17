package java_basics;

public class arrays {

		public static void main(String[] args)
		{
			/** 
			 * Creating arrays
			 */
			
			// Variant 1:
			int[] array1;
			array1 = new int[5];

			// Variant 2:
			int[] array2 = new int[5];

			// Variant 3:
			int[] array3 = {0, 0, 0, 0, 0};

			// Variant 4:
			int[] array4;
			array4 = new int[] {0, 0, 0, 0, 0};
			
			/**
			 * Access on array elements
			 */
			
			int[] array = {1, 3, 5, 7};

			int firstValue = array[0]; // firstValue is now 1
			System.out.println("firstValue initial = " + firstValue);
			array[0] = array[3]; // the first value in the array is 7 now
			firstValue = array[0]; // firstValue is now 7
			System.out.println("firstValue after change = " + firstValue);
			
			int size = array.length;
			System.out.println("size = " + size);
			
			/**
			 * Multidimensional arrays 
			 */
			
			// Variant 1
			int[][] arrayTwoDim = new int[3][5];
			arrayTwoDim[0][0] = 1; // row 0, column 0
			arrayTwoDim[0][1] = 7; // row 0, column 1
			arrayTwoDim[0][2] = 9; // row 0, column 2
			arrayTwoDim[0][3] = 7; // ...
			arrayTwoDim[0][4] = 2;
			arrayTwoDim[1][0] = 9;
			arrayTwoDim[1][1] = 6; 
			arrayTwoDim[1][2] = 1;
			arrayTwoDim[1][3] = 8; 
			arrayTwoDim[1][4] = 8;
			arrayTwoDim[2][0] = 2;
			arrayTwoDim[2][1] = 8; 
			arrayTwoDim[2][2] = 9;
			arrayTwoDim[2][3] = 2; 
			arrayTwoDim[2][4] = 1;

			// Variant 2
			int[][] arrayTwoDimVariant2 = new int[][] 
				{{1, 7, 9, 7, 2}, {9, 6, 1, 8, 8}, {2, 8, 9, 2, 1}};
		}
	}



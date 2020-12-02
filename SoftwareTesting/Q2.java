/*---------------------------------------------------------------------------
2. Write a program that accepts two arrays from the keyboard and return the -
concatenation of these arrays.                                              -
---------------------------------------------------------------------------*/

import java.util.*;

public class Q2 {

    public static void main(String[] args) {

        int arraySize1, arraySize2;

        arraySize1 = getArraySize();
        arraySize2 = getArraySize();

        int [] arr1 = getArrayelements(arraySize1);
        int [] arr2 = getArrayelements(arraySize2);
        int [] conA = concat(arr1, arr2);

        System.out.println("Result Array: " + Arrays.toString(conA));

    }
    		// Method to take positive array size.
    		public static int getArraySize() {

    			int arraySize;
    			// Prevent the user from entering negative value or zero
    			do {
    			Scanner sc = new Scanner(System.in);

    	        System.out.print("Please Enter the size of the array :");

    	        arraySize = sc.nextInt();
    			} while (arraySize <= 0);

    			return arraySize;
    		}

    		// Method to take elements from users.
    		public static int [] getArrayelements (int arraySize) {

    			Scanner sc = new Scanner(System.in);

    	        int [] array = new int[arraySize];

    	        System.out.println(" Please Enter " + arraySize + " elements of the Array : ");

    	        for (int i = 0; i < arraySize; i++)
    	            {
    	            array[i] = sc.nextInt();
    	            }

    			return array;
    		}

    		// Method return the concatenation of two arrays.
            public static int [] concat(int a[],int b[]) {
                    int res[]=new int[a.length+b.length];
                    System.arraycopy(a, 0, res, 0, a.length);
                    System.arraycopy(b, 0, res, a.length, b.length);

                    return res;
            }
}

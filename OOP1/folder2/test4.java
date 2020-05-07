/* Write a method lastN that takes an integer array, A, and a number, n; returns an integer array. lastN method will return the last n elements.

Example: A = {3,6,9,6,2,1,0,4,9} invoking the lastN method by lastN(A,5), the resulting array is: B = {9,4,0,1,2}


*/

import java.util.*;

public class test4 {
    public static void main(String[] arg) {
        int [] a = {3,6,9,6,2,1,0,4,9};
        int [] b = lastN(a,5);            // lastN the method that will return the res array
        for (int i = 0; i<b.length; i++)     // loop to print the res elements
            System.out.print(b[i] + ", ");
            System.out.println();
    }
public static int[] lastN (int [] A, int n) {
    int [] res = new int [n];    // define result array
    int count = 0;       // initializing counter

    for (int i=A.length-1; count<n; i--) {  // start from the end of the array
          res[count] = A[i];
          count++;
    }
    return res;
}
}


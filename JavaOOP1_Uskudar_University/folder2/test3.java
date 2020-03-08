/* Write a method lastN that takes an integer array, A, and a number, n; returns an integer array. lastN method will return the last n elements.

Example: A = {3,6,9,6,2,1,0,4,9} invoking the lastN method by lastN(A,5), the resulting array is: B = {9,4,0,1,2}


*/

import java.util.*;

public class test3 {

    public static void main (String[] arg) {

     int [] ar = new int[1000];  // initializing the array with size of 100 element
     int count = 0;

    for (int i = 0; i<ar.length; i++)          // for loop to generate random numbers and stor these numbers our the array
        ar[i] = (int) (Math.random() * 21 - 10); // *****

    for (int i = 0; i<ar.length-3; i++)     // search the occurrences of {1,0,-1}

        if (ar[i]==1 && ar[i+1]==0 && ar[i+2]==-1)  // no need to put ;

        System.out.println("The array is randomly generated as: ");

        for (int i=0; i<ar.length; i++)
            System.out.println(ar[i] + ", ");

        System.out.println(count + " occurrences of {1, 0, -1} are found.");
}
}
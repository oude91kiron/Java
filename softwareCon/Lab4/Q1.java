/*---------------------------------------------------------------------------
Implement an algorithm to shuffle an array of numbers or objects.           -
The algorithm for shuffling should be the following:                        -
                                                                            -
for (each index i) {                                                        -
    choose a randome index j where j >= i.                                  -
    swap the elements at indexes i and j.                                   -
}                                                                           -
---------------------------------------------------------------------------*/

import java.util.*;
import java.math.*;

public class Q1
{
    public static void main(String[] args){

        int [] nums = {4, 6, 2, -4, 8, 11, 1, 34, 23, 5};

        // call the method
        System.out.println(shuffle(nums));
        System.out.println(shuffle(nums));
        System.out.println(shuffle(nums));
        System.out.println(shuffle(nums));
    } // End of the main method

    public static String shuffle(int [] arr)
    {
        // Iterate throw the array
        for (int i = 0; i<= arr.length -1; i++){

        // pick a random index in [i, a.length-1]
        int range = arr.length - 1 - (i);
        int j = (int) (Math.random() * range + (i));
                                   // /|\ Max /|\ Min
        // for demonstration purpose:
        // System.out.print(i + " => " + range + " ");

        // swaping the elements
        int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        } // End of the for loop

        String arrString = Arrays.toString(arr);
        return arrString;

    } // End of the method
}
/*-----------------------------------------------------------------------
1- bogo sort: shuffle and pray                                          -
2- bubble sort: swap adjacent pairs that are out of order               -
3- selection sort: look for the smallest element, move to front         -
4- insertion sort: build an increasingly large sorted front portion     -
5- merge sort: recursively divide the array in half and sort it         -
6- heap sort: place the values into a sorted tree structure             -
7- quick sort: recursively partition array based on a middle value      -
-----------------------------------------------------------------------*/

import java.util.*;

public class Sorting{
    public static void main(String[] args)
    {
        int [] array = {17, 29, 11, 4, 230, 8,1,4,1,46,9,95,45,74,85,95,12,25,24,262,23,26,25,29,27};

        // call method to sort the array
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    } // End of main method


    public static void mergeSort(int [] a)
    {
        if(a.length >= 2){
            int [] left = Arrays.copyOfRange(a, 0, a.length/2);
            int [] right= Arrays.copyOfRange(a,a.length/2, a.length);

            // sort the tow halves
            mergeSort(left);
            mergeSort(right);

            // merge the sorted halves into a stored whole
            merge(a, left, right);
        }
    }


    public static void merge(int [] result, int[] left, int[] right)
    {
        int i1 = 0; // index into left array
        int i2 = 0; // index into right array

        for (int i = 0; i < result.length; ++i){
            if(i2 >= right.length || i1 < left.length && left[i1] <= right[i2]){
                result[i] = left[i1];   // take from left.
                i1++;
            } else {
                result[i] = right[i2];  // take from right.
                i2++;
            }
        }
    }
}
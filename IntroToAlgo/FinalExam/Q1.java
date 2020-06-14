/*-------------------------------------------------------------------------------
QUESTION 1 [35 POINTS]                                                          -
Write a method called minGap that accepts an integer array as a parameter       -
and returns the minimum difference or gap between adjacent values in the        -
array, where the gap is defined as the later value minus the earlier value.     -
For example, in the array [1, 3, 6, 7, 12], the first gap is 2 (3 − 1),         -
the second gap is 3 (6 − 3), the third gap is 1 (7 − 6), and the fourth gap     -
is 5 (12 − 7). So your method should return 1 if passed this array. The         -
minimum gap could be a negative number if the list is not in sorted order.      -
If you are passed an array with fewer than two elements, return 0.              -
-------------------------------------------------------------------------------*/

/*-----------------------------------------------
1.accepts an integer array as a parameter       -
2.returns the minimum gap                       -
3.could be a negative number if the list is not -
in sorted order.                                -
4.If you are passed an array with fewer than two-
elements, return 0.                             -
-----------------------------------------------*/

import java.util.*;

public class Q1 {
    public static void main(String[] args){

        int[] arr = {1, 3, 7, 13, 14};

        // calling the method
        int minGap = minGap(arr);
        System.out.println(minGap);

    } // End of the main method

    public static int minGap(int[] array){

        if(array.length<2){
            return 0;
        }

        int gap1 = array[1] - array[0];

        for (int i = 2; i<= array.length-1; i++){
            int gap2 = array[i] - array[i-1];

            if (gap2<gap1){
                gap1 = gap2;
            }
        }
        return gap1;

        } // End of the method minGap
    }

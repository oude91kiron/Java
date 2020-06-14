// returns the range of values in the given array;
// the difference between elements furthest apart
// example: range({17, 29, 11, 4, 20, 8}) is 25
// range1: What complexity class is this algorithm?  Can it be improved?
// range2: The algorithm is O(N^2).  A slightly better than rang1
// range3: The algorithm is O(N).  It runs MUCH faster than rang1 & rang2

import java.util.*;

public class LecEx22
{
    public static void main(String[] args)
    {
        int [] arr = {17, 29, 11, 4, 230, 8};

        //call the method.
        System.out.println(range1(arr));
        System.out.println(range2(arr));
        System.out.println(range3(arr));

    } // End of the main method.

    public static int range1 (int [] a)
    {
        int maxDiff = 0;
        for (int i = 0; i < a.length - 1; ++i){
            for (int j = 0; j < a.length - 1; ++j){
                int diff = Math.abs(a[j] - a[i]);
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;
    } // End of range1


    public static int range2 (int [] a)
    {
        int maxDiff = 0;
        for (int i = 0; i < a.length - 1; ++i){
            for (int j = i + 1; j < a.length - 1; ++j){
                int diff = Math.abs(a[j] - a[i]);
                if(diff > maxDiff){
                    maxDiff = diff;
                }
            }
        }
        return maxDiff;

    } // End of range2



    // runs much faster than range1 & range2
    public static int range3 (int [] a)
    {
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < a.length - 1; ++i){
            if(a[i]< min){
                min = a[i];
            }
            if(a[i]>max){
                max = a[i];
            }
        }
    return max - min;
    }
} // End of the class.



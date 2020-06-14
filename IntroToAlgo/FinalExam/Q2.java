/*-----------------------------------------------------------------------
QUESTION 2 [30 POINTS]                                                  -
Write a method called allDigitsOdd that returns whether every digit of  -
a positive integer is odd. Return true if the number consists entirely  -
of odd digits (1, 3, 5, 7, 9) and false if any of its digits are even   -
(0, 2, 4, 6, 8). For example, the call allDigitsOdd(135319) returns     -
true but allDigitsOdd(9145293) returns false.                           -
-----------------------------------------------------------------------*/

import java.util.*;
import java.lang.*;

public class Q2 {
    public static void main(String[] args){

        int num1 = 9145293;
        int num2 = 135319;

        // call the method
        System.out.println("Are all the digits odd for the number "+ num1 +" "+ allDigitsOdd(num1));
        System.out.println("Are all the digits odd for the number "+ num2 +" "+ allDigitsOdd(num2));

    } // End of the main method.

    public static boolean allDigitsOdd(int n){

        boolean result = false;

        // The method accept the positive integer
        int posN = Math.abs(n);
        while(posN > 0){
            // take the first digit
            int digit = posN % 10;
            //update the number
            posN/=10;
            // check if the digit is even num
            if(digit % 2 == 0){
                posN = 0;
                result = false;
            }else{
                result = true;
            }
        }
        return result;
    } // End of the method.
} // End of the class.
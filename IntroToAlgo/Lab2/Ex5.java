/*
QUESTION 5:
WRITE A JAVA CODE THAT WILL CALCULATE THE SUM OF ALL NUMBERS BETWEEN 1 AND 10 USING A FOR LOOP.
*/

/**
 * Aouthor omerjava
 */

 import java.util.*;

 public class Ex5{

     public static void main (String[] arg){
         // 1ST WAY:
         // int n = 10;
         // System.out.println(n*(n+1)/2);  math rule 1+2+3+4+5+6+....+n-1+n = n(n+1)/2

         // 2ED WAY:
         //int i;
         //int sum = 0;
         //for (i = 1; i<=10; ++i){
         //   sum = sum + i;
         //}

         // 3RD WAY:
           int i=1;       // for while loop we have to initialize i
           int sum = 0;
           while(i<=10){
               sum = sum + i;
               ++i;    // loop controler
           }

            System.out.println(sum);  // print result
     }
 }
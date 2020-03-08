/* A positive integer is called perfect number if it is equal to the sum of all its positive divisors, excluding itself.

For example,
6 is a perfect number because 6=1+2+3.
The next is 28=14+7+4+2+1

Write a method named perfect it takes an integer number as input parameter and determines if it is a perfect number or not.

	Complete the program with main method, which asks the user to enter an integer number , invokes perfect method and displays the result.
*/

import java.util.*;

public class test2 {

    public static void main (String[] arg) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("insert a number please: ");
        num = input.nextInt();
        num = ( num < 0 ? -num : num);

        System.out.println( " is " + num + " perfect number ?  " + perfect(num));
    }

public static boolean perfect (int n) {
     int i = 1;
     int sum = 0;
    while (i < n) {
        if (n % i == 0 )
            sum = sum + i; // all numbers divisible by 1 and by itself
            i++;
    }
    if (n == sum)      //  equal sign ==  not assigning sign =
        return true;
    else
        return false;
}
}
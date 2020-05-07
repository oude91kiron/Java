/* program with method that take to integers and returns their greatest common divisor (GCD) */

import java.util.*;
import java.util.Scanner;

public class test {

    public static void main (String[] args) {

         Scanner input = new Scanner(System.in);  // you have to define the object before calling its method ".nextInt()"

        System.out.println("Enter the first number: ");
        int  num_1 = input.nextInt();

        System.out.println("Enter the second number: ");
        int  num_2 = input.nextInt();

      System.out.println("The greatest common diviser of " + num_1 + " and " + num_2 + ": " + gcd(num_1,num_2));

    }

public static int gcd (int num_1, int num_2) {

    int gcd = 1;       // very importent to initial the veriable
    int k = 1;         // very importent to initial the veriable

    while (k <= num_1 && k<= num_2) {
        if (num_1 % k == 0 && num_2 % k == 0) {
            gcd = k;
        }
    k++;
    }
    return gcd;
}
}
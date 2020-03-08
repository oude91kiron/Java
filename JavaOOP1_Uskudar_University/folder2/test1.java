/*Write a java method named integerPower that returns the value of base^exp

Assume that exponent is a positive, nonzero integer, and base is an integer.

Complete the program with main method, which asks the user to enter base and exponent, invokes integerPower method and displays the result.
*/

import java.util.*;

public class test1 {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("insert a positive integer number ");
    int base = input.nextInt();
    base = (base < 0 ? -base : base); // to convert the nigative number to positive number

    System.out.println("insert a positive integer number ");
    int exp = input.nextInt();
    exp = (exp < 0 ? -exp : exp);

    System.out.println("This is the result of (base^exp) : " + integerPower(base, exp) );
}

public static int integerPower(int b, int e) { // you have to verify the arguments of the method int b, int e
    int result = 1;
    for (int i = 0; i < e; i++) {
         result = result * b;
    }
    return result;
}
}
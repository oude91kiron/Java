/* Writae a method that takes 2 integers as input parameters,
computes and returns their greatest common divisor (GCD).
 */
import java.util.*;
import java.util.Scanner;

public class test6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(num_1, num_2));
    }
public static int gcd(int num_1, int num_2) {
  int gcd = 1; // Initial gcd is 1
  int k = 1; // Possible gcd
  while (k <= n1 && k <= n2) {
    if (n1 % k == 0 && n2 % k == 0)
        gcd = k; // Update gcd
    k++;
   }
   return gcd; // Return gcd
}
}


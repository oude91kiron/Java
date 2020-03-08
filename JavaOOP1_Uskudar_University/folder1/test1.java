/* this program asking user to sum two integers */

import java.util.*;
import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

       int number1 = (int) (Math.random() * 100);
       int number2 = (int) (Math.random() * 100);

        System.out.println("What is "+ number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 + number2 == answer)
        System.out.println("Your are correct, well done :-) ");
        else
        System.out.println("Your answer in wrong\n" + number1 + " + "+ number2 + " should be equel to: "+ (number1+number2));
    }
}
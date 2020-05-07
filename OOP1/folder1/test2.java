import java.util.*;
import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        System.out.println("What is the tempruter outside ? ");
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();

        if (temp > 25)
        System.out.println("I suggest you swim ");
        else if (temp <=25 && temp >= 18)
        System.out.println("You can Jogging ");
        else if (temp<=17 && temp>=11)
        System.out.println("Going to cinema is the best ");
        else if (temp<=10 && temp>=0)
        System.out.println("you can go to skiing ");
        else
        System.out.println("Best time to sleep or fucking your girlfriend ");
    }
}
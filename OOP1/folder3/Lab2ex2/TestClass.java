
import java.util.*;

public class TestClass {
    public static void main(String[] arg) {

        BankAccount cost1 = new BankAccount();  // creating costumer one object

        cost1.owner = "Oude Aloudh";
        cost1.balance = 1000000;
        cost1.aType = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the owner: ");
        String new_name = input.nextLine();                       // objectName.nextLine(); to take more than one string (full name)

        System.out.println("Enter the type of your account: ");
        int newAtype = input.nextInt();

        System.out.println("------------------Output----------------");

        BankAccount cost2 = new BankAccount(new_name, newAtype );


        cost1.info();

        cost1.addMoney(500000);

        cost1.info();

        cost1.addMoney(-350000);

        cost1.info();

        System.out.println("----------------------------------------");

        cost2.info();

        cost2.addMoney(-555);

        cost2.info();
    }
}
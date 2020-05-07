
import java.util.*;

public class TestAccount {
    public static void main(String[] arg) {

        Account ac001 = new Account(20000);

        ac001.annualInterestRate = 4.5;

        ac001.withdraw(2500);

        ac001.deposit(3000);

        System.out.println("Account: \n" + "ID: " + ac001.accountId + "\nDate: " + ac001.dateCreated + "\nInterestRate: "
        + ac001.annualInterestRate + "\nBalance: " + ac001.getBalance() + "\n");

        for (int i = 0; i<=30; i++) {
        int ran = (int) (Math.random() * 11 - 5);
        System.out.println(ran);
        }
    }
}
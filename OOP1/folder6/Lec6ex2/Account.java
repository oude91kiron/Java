
import java.util.*;

public class Account {

    private static int accountCounter = 1000;

    public final int accountId;
    private double balance;
    public double annualInterestRate;
    public Date dateCreated;

    public Account() {
        this(0.0);
    }

    public Account(double newBalance) {

        this.accountId = ++accountCounter;
        this.balance = newBalance;
        this.dateCreated = new Date(System.currentTimeMillis());
        this.annualInterestRate = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double value) {
        balance -= value;
    }

    public void deposit(double value) {
        balance += value;
    }
}
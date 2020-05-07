
import java.util.*;

public class BankAccount {
    String owner;
    double balance;
    int aType;

public BankAccount() {
    owner = "";
    balance = 0.0;
    aType = 0;
}

public BankAccount(String newOwner, int newAtype) {
    owner = newOwner;
    balance = 10000.0;
    aType = newAtype;
}
public void info() {
    System.out.println("Account Owner: "+owner+"\nAccount Balance: "+balance+"$"+"\nAccount Type: "+aType);
}

public void addMoney(double a) {
    balance = balance + a;
}
}



import java.util.*;

public class Student {
    String name;
    int age;
    boolean isJunior;
    char gender;

public Student() {
    name = "";
    age = 0;
    isJunior = false;
    gender = 'm';
}

public void info() {
    System.out.println("Student name is: "+ name + "\nAge: "+age+"\nGender: "+gender+"\nJunior: "+isJunior+ "\n");
}
}
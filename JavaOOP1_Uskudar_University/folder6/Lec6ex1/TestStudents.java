
import java.util.*;

public class TestStudents {
    public static void main(String[] arg) {

        Students s1 = new Students("Oude", 190209074);

        s1.setGpa(3.98);  // s1.setGpa = 3.98; it is not valid cuz Gpa private attribute

        System.out.println("\nStudent Name: " + s1.getName() + "\n");

        System.out.println(s1.toString());

        // cuz 'foo' default (package-private) we can access it from outside of his class

        s1.foo = 5;

        System.out.println("Default access test: " + s1.foo );
    }
}
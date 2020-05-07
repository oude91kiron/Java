
import java.util.*;

public class Teststudent {
    public static void main(String[] arg) {

        Student s = new Student();

        //System.out.println(s.age);
        //System.out.println(s.name);

        s.name = "Ayşe";
        s.age = 15;
        s.isJunior = true;
        s.gender = 'f';       // use this '' with char data type not this ""

      //  System.out.println(s.age);
      //  System.out.println(s.name);

        s.info();
    }
}
/*
create a student object with age: 18, name: Ali
Add this student object to ArrayList
Ask user to enter age and name of the student, create a student object and add it to the ArrayList. Repeat this procedure 3 times.
Delete student which is found at index 2
Print the name and age information of all students
*/

import java.util.*;

public class Tstudent{
    public static void main(String[] arg){

        ArrayList<Student> listOfStudents = new ArrayList<Student>();
        Student s1 = new Student(18 , "Ali");
        listOfStudents.add(s1);
        // we can add element to specific index by using nameOftheArrayList.add(index, element)

        Student s2 = listOfStudents.get(0);

        Student s3 = new Student(29, "Oude");
        listOfStudents.set(0, s3);
        System.out.println("Name: "+ listOfStudents.get(0).getName());
        System.out.println("Name: "+ s2.getName());

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++){

            System.out.println("Enter the name of the student: ");
            String name = input.next();
            System.out.println("Enter the age of the student: ");
            int age = input.nextInt();
            Student z = new Student(age, name);
            listOfStudents.add(z);
        }
        listOfStudents.remove(2);

        for (int i = 0; i < listOfStudents.size(); i++){
            Student a = listOfStudents.get(i);
            System.out.println("Name: " + a.getName() + " ___||___ Age: " + a.getAge() + "\n");
    }
            String s = listOfStudents.toString();
            System.out.println("The Array list as a String: " + s);
}
}
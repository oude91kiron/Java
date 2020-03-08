/*-----------------------------------
Implement the following class.      -
************ Student ************** -
-age: int                           -
-name: String                       -
-noOfStudents: int                  -
+Student()                          -
+Student(age:int, name: String)     -
+getAge():int                       -
+setAge(age:int): void              -
+getName(): String                  -
+getNoOfStudents():int              -
+setName(name:String):void          -
-----------------------------------*/

import java.util.*;

public class Student {
    private int age;
    private String name;
    private static int noOfStudents=0;

public Student(){
    noOfStudents++;
}

public Student(int age, String name) {
    this.age = age;
    this.name = name;
    noOfStudents++;
}

public int getAge() {
    return age;
}

public void setAge(int age){
    this.age = age;
}

public String getName() {
    return name;
}

public void setName(String name){
    this.name = name;
}

public int getNoOfStudents(){
    return noOfStudents;
}
}



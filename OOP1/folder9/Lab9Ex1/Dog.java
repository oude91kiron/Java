/*-----------------------------------------------------------
Dog                                                         -
-loc: int                                                   -
-name: String                                               -
-ownerName: String                                          -
-age: int                                                   -
-count:int                                                  -
+Dog(owner: String)                                         -
+Dog(loc:int, name:String, ownerName:String, age:int)       -
+toString():String                                          -
+equals(d:Dog):boolean                                      -
+move(nloc:int):void                                        -
+getCount():int                                             -
+getLoc():int                                               -
+setLoc(loc:int):void                                       -
+getName(): String                                          -
+setName(name:String): void                                 -
+getOwnerName(): String                                     -
+setOwnerName(ownerName:String): void                       -
+getAge():int                                               -
+setAge(age:int):void                                       -
-----------------------------------------------------------*/

import java.util.*;

public class Dog {

    private int loc = 0;
    private String name = "";
    private String ownerName = "";
    private int age = 0;
    private static int count = 0;

public Dog(String owner){
    this.ownerName = owner;
    count++;
}

public Dog(int loc, String name, String ownerName, int age){
    this.loc = loc;
    this.name = name;
    this.ownerName = ownerName;
    this.age = age;
    count++;
}

public String info(){     // ** don't use toString as a name for the method that will cuz a non-fatal error
    String info = "";

    info += "Name: "+ this.name + "\n";
    info += "Age: "+ this.age + "\n";                           // ** Strings concatenation
    info += "Owner: "+ this.ownerName + "\n";

    return info;
}

public boolean equal(Dog d){
    return (d.getName() == this.name && d.getAge() == this.age && d.getOwnerName() == this.ownerName);
    //return this.name == d.getName() && this.age == d.getAge() && this.ownerName == d.getOwnerName();
    //return this.name == d.name && this.age == d.age && this.ownerName == d.ownerName;

}

public void move(int nLoc){
    this.loc += nLoc;                   // ** loc is moved so it has increased by nLoc value so we sum +=
}

public static int getCount(){
    return count;
}

public int getLoc(){
    return loc;
}

public void setLoc(int loc){
    this.loc = loc;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name = name;
}

public String getOwnerName(){
    return ownerName;
}

public void setOwnerName(String ownerName){
    this.ownerName = ownerName;
}

public int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}
}
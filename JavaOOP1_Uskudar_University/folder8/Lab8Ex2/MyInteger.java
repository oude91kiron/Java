/*-------------------------------------------
MyInteger                                   -
---------------------------------------------
-value:int                                  -
-maxInt: int                                -
---------------------------------------------
+MyInteger(value:int)                       -
+getValue():int                             -
+isEven():boolean                           -
+isEven(myInt:MyInteger): boolean           -
+equals(value:int):boolean                  -
+equals(myInt:MyInteger):boolean            -
+add(value:int):void                        -
+add(myInt:MyInteger):void                  -
+info():String                              -
-----------------------------------------------------------------------------------------------------------------------------------------
Constructor:  check that value is not greater than maxInt value (hint: value cann’t be greater than maxInt)                             -
getValue: returns the value                                                                                                             -
isEven: checks value is even or not                                                                                                     -
isEven: static method returns true if the value of the MyInteger object is even.                                                        -
equals: that returns true if the value in the object is equal to the specified value.                                                   -
equals: returns true if the value of the MyInteger object is equal to value of the caller (this) object                                 -
add: adds parameter value to data field value, check that new value does not exceed the maxInt value                                    -
add: adds the value of another MyInteger object to the caller (this) object, check that new value does not exceed the maxInt value      -
info: string representation of the value                                                                                                -
---------------------------------------------------------------------------------------------------------------------------------------*/

import java.util.*;

public class MyInteger {

    private int value;
    private static int maxVal = 1000;

public MyInteger(int value) {
    if (value > maxVal)
       this.value = maxVal;
    else
        this.value = value;
}

public int getValue(){
    return value;
}

public boolean isEven(){
    return this.value % 2 == 0;
}

public static boolean isEven(MyInteger myInt){
    return myInt.value % 2 == 0;
}

public boolean equals(int value){
    return this.value == value;
}

public boolean equals(MyInteger myInt){
    return this.value == myInt.value;
}

public int add(int value){
    this.value += value;
    // value cant be greater than maxVal so
    if (this.value > maxVal){
        this.value = maxVal;
    }
    return this.value;
}

public int add(MyInteger myInt){
    this.value += myInt.value;
    // value cant be greater than maxVal so
    if (this.value > maxVal){
        this.value = maxVal;
    }
    return this.value;
}

public String info(){
    return " Value is: " + value;
}
}
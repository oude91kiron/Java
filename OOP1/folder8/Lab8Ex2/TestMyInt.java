/*---------------------------------------------------------------
Create MyInteger object myInt1 where value is 24                -
Call info method for myInt1                                     -
Check myInt1 is even or not (use static method)                 -
Create a second object myInt2 where value is 35                 -
Call info method for myInt2                                     -
Check and display myInt1 and myInt2 are equal to each other     -
Add myInt1 to myInt2                                            -
Call info method for myInt2                                     -
---------------------------------------------------------------*/

public class TestMyInt {
    public static void main(String[] arg){

        MyInteger myInt1 = new MyInteger(24);
        System.out.println("myInt1 " + myInt1.info());
        System.out.println("");

        boolean isEven = MyInteger.isEven(myInt1);         // isEven called by the class name cuz it is static method
        System.out.println("Is myInt1 even ? :" + isEven);
        System.out.println("");

        MyInteger myInt2 = new MyInteger(50);
        System.out.println("myInt2 " + myInt2.info());
        System.out.println("");

        boolean equals = myInt1.equals(myInt2);
        System.out.println("Does myInt1 equal to myInt2 ? " + equals);
        System.out.println("");

        MyInteger myInt3 = new MyInteger(myInt1.add(myInt2));
        System.out.println("The sum of myInt1 & myInt2 is: " + myInt3.info());
        System.out.println("");

    }
}
/*---------------------------------------------------------------------------------------------------------------
Write a Java method called printP that will print the following pattern BASED ON YOUR OWN NAME on the screen; ---
THE FOLLOWING PATTERN IS JUST AN EXAMPLE WITH NAME “TUGCE”.                                                     -
SİNCE NAME TUGCE HAS 5 LETTERS THE PATTERN CONTAINS 5 ROWS AN 5 COLUMNS AND THE DİAGONAL CONTAINS THE NAME.     -
IF THE NAME WAS ALI, THE PATTERN SHOULD CONTAIN 3 ROWS AND 3 COLUMNS.                                           -
1)	In method printP                                                                                            -
a.	Define a string that contains 	YOUR NAME.                                                                  -
b.	Write NESTED FOR LOOPS to print the pattern on the screen.                                                  -
2)	You should also write a main method where your program will call the method printP.                         -
                                                                                                                -
EXAMPLE WITH NAME ALI                                                                                           -
A _ _                                                                                                           -
_ L _                                                                                                           -
_ _ I                                                                                                           -
                                                                                                                -
---------------------------------------------------------------------------------------------------------------*/

import java.util.*;

public class ExamQ1 {

    private static final String name = "Odey";

    public static void main(String[] args) {

        printP();
    }


public static void printP(){

    // rows loop
     for (int line = 1; line <=4; ++line){

         // line elemnts loop
         for (int i = 1; i<= line - 1; ++i) {
             System.out.print("-");
         }
         // name letters
            System.out.print(name.charAt(line-1));

         for (int i = 1; i<= -1 * line + 4; ++i){  // use for loop table
             System.out.print("-");
         }
         System.out.println();

     } // end rows loop
    }
}

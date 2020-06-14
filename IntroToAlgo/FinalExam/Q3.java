/*-------------------------------------------------------------------------------
QUESTION 3 [35 POINT]                                                           -
Write a method called longestName that accepts a Scanner for the console        -
and an integer n as parameters and prompts the user for n names, then prints    -
the longest name (the name that contains the most characters) in the format     -
shown below, which might result from a call of longestName(console,3):          -
                                                                                -
Name 1? Tugce                                                                   -
Name 2? Ali                                                                     -
Name 3? Cem                                                                     -
Tugce’s name is longest                                                         -
-------------------------------------------------------------------------------*/

import java.util.*;

public class Q3 {
    public static void main(String[] args){
         // create scanner class object.
        Scanner console = new Scanner(System.in);

        // call the method
        longestName(console, 3);

    } // End of the main method.

public static void longestName(Scanner console, int numOfNames) {

    // ask user for the first name.
    System.out.print("name #1? ");

    // initializing the variable
    String name = console.next();
    boolean sameLen = false;
    int maxLength = name.length();
    String longestName = name.toLowerCase();

    for (int i = 2; i <= numOfNames; i++) {
        System.out.printf("name #%d? ", i);
        name = console.next();
        if (name.length() > maxLength) {
            maxLength = name.length();
            longestName = name.toLowerCase();
            sameLen = false;
        } else if (name.length() == maxLength){
            sameLen = true;
        }
    }

    longestName = longestName.substring(0,1).toUpperCase() + longestName.substring(1);
    if (sameLen == false)
    System.out.println(longestName + "'s name is longest");

    if (sameLen == true) {
        System.out.println("(All the names have the same length!)");
    }
}
} // End of the class
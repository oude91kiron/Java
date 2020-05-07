/*
Use nested for loops to produce the following output.

#================#
|      <><>      |
|    <>....<>    |
|  <>........<>  |
|<>............<>|
|<>............<>|
|  <>........<>  |
|    <>....<>    |
|      <><>      |
#================#

*/

import java.util.*;

public class Lex59 {

    public static void main(String[] arg) // Main method
    {
        line();
        topPart();
        bottomPart();
        line();
    }

    // 1st method that prints the first and the last line of the pattren.
    public static void line(){
        System.out.println("#================#");
    }

    // 2ed method that prints the top part of the pattren.
    public static void topPart(){
        for(int line=1; line<=4; ++line)
        {
            System.out.print("|");
            for(int space=1; space<= line * -2 + 8; ++space)
            {
                System.out.print(" ");
            }
            // after printing the spaces for each line.
            System.out.print("<>");

            for(int dots=1; dots<=line * 4 - 4; ++dots)
            {
                System.out.print(".");
            }
            // after printing the dots for each line.
            System.out.print("<>");

             for(int space=1; space<= line * -2 + 8; ++space)
            {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    // 3rd method that print the bottom part of the pattren.
    public static void bottomPart(){
        for(int line=1; line<=4; ++line)
        {
            System.out.print("|");  // at the start of every new line.
            // print the spaces
            for(int spaces=1; spaces<=line * 2 - 2; ++spaces)
            {
                System.out.print(" ");
            }
            System.out.print("<>"); // print <> after the spaces
            // print the dots
            for(int dots=1; dots<= line * -4 + 16; ++dots)
            {
                System.out.print(".");
            }
            System.out.print("<>"); // print <> after the dots
            for(int spaces=1; spaces<=line * 2 - 2; ++spaces)
            {
                System.out.print(" ");
            }
            System.out.println("|"); // print | at the end
        }
    }

}

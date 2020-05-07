/*
Consider the task of drawing the following scalable figure:

+/\/\/\/\/\/\/\/\/\/\+
|                    |
|                    |
|                    |
|                    |
|                    |
+/\/\/\/\/\/\/\/\/\/\+

*/

import java.util.*;

public class Lex69 {

    public static final int height = 5; // constant variable

public static void main(String[] arg) {

    line();  //  method that print first line.
    body();  //  method that print the body of the pattren.
    line();  //  method that print second line
}

// 1st method that print first line.
public static void line(){
    System.out.print("+");
    for (int i = 1; i <= height * 2; ++i)
    {
        System.out.print("/\\");
    }
    System.out.println("+");
}

// 2ed method that print the body of the pattren.
public static void body(){
    for (int line=1; line<= height; ++line)
    {
        System.out.print("|");
        for (int spaces = 1; spaces <= height * 4; ++spaces)
        {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
}
/*
write a code to print the following pattren:
....1
...2.
..3..
.4...
5....

*/

import java.util.*;

public class Lex54 {

    public static void main(String[] arg){

        // First for loop represent the number of lines.
        for(int line=1; line <=5; ++line)
        {
            // Second for loop that prints dotes (1st line ....  , 2sd line ... , etc)
            for(int j=(-1 * line + 5); j>=1;  --j)
            {
                System.out.print(".");
            }
            // print the number of the line
            System.out.print(line);
            // print the rest of the dotes after the line number
            for(int k=1; k<=line-1; k++)
            {
                System.out.print(".");
            }
            // start new line
            System.out.println();
        }
    }
}
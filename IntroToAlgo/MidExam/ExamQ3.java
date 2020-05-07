/*-----------------------------------------------------------------------------------------------------------------------
Consider a String stored in a variable called name that stores a person’s first and last name (e. g., “Marla Singer”).  -
Write the expression that would produce the last name followed by the first initial (e. g., “Singer, M.”).              -
-----------------------------------------------------------------------------------------------------------------------*/

import java.util.*;

public class ExamQ3 {
    public static void main(String[] args){
        String name = "Marla Singer";
        String lastName = name.substring(name.indexOf(" ") + 1);
        String firstChar = name.substring(0,1);
        System.out.println(firstChar+", "+lastName);
    }
}

/*---------------------------------------------------------------------------------------
Write a method called removeShorterStrings that accepts an ArrayList of strings         -
as a parameter and removes from each pair of values the shorter string in the pair.     -
If the list is of odd length, the final element is unchanged. For example,              -
suppose that a list contains ["four", "score", "and", "seven", "years", "ago", "our"].  -
In the first pair ("four" and "score") the shorter string is "four". In the second pair -
("and" and "seven") the shorter string is "and". In the third pair ("years" and "ago")  -
the shorter string is "ago". Your method should remove these shorter strings,           -
changing the list to store ["score", "seven", "years", "our"].                          -
If both strings in a pair have the same length, remove the first string in the pair.    -
---------------------------------------------------------------------------------------*/

/**
 * Author: Oude Aloudh
 *
 **/
import java.util.*;

public class Q4{
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
        words.add("our");

        System.out.println("Befor: " + words);
        // call the method
        removeShorterStrings(words);
        System.out.println("After: " + words);
    } // End of main method

        public static void removeShorterStrings(ArrayList<String> list){

            for (int i = 0; i < list.size()-1; ++i){
                String s1 = list.get(i);
                String s2 = list.get(i+1);

                if(s1.length() <= s2.length()){
                    list.remove(i);
                } else {
                    list.remove(i+1);
                }
            }
    } // End of removeDuplicates method

} // End of the class


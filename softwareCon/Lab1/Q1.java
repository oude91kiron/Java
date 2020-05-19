/*-------------------------------------------------------------------------------
Question 1                                                                      -
Write a method called swapPairs that switches the order of values               -
in an ArrayList of strings in a pairwise fashion.                               -
Your method should switch the order of the first two values,                    -
then switch the order of the next two, then the next two, and so on.            -
If the number of values in the list is odd,                                     -
the method should not move the final element. For example, if                   -
the list initially stores ["to", "be", "or", "not", "to", "be", "hamlet"],      -
your method should change the                                                   -
list's contents to ["be", "to", "not", "or", "be", "to", "hamlet"].             -
-------------------------------------------------------------------------------*/

/**
 * Author: Oude Aloudh
 *
 **/

 import java.util.*;

public class Q1 {
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        words.add("to");
        words.add("be");
        words.add("or");
        words.add("not");
        words.add("to");
        words.add("be");
        words.add("hamlet");
        words.add("Oude");

        // call the methods swapPairs
        System.out.println("The original list: "+ words);
        swapPairs(words);
        System.out.println("Swaped list:" + words);
        System.out.println();
    }

    public static void swapPairs(ArrayList<String> list){
        // initializing while loop controller
        int i = 0;
        while ( i < list.size()-1) {        // last index is list.size()-1
            // create a temp variable to hold value temporarily
            String temp = list.get(i);
            // replace the value with the next one ["be","be"]
            list.set(i, list.get(i+1));
            // replace the next value with the previous one that
            // we stored in temp variable ["be","to"]
            list.set(i+1, temp);
            // move to the next pair
            i+=2;
        }
    }
}
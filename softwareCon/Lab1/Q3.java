/*---------------------------------------------------------------------------
Write a method called removeDuplicates that takes as a parameter a sorted   -
ArrayList of strings and eliminates any duplicates from the list.           -
For example, if the list stores thevalues                                   -
["be", "be", "is", "not", "or", "question", "that", "the", "to", "to"]      -
before the method is called, it should store the values                     -
["be", "is", "not", "or", "question", "that", "the", "to"]                  -
after the method finishes executing. Because the values will be sorted,     -
all of the duplicates will be grouped together. Assume that the ArrayList   -
contains only String values, but keep in mind that it might be empty.       -
---------------------------------------------------------------------------*/

/**
 * Author: Oude Aloudh
 *
 **/

 import java.util.*;

public class Q3{
    public static void main(String[] args){

        ArrayList<String> words = new ArrayList<String>();
        words.add("be");
        words.add("be");
        words.add("is");
        words.add("not");
        words.add("or");
        words.add("question");
        words.add("that");
        words.add("the");
        words.add("to");
        words.add("to");
        words.add("to");
        words.add("to");
        System.out.println("Befor: " + words);
        // call the method
        removeDuplicates(words);
        System.out.println("After: " + words);
    } // End of main method

    public static void removeDuplicates(ArrayList<String> list){
        int index = 0;
        while(index < list.size()-1){
            String s1 = list.get(index);
            String s2 = list.get(index+1);

            if(s1.equals(s2)){
                list.remove(index+1);
            }else{
                index++;
            }
        }
    } // End of removeDuplicates method

} // class end
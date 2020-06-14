/*----------------------------------------------------------
1.Write a program to count the occurrences of each word in  -
a large text file(e.g. Moby Dick or the King James Bible).  -
2.Report all words that appeared in the book at least 2000  -
times, in alphabetical order.                               -
-----------------------------------------------------------*/

// Use maps to implement a word count, so that the use
// can see which words occure the most in the book Moby-Dick.

import java.util.*;
import java.io.*;

public class lecEx46 {

    public static final int occur = 2000;

    public static void main (String[] args) throws FileNotFoundException {

        // Read the book into Map
        Scanner in = new Scanner(new File("newbook.txt"));
        Map<String, Integer> wordCountMap = getCountMap(in);//method take "in" as argument

        for (String word: wordCountMap.keySet()){
            int count = wordCountMap.get(word);
            if (count > occur){
                System.out.println(word + " occur " + count + " times. ");
            }
        }
    }

    // Method return each word and the number of it's iterations in the book
    public static Map<String, Integer> getCountMap(Scanner in){

        Map<String, Integer> wordCountMap = new TreeMap<String, Integer>();

        while(in.hasNext()){
            String word = in.next().toLowerCase();
            if (wordCountMap.containsKey(word)){
                // never seen this word befor
                wordCountMap.put(word, 1);
            }
            else
            {
                // seen this word before
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            }
        }
        return wordCountMap;
    }
}
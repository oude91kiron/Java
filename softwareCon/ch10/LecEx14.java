/* Write a program that reads a file and displays the               -
words of that file as a list                                        -
                                                                    -
1- display all words.                                               -
2- display them in reverse order.                                   -
3- display them with all plurals (ending with 's') capitalized.     -
4- display them with all plural words removed.                      -
                                                                    -
-------------------------------------------------------------------*/

/**
 * Author: Oude Aloudh
 *
 **/

 import java.util.*;
 import java.io.*;

 public class LecEx14 {
     public static void main(String[] args) throws FileNotFoundException {

        int count = 0;

        // declear list to contain all words in the file data.txt
         ArrayList<String> allWords = new ArrayList<String>();
         // creat an object of the File class
         Scanner input = new Scanner(new File("words.txt"));

         //  iterate the file until the end
         while(input.hasNext()){
             // assign every word in the file to the variable 'word' one by one
             String word = input.next();
             // add every word to the ArrayList
             allWords.add(word);
             count++;
         } // end while loop
         // display all words
         System.out.println("1:");
         System.out.println(allWords);
         System.out.println();


         // 2- display them in reverse order.
         ArrayList<String> revList = new ArrayList<String>();

         for(int i = count; i > 0; i--)
         revList.add(allWords.get(i-1));

         System.out.println("2:");
         System.out.println(revList);
         System.out.println();

         // 3- display them with all plurals (ending with 's') capitalized.

                    /**
                     * To Do
                     *
                     * */


        // 4- display them with all plural words removed.
        for (int j = 0; j < allWords.size(); ++j){
            String word = allWords.get(j);
            if( word.endsWith("s")) {
                allWords.remove(j);
                --j;
        }
        }

         System.out.println("4:");
         System.out.println(allWords);
         System.out.println();

     }
 }


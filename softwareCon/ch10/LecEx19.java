/* Write a program that reads a file and displays the        -
numbers of that file as a list                               -
                                                             -
1- Prints the average of the numbers.                        -
2- Prints the highest and lowest number.                     -
3- Filter out all the even numbers                           -
                                                             -
------------------------------------------------------------*/

/**
 * Author: Oude Aloudh
 *
 **/

 import java.util.*;
 import java.io.*;

 public class LecEx19 {
     public static void main(String[] args) throws FileNotFoundException {

         ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
         Scanner input = new Scanner(new File("numbers.txt"));
         while(input.hasNext()){
             int number = input.nextInt();
             listOfNumbers.add(number);
         }

         System.out.println("1:");
         System.out.println(listOfNumbers);
         System.out.println();

         // highestLowestNum(listOfNumbers);
         System.out.println("2: TO DO...");
         System.out.println();

         filterEvens(listOfNumbers);
         System.out.println("3:");
         System.out.println(listOfNumbers);
         System.out.println();
     }

     // highestLowestNum methods
     /*
     public static void highestLowestNum(ArrayList list){

         To Do...
     }
     */

     // filterEvens methods to remove the even numbers
     public static void filterEvens(ArrayList list){
         for (int i = 0; i< list.size(); i++){
             // note: we have to convert the object to integer
             int num = (int)list.get(i);
             if (num % 2 == 0){
                 list.remove(i);
                 i--;
             }
         }
     }
 }
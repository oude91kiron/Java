/*Write a method called scaleByK that takes an                  -
ArrayList ofintegers as a parameter and replaces                -
every integer ofvalue k with k copies of itself.                -
For example, if the list stores the values                      -
[4, 1, 2, 0, 3] before the method is called,                    -
it should store the values [4, 4, 4, 4, 1, 2, 2, 3, 3, 3]       -
after the method finishes executing.                            -
Zeroes and negative numbers should be removed                   -
from the list by this method.                                   -
-------------------------------------------------------------  */

/**
 * Author: Oude Aloudh
 *
 **/

 import java.util.*;

 public class Q2{
     public static void main(String[] args){

         ArrayList<Integer> numbers = new ArrayList<Integer>();
         numbers.add(4);
         numbers.add(1);
         numbers.add(0);
         numbers.add(2);
         numbers.add(3);
         numbers.add(-5);

         System.out.println("The list befor: "+ numbers);
         System.out.println();

         // call the method scaleByK()
         scaleByK(numbers);
         System.out.println("The list after: "+ numbers);

     }

     public static void scaleByK(ArrayList<Integer> list){

         ArrayList<Integer> tempList = new ArrayList<Integer>();

         for (int i = 0; i< list.size()-1; ++i){
             for(int j = list.get(i); j>0; --j){

                 tempList.add(list.get(i));
             }
         }
         list.clear();
         list.addAll(tempList);
     }

     /* teacher solution:
     public static void scaleByK(ArrayList<Integer> list){
        for(int i = list.size()-1; i>=0; i--){
            int k = list.get(i);
            list.remove(i);
            for(int j=0; j<k; j++){
                list.add(i, k);
            }
        }
    }
     */
 }
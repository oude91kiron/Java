/*-----------------------------------------------------------------------
Write a method called partition that accepts a list of integers         -
and an integer value E as its parameter, and rearranges (partitions)    -
the list so that all the elements with values less than E occur         -
before all elements with values greater than E.                         -
The exact order of the elements is unimportant,                         -
so long as all elements less than E appear before all                   -
elements greater than E. For example, for the linked                    -
list (15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9), one acceptable         -
ordering of the list after a call of partition(list, 5)would be         -
(–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9). You may assume that the     -
list contains no duplicates and does not contain the element value E.   -
-----------------------------------------------------------------------*/

import java.util.*;

public class Q1 {
    // Main method
    public static void main(String[] args){

        // Create a list
        LinkedList<Integer> myList = new LinkedList<Integer>();

        myList.add(5);
        myList.add(-4);
        myList.add(18);
        myList.add(7);
        myList.add(47);
        myList.add(-1);
        myList.add(0);
        myList.add(9);

        // call method
        partition(myList, 6);
    } // End of main method

    // partition method
    public static void partition (LinkedList<Integer> ls, int val ){

        List<Integer> fixedList = new LinkedList<Integer>();

        Iterator<Integer> itr = ls.iterator();

        while(itr.hasNext()){
            int e = itr.next();
            if (e < val){
                fixedList.add(0, e);
            }else{
                fixedList.add(e);
            }
        }
        System.out.println(fixedList);
    } // End of the method
} // End of the class
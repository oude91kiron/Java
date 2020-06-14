/*-----------------------------------------------------------------------------------------------
Suppose you have a deck of cards represented as a linked list. You can perfectly shuffle        -
that list by cutting it at the halfway point, then interleaving the two halves by               -
alternating back and forth between the cards. For example, suppose you want to                  -
perfectly shuffle this sequence:                                                                -
1 2 3 4 5 6 7 8 9 10                                                                            -
You'd start by splitting it into two halves, like this:                                         -
1 2 3 4 5           6 7 8 9 10                                                                  -
Then, you'd interleave the halves, like this:                                                   -
6 1 7 2 8 3 9 4 10 5                                                                            -
The resulting list is said to have been perfectly shuffled. Your job is to write a method       -
that accepts a pointer to a linked list with an even number of elements, then rearranges        -
the elements in that list so that they're perfectly shuffled.                                   -
---+-------------------------------------------------------------------------------------------*/

import java.util.*;

public class Q1 {
    public static void main(String[] args) {

        List<Integer> myList = new LinkedList<Integer> ();

        // myList 1 2 3 4 5 6 7 8 9 10
        for(int i = 1; i <= 10; i++){
            myList.add(i);
        }
        // Call the method that suffling the list perfectly
        System.out.println(shuffleList(myList));

    } // End of the main method

    public static List<Integer> shuffleList(List<Integer> list) {

        List<Integer> interleaveList = new ArrayList<Integer> ();
        List<Integer> right = new ArrayList<Integer> ();
        List<Integer> left = new ArrayList<Integer> ();

            // right list
            for (int i = 0; i < list.size()/2; i++){
                left.add(list.get(i));
            }
            // left list
            for (int j = list.size()/2 ; j < list.size(); j++){
                right.add(list.get(j));
            }

            // Create interleave List the elements
            for( int k = 0; k < list.size()/2; k++){
                interleaveList.add(right.get(k));
                interleaveList.add(left.get(k));
            }

        //System.out.println(left);
        //System.out.println( right);

        return interleaveList;
    } // End of the method
}

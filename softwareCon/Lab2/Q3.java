/*-----------------------------------------------------------------------
Write a method hasOdd that accepts a set of integers as a parameter     -
and returns true if the set contains at least one odd integer and false -
otherwise. If passed the empty set, your method should return false.    -
-----------------------------------------------------------------------*/

import java.util.*;

public class Q3{
    public static void main(String[] args) {

    Set<Integer> st=new TreeSet<Integer>();

    st.add(12);
    st.add(20);
    st.add(30);

    System.out.println("has odd? " + hasOdd(st));
    }

    public static boolean hasOdd(Set<Integer> set){

        boolean bool = false;

        for(int val: set){

            if(val % 2 != 0){
                bool = true;
            }
        }
        return bool;
    } //End of the method


} // End of the class
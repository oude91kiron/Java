/*-------------------------------------------------------------------------------
Write a method intersect that accepts two maps whose keys are strings and       -
whose values are integers as parameters and returns a new map containing        -
only the key/value pairs that exist in both of the parameter maps. In order     -
for a key/value pair to be included in your result, not only do both maps       -
need to contain a mapping for that key, but they need to map it to the          -
same value. For example, if the two maps passed are                             -
{Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52,     -
Sylvia=95} and {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80,            -
Brian=60, Lisa=83, Sylvia=87}, your method would return the following           -
new map (the order of the key/value pairs does not matter):                     -
{Logan=62, Stefanie=80, Jeff=88, Kim=52}                                        -
-------------------------------------------------------------------------------*/

import java.util.*;

public class Q2{

    // Main method
    public static void main(String[] args){

        Map<String, Integer> mp1 = new HashMap<String, Integer>();
        Map<String, Integer> mp2 = new HashMap<String, Integer>();

    mp1.put("Ayse",19);
    mp1.put("Veli",20);
    mp1.put("Fatma",33);
    mp1.put("Ali",78);
    mp2.put("Ayse",19);
    mp2.put("Veli",20);
    mp2.put("Mehmet",33);
    mp2.put("Aziz",78);

    // call the method
    intersect(mp1,mp2);

    } // End of main

    public static void intersect(Map<String, Integer> mp1, Map<String, Integer> mp2){

        Map<String, Integer> intersectMap = new HashMap<String, Integer>();

        // Iterate throw key set and store each value in a variable
        for(String key: mp1.keySet()){
            int value = mp1.get(key);
            // this for testing purpose
            // System.out.println(key + " + " + val);

            // Check if the key- value pair in the mp1 exist in mp2
            if( mp2.containsKey(key) && (value == mp2.get(key))){

                // if exit put it in a new map
                intersectMap.put(key, value);
            }
        }
        // print the map as a string
        System.out.println(intersectMap.toString());
    }

} // End of the class
/* Creat Map collection to stor five student name with thire
grads iterate throw the Map and delete the failing students
note that the pass grad is 60.
*/

import java.util.*;
import java.io.*;

public class lecEx37 {
    public static void main(String[] args) {

    Map<String, Integer> scores = new TreeMap<String, Integer>();

    scores.put("Oude", 99);
    scores.put("Wael", 36);
    scores.put("mohamad", 58);
    scores.put("Ahmad", 67);
    scores.put("Hasan", 44);
    // create Iterator object that travles the key set of our map
    Iterator<String> itrObj = scores.keySet().iterator();

        while(itrObj.hasNext()){
        String name = itrObj.next();
        System.out.println(name + " got "+ scores.get(name));

        if(scores.get(name) < 60){
            itrObj.remove();
        }
    }
    System.out.println("Exam pased students: ");
    System.out.println(scores);

} // End of main methods
} // End of class
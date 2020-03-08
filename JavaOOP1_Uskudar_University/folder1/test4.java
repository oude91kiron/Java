/* this program find all the numbers divisible by 5 & 6 */

import java.util.Scanner;

public class test4 {

    public static void main (String[] args) {

        int i = 1;
        while ( i <= 1000) {
            i = i + 1;
            if (i % 5 == 0 && i % 6 == 0)
                System.out.println(i);

    }
}
}
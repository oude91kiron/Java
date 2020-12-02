/*------------------------------------------------------------------------------
3. Write a program that accepts sentences from users and return the number of  -
   vowels and consonants in the given sentence.                                -
------------------------------------------------------------------------------*/

import java.util.*;

public class Q3 {

	String line;


    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String line = input.nextLine();

        countVCDS(line);


    }

        public static int [] countVCDS(String line) {
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;

        line = line.toLowerCase();
        for(int i = 0; i < line.length(); ++i)
        {
            char ch = line.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if((ch >= 'a'&& ch <= 'z')) {
                ++consonants;
            }
            else if( ch >= '0' && ch <= '9')
            {
                ++digits;
            }
            else if (ch ==' ')
            {
                ++spaces;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Digits: " + digits);
        System.out.println("White spaces: " + spaces);

        int res[] = {vowels, consonants, digits, spaces};
        return res;

    }

}
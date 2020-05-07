/*
Write java program that print this series on screen.
1 4 9 16 25 36 49 64 81 100
*/

/**
 *
 * @Author omerjava
 */

public class Ex4{
    public static void main(String[] arg){
        int j = 1;
        int val = 0;
        for( int i = 1; i<= 10; ++i)
        {
            val = val + j;              // i = 0 : val = 0 +1 , i = 1: val = 1 + 3
            j+=2;                       // i = 0 : j = 1+2    , i = 1:  J  = 3 + 2
            System.out.print(val+ " ");
        }
        System.out.println();
}
}
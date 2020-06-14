/*-----------------------------------------------
writeSeq(1)     1                               -
writeSeq(2)     1 1                             -
writeSeq(3)     2 1 2                           -
writeSeq(4)     2 1 1 2                         -
writeSeq(5)     3 2 1 2 3                       -
writeSeq(6)     3 2 1 1 2 3                     -
writeSeq(7)     4 3 2 1 1 2 3                   -
writeSeq(8)     4 3 2 1 1 2 3 4                 -
writeSeq(9)     5 4 3 2 1 2 3 4 5               -
writeSeq(10)    5 4 3 2 1 1 2 3 4 5             -
-----------------------------------------------*/


public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        writeSeq( 1);System.out.println();
        writeSeq( 2);System.out.println();
        writeSeq( 3);System.out.println();
        writeSeq( 4);System.out.println();
        writeSeq( 5);System.out.println();
        writeSeq( 6);System.out.println();
        writeSeq( 7);System.out.println();
        writeSeq( 8);System.out.println();
        writeSeq( 9);System.out.println();
        writeSeq(10);System.out.println();

    }

    public static void writeSeq(int n)
    {
        if(n==1)
            System.out.print(1+ " ");
        else if(n==2)
            System.out.print("1 1 ");
        else
        {
            int number=(n+1)/2;
            System.out.print(number+" ");
            writeSeq(n-2);
            System.out.print(number+" ");
        }
    }
}

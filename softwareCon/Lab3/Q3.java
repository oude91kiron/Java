/*-------------------------------------------------------------------
Write a recursive method called sumTo that accepts an integer       -
parameter n and returns a real number representing the sum of       -
the first n reciporcals. In other words, sumTo(n) return            -
(1+1/2+1/3+1/4+1/5+....+1/n). For example,                          -
sumTo(2) should return 1.5. The method should return 0.0 if it      -
is passed the value 0 and throw an IlegalArgumentException          -
if it is passed a value less than 0.                                -
-------------------------------------------------------------------*/

public class Q3 {


    public static void main(String[] args)
    {
        System.out.println(sumReciprocals( 1));
        System.out.println(sumReciprocals( 2));
        System.out.println(sumReciprocals( 3));
        System.out.println(sumReciprocals( 4));
        System.out.println(sumReciprocals( 5));
        System.out.println(sumReciprocals( 6));
        System.out.println(sumReciprocals( 7));
        System.out.println(sumReciprocals( 8));
        System.out.println(sumReciprocals( 9));
        System.out.println(sumReciprocals(10));


    }

    public static double sumReciprocals(int n)
    {
        if(n == 1)
        return 1;
        else
        return 1.0/n + sumReciprocals(n-1);
    }
}

/*-----------------------------------------------------------
Write a for llop that poduces the following output:         -
                                                            -
1 4 9 16 25 36 49 64 81 100                                 -
                                                            -
for more challenge, don't use * multiplication operator.    -
-----------------------------------------------------------*/

public class Ex6 {

public static void main(String[] args)
{
    // solution A
    System.out.println("The square of the natural numbers suing \"*\" operator ");
    for (int i = 1; i<= 10; ++i)
    {
        System.out.print(i * i +" ");
    }
    System.out.println("");

    // solution B
    System.out.println("The square of the natural numbers with out \"*\" operator ");
    for (int i = 1, sequence = 1; i <= 100; sequence += 2, i += sequence)
    {
        System.out.print(i +" ");
    }
    System.out.println();
}
}
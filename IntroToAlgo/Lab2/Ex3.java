/*
WRITE A JAVA CODE TO PRINT ALL NUMBERS BETWEEN 1 TO 100 ON THE SCREEN USING A FOR LOOP.
*/

public class Ex3{
    public static void main(String[] arg){
        for (int i = 1; i<100; ++i)
        {
            if(i % 2 == 0)
            {
            System.out.print(i + ", ");
            }
        }
        System.out.println("100");
    }
}
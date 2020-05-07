/*-----------------------------------------------------------------------------------
Write a program that produces the following output using nested loop. use a class   -
constant to make it possible to change the number of stairs in the figure           -
                                                                                    -
                      o  *******                                                    -
                     /|\ *     *                                                    -
                     / \ *     *                                                    -
                 o  ******     *                                                    -
                /|\ *          *                                                    -
                / \ *          *                                                    -
            o  ******          *                                                    -
           /|\ *               *                                                    -
           / \ *               *                                                    -
       o  ******               *                                                    -
      /|\ *                    *                                                    -
      / \ *                    *                                                    -
  o  ******                    *                                                    -
 /|\ *                         *                                                    -
 / \ *                         *                                                    -
********************************                                                    -
                                                                                    -
-----------------------------------------------------------------------------------*/


public class Ex7
{
    //  variable declarations
    public static int  level = 8;
    public static int spacesBefore = (level - 1) * 5;
    public static int spacesAfter = 0;

    //  start main method
    public static void main(String[] args)
    {
        manOnStairs();
        lastLine();
    } // end of main method


    /* firstLevels method displays a figure as in the Sample output shown
    at end of the program. */
    public static void manOnStairs(){

        for (int steps = 0; steps < level; steps++)
        {
            // draw the first line
            for (int i = 0; i < spacesBefore; i++){
                System.out.print(" ");
            }

            System.out.print(" ");
            System.out.print(" ");
            System.out.print("o");
            System.out.print(" ");
            System.out.print(" ");

            for (int i = 0; i < 6; ++i)
            {
                System.out.print("*");
            }

            for (int i = 0; i < spacesAfter; i++){
                System.out.print(" ");
            }
            System.out.println("*");

            // draw the second line
            for (int i = 0; i < spacesBefore; i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.print("/");
            System.out.print("|");
            System.out.print("\\");
            System.out.print(" ");
            System.out.print("*");

            for (int i = 0; i < spacesAfter + 5; i++){
                System.out.print(" ");
            }
            System.out.println("*");

            // draw the third line
            for (int i = 0; i < spacesBefore; i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.print("/");
            System.out.print(" ");
            System.out.print("\\");
            System.out.print(" ");
            System.out.print("*");

            for (int i = 0; i < spacesAfter + 5; i++){
                System.out.print(" ");
            }
            System.out.println("*");

            // update the number of spaces befor and after the man in each step
            spacesBefore -= 5;
            spacesAfter += 5;
        }


    } // end of manOnStairs methods

    // lastLine to print the last line
    public static void lastLine() {
        for (int i = 0; i < (level + 1) * 5 + 1; ++i)
        {
            System.out.print("*");
        }
        System.out.println("*");
    } // end of lastLine method
} // class end
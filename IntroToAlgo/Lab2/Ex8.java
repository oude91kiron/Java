/*-----------------------------------------------------------------------------------
Write a program that produces the following output using nested loop. use a class   -
constant to make it possible to change the number of stairs in the figure           -
                                                                                    -
            ||                                                                      -
            ||                                                                      -
            ||                                                                      -
            ||                                                                      -
         __/||\__                                                                   -
      __/:::||:::\__                                                                -
   __/::::::||::::::\__                                                             -
__/:::::::::||:::::::::\__                                                          -
|""""""""""""""""""""""""|                                                          -
\_/\/\/\/\/\/\/\/\/\/\/\_/                                                          -
  \_/\/\/\/\/\/\/\/\/\_/                                                            -
    \_/\/\/\/\/\/\/\_/                                                              -
      \_/\/\/\/\/\_/                                                                -
            ||                                                                      -
            ||                                                                      -
            ||                                                                      -
            ||                                                                      -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         |%%||%%|                                                                   -
         __/||\__                                                                   -
      __/:::||:::\__                                                                -
   __/::::::||::::::\__                                                             -
__/:::::::::||:::::::::\__                                                          -
|""""""""""""""""""""""""|                                                          -
                                                                                    -
-----------------------------------------------------------------------------------*/

public class test {

    // Declear the variable
    public static final int size = 4;
    // start Main method
    public static void main(String[] args){

        // Call methods
        verticalLine();
        upperHalf();
        lowerHalf();
        verticalLine();
        middlePart();
        upperHalf();
    }// end main method

    /* static method that print the vertical parallel lines of
    the pattern */
    public static void verticalLine(){
        for (int i = 0; i < size; ++i)
        {
            for (int j = 0; j < (size * 3); ++j)
            System.out.print(" ");


            System.out.print("||");
            System.out.println();

        }
    } // end of verticalLine method

    public static void upperHalf(){
        // loop iterates number of times equal to the size
        for(int i = size -1, m=0; i>=0; --i, ++m){

            // loop that print the spaces
            for(int j = 1; j< 3*i +1; ++j){
                System.out.print(" ");
            }
            System.out.print("__/");

            // loop prints dots (increasing order)
            for (int l = 0; l < 3*m; ++l){
                System.out.print(":");
            }

            System.out.print("||");
            // loop prints dots (increasing order)
            for (int l = 0; l < 3*m; ++l){
                System.out.print(":");
            }
            System.out.print("\\__");
            System.out.println();

        } // end of first for-loop

            // last line in the upper half
            System.out.print("|");
            for (int i = 1; i <= 6 * size; ++i)
                System.out.print("\"");

            System.out.print("|");
            System.out.println();

    } // end the method upperHalf

    //  static method prints the lower half in the top portion
    public static void lowerHalf(){

        // loop iterates number of times equal to the size
        for (int i = size, m = 0; i > 0; --i, ++m){
            // loop to print spaces at the beginning of the line
            for (int k = 1; k <= 2*m; ++k){
                System.out.print(" ");
            }
            System.out.print("\\_");

            // print /\ in a decreasing order
            for (int j = 1; j <= ((2*(i+(size/2))) - 1); ++j){
                System.out.print("/\\");
            }
            System.out.print("_/");
            System.out.println();
        }
    } // end of lowerHalf method

    //  static method prints the middle part
    public static void middlePart(){

        // loop iterates square the time of the size
        for (int i = 0; i < size * size; ++i){
            for (int k = 1; k < ((2 * size) + (size / 2)); ++k){
                System.out.print(" ");
            }
            System.out.print("|");

            // print ^%^ half of the number of the size
            for (int j = 0; j< size/2; ++j){
                System.out.print("%");
            }
            System.out.print("||");
            for (int j = 0; j < size/2; ++j){
                System.out.print("%");
            }
            System.out.print("|");
            System.out.println();
        }
    } // end of middlePart method

} // end of the test class
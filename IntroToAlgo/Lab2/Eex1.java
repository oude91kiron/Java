/*
Extra exrcise Q1:
Write java program that represent Fibonacci series:
1 1 2 3 5 8 13 21 34 55 89 144
*/

/**
 * Author omerjava
 */

 import java.util.*;

 public class Eex1{
     public static void main(String[] arg){

                     //         x y z
                     //     x y z
         int x=1;    // x y z
         int y=1;    // 1 1 2 3 5 8 13 21 34 55 89
         int z;      //   x y z
                     //       x y z

         for(int i=1; i<=20; ++i){
             if(i<3)
             {
                 System.out.print(y + " ");
             }
             else
             {
                 z = x + y ;
                 System.out.print(z+" ");
                 x = y;
                 y = z;
             }
         }
         System.out.println();
     }
 }
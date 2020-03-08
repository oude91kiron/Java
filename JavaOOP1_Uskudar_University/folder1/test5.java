/* Write a program that generates 60 random integers in interval [0,100].
Your program computes the average of the numbers that are divisible by 3.
 */

import java.util.*;

public class test5 {
    public static void main (String[] args) {

        int total=0;
        int random_n;
        int counter=0;
        double  avg;

       for (int i=0; i<61; i++) {
           random_n = (int) (Math.random() * 100);

               if (random_n % 3 == 0) {   // You cant use while here
               total = total + random_n;
               counter++;
           }
      }
             avg = (double) total / counter;
             System.out.println("This is the average of the numbers that are divisible by 3 :" + "( " + avg + " )");
    }
}

/*---------------------------------------------------------
public class Demo{
public static void main(String[] args){
	int sum=0,count=0;
	for(int i=1;i<=60;i++){
     int num = (int)(Math.random()*101);
	  if(num%3==0){
       sum=sum+num;
       count=count+1;
     }
	}
	double avg=(double)sum/count;
	System.out.println("Average: "+ avg);
}
}
-------------------------------------------------------*/
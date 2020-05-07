/*---------------------------------------------------------------------------------------------------
Write a method called sphereVolume that accepts a radius as a parameter and returns the volume      -
ofa sphere with that radius. For example,                                                           -
the call sphereVolume(2.0) should return 33.510321638291124.                                        -
The formula for the volume of a sphere with radius r is the following: v = 4/3 * PI * r^3           -
---------------------------------------------------------------------------------------------------*/

import java.util.*;
import java.lang.math;
public class ExamQ2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int num = input.nextInt();
        System.out.println("The volume of your sphere is: " + sphereVolume(num));
    }
public static double sphereVolume(double r){
    return 4 * Math.PI * Math.pow(r, 3) / 3;
}
}

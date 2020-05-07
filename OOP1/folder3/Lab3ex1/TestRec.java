/* Create a rectangle object using empty constructor
Display its width, height, perimeter and area information
Call setDimensions method
Display its new width and height information
Display its width, height, perimeter and area information

Create a rectangle object  using 2 argument constructor
Ask user to enter width and height values and create your second rectangle object
Display its width, height, perimeter and area information
*/

import java.util.*;

public class TestRec {
    public static void main(String[] arg) {

        Rectangle r1 = new Rectangle();

        System.out.println("Width: " + r1.width +" M"+ "\nHeight: " + r1.height +
        " M"+ "\nPerimeter: " + r1.calculatePer() +" M" + "\nArea: " + r1.calculateArea() + " M^2");

        int [] newDimensions = r1.setDimensions(); //***** when we call method returns array as data type we have create a new array

        //System.out.println("[" +newDimensinos[0] + ", "+ newDimensinos[1] + "]");

        for (int i = 0; i<newDimensions.length; i++)
        System.out.println(" " + newDimensions[i]);

        System.out.println("After setting new dimensions");

        System.out.println("Width: " + r1.width +" M"+ "\nHeight: " + r1.height +
        " M"+ "\nPerimeter: " + r1.calculatePer() +" M" + "\nArea: " + r1.calculateArea() + " M^2");

        Scanner input = new Scanner(System.in);

        System.out.println("Please insert the width of the rectangle: ");
        int w = input.nextInt();

        System.out.println("Please insert the height of the rectangle: ");
        int h = input.nextInt();

        Rectangle r2 = new Rectangle(w, h);

        System.out.println("Width: " + r2.width +" M"+ "\nHeight: " + r2.height +
        " M"+ "\nPerimeter: " + r2.calculatePer() +" M" + "\nArea: " + r2.calculateArea() + " M^2");
    }
}
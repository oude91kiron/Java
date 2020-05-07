

import java.util.*;

public class Test_c {

    public static void main(String[] arg) {

        C cer1 = new C(5.0);
        System.out.println("\n");
        System.out.println("The area of the first circle with "
        + cer1.getRadius() + " radius is: "+ cer1.getArea()  + " M^2");
        System.out.println("-------------------------------------");
        //Increase cer1's radius by 10%
        cer1.setRadius(cer1.getRadius() * 1.1);
        System.out.println("The area of the circle of radius " + cer1.getRadius() + " is: " + cer1.getArea() + " M^2");

        System.out.println("-------------------------------------");

        C cer2 = new C(1.75);

        System.out.println("The area of the second circle with "
        + cer2.getRadius() + "radius is: " + cer2.getArea() + " M^2");

        System.out.println("-------------------------------------");

        System.out.println("The number of the objects has been created is: " + cer1.getNumberOfObjects());
    }
}
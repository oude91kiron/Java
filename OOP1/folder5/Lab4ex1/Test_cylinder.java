
import java.util.*;

public class Test_cylinder {
    public static void main(String[] arg) {

        Cylinder cyl1 = new Cylinder();

        System.out.println("\n");
        System.out.println("The radius of the cylinder is: " + cyl1.getR() + " and the height is: " + cyl1.getH());
        System.out.println("----------------------------------------------------------------");

        cyl1.setR(2.75);
        cyl1.setH(4.25);

        System.out.println("The radius of the cylinder is: " + cyl1.getR() + " and the height is: " + cyl1.getH());
        System.out.println("----------------------------------------------------------------");

        System.out.println("The volume of the cylinder with (" + cyl1.getR() + ") radius and (" + cyl1.getH() + ") height is: " + cyl1.volume());
        System.out.println("----------------------------------------------------------------");

        Cylinder cyl2 = new Cylinder(2.0, 5.0);
        System.out.println("The second sylinder");
        System.out.println("The radius of the cylinder is: " + cyl2.getR() + " and the height is: " + cyl2.getH());
        System.out.println("----------------------------------------------------------------");

        System.out.println("The cylinder number " + cyl2.getnum_of_cylinder() + ":");
        System.out.println("The base area of the cylinder is: " + cyl2.base_area() + "\nThe surface area of the cylinder is: "+cyl2.surface_area()
        + "\n The volume of the cylinder is: " + cyl2.volume()+ "\nThe mass of the cylinder is: " + cyl2.getmass( 1.34));
        System.out.println("----------------------------------------------------------------");


        // to test static method

        Cylinder.setnum_of_cylinder(5);

        System.out.println("The cylinder number " + cyl1.getnum_of_cylinder() + ":");

        Cylinder cyl3 = new Cylinder();

        System.out.println("The cylinder number " + cyl2.getnum_of_cylinder() + ":");


    }
}
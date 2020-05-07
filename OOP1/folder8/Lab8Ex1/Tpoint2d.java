/*-----------------------------------------------------------------------------------
Create two point2D instances with                                                   -
Use default constructor and create p1 object                                        -
Use second constructor and create p2 object with the given values x:5, y:10.        -
Print p1                                                                            -
Check p1 and p2 are equal to each other                                             -
Create a third point p3 with the given values x:3, y:9.                             -
Add p3 to p1                                                                        -
Print p1                                                                            -
Sum points p1 and p2 store the result another point p4                              -
Print p4                                                                            -
-----------------------------------------------------------------------------------*/

import java.util.*;

public class Tpoint2d {
    public static void main(String[] arg) {

        Point2d p1 = new Point2d();
        System.out.println("P1: " + p1.toString());
        System.out.println("************************************");


        Point2d p2 = new Point2d(5, 10);
        System.out.println("Is it P1 equal P2 ? " + p1.equals(p2));
        System.out.println("************************************");

        Point2d p3 = new Point2d(3, 9);
        p1.addPoints(p3);
        System.out.println("P1: " + p1.toString());
        System.out.println("************************************");

        Point2d p4 = new Point2d(p1.getX() + p2.getX(), p1.getY()+p2.getY());
        System.out.println("P4: " + p4.toString());
        System.out.println("************************************");




    }
}
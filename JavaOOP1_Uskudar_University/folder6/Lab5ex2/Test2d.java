
import java.util.*;

public class Test2d {
    public static void main(String[] arg) {

        //System.out.println("LimX: " + Point2D.getLimX() + "LimY: " + Point2D.getLimY());
        Point2D.setLimX(100);  // cuz limX static variable and setLimX static method we can
        Point2D.setLimY(100);  // change limX, limY using class name
        //System.out.println("LimY: " + Point2D.getLimX() + "LimY: " + Point2D.getLimY());

        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(5,10);

        System.out.println("\n");
        System.out.println("P1: " + p1.toString());
        System.out.println("\n");
        System.out.println("P2: " + p2.toString());
        System.out.println("\n");

        p1.setX(p1.getX()+p2.getX());
        p1.setY(p1.getY()+p2.getY());

        System.out.println("P1+P2: " + p1.toString());
        System.out.println("\n");

        Point2D p3 = new Point2D(p1.getX()+p2.getX(), p1.getY()+p2.getY());
        System.out.println("P3: " + p3.toString());
        System.out.println("\n");

        System.out.println("p1 and p3 is equal: " + p1.equals(p3.getX(), p3.getY()));
        System.out.println("\n");

        // Demonstration of shared fields:

        System.out.println("LimX of p1: " + p1.getLimX());
        System.out.println("LimX of p2: " + p2.getLimX());

        p1.setLimX(15); // will change the value of limX for all objects

        System.out.println("LimX of p1: " + p1.getLimX());
        System.out.println("LimX of p2: " + p2.getLimX());
        System.out.println("\n");

    }
}
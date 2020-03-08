
// import 'Random' class
import java.util.*;

public class TestRec {

    public static void main(String[] args) {

        // Creating 1st 'Rectangle' object by using default constructor
        Rectangle rec1 = new Rectangle();
        System.out.println("=> 1st Rectangle");
        System.out.println("Area      : " + rec1.getArea());
        System.out.println("Perimeter : " + rec1.getPerimeter());
        System.out.println("Is Square : " + rec1.amISquare());

        // Creating 2nd 'Rectangle' object by using second constructor
        Rectangle rec2 = new Rectangle(3.5, 35.9);
        System.out.println("=> 2nd Rectangle");
        System.out.println("Area      : " + rec2.getArea());
        System.out.println("Perimeter : " + rec2.getPerimeter());
        System.out.println("Is Square : " + rec2.amISquare());


        // Creating 3rd 'Rectangle' object by using second constructor
        // Parameters of rectangle are generated randomly
        Random rnd = new Random();
        double width  = rnd.nextDouble()*49 + 1; // in range [1, 50)
        double height = rnd.nextDouble()*46 + 5; // in range [5, 51)

        Rectangle rec3 = new Rectangle(width, height);
        System.out.println("=> 3rd Rectangle");
        System.out.println("Area      : " + rec3.getArea());
        System.out.println("Perimeter : " + rec3.getPerimeter());
        System.out.println("Is Square : " + rec3.amISquare());

    }

}


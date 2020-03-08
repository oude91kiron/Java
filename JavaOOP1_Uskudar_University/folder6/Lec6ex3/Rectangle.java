
import java.util.*;

public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {
        // Initialize values by calling constructor below
        // this(...) refers to constructor
        this(1.0, 1.0); // It is better to initialize width and height with unit values
    }

    // 2nd Constructor that takes two parameters
    public Rectangle(double width, double height) {
        this.width  = width;  // 'width'  ==> on the left one is class member, on the right one is method parameter
        this.height = height; // 'height' ==> on the left one is class member, on the right one is method parameter
    }

    // This method is for getting rectangle area
    public double getArea(){
        return width*height;
    }

    // This method is for getting rectangle perimeter
    public double getPerimeter(){
        return 2*(width+height);
    }

    // This method is for checking if the rectangle is a square or not
    public boolean amISquare() {
        return width == height;
    }
}

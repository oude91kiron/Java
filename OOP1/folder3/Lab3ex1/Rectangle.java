/* Implement Rectangle class
setDimensions(): assigns random integer values [1,100] to width and height of the rectangle (use Math.random) and returns new values
Create Rectangle objects in the test program
 */
import java.util.*;

public class Rectangle {

    int width = 1;
    int height = 1;

public Rectangle() {

}

public Rectangle(int a, int b) {

    width = a;
    height = b;
}

public int calculatePer() {

    int result = 2 * ( width + height);
    return result;
}

public int calculateArea() {
    int result = width * height;
    return result;
}

public int[] setDimensions() {

    int [] dimensions = new int[2];

    width = (int) (Math.random() * 100 + 1);
    height = (int) (Math.random() * 100 + 1);

    dimensions[0] = width;
    dimensions[1] = height;

    return dimensions;
}
}
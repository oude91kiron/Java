
import java.util.*;

public class C {
    private double radius = 1;
    private static int NumberOfObjects = 0;

public C() {
    NumberOfObjects++;
}

public C(double new_radisu ) {
    this.radius = new_radisu;
    NumberOfObjects++;
}

public double getRadius () {
    return radius;
}

public void setRadius (double new_radius) {
    radius = (new_radius >= 0) ? new_radius : 0;     // ******* true ? True : false || false ? false : true
}

public static int getNumberOfObjects () {
    return NumberOfObjects;
}

public double getArea () {
    return radius * radius * Math.PI;
}
}
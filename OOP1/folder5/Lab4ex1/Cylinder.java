
import java.util.*;

public class Cylinder {

    private double r = 1.0;
    private double h = 1.0;
    private static int num_of_cylinder = 0;

public Cylinder() {
    num_of_cylinder++;
}

public Cylinder(double r, double h) {

    this.r = r;
    this.h = h;
    num_of_cylinder++;
}

public double getR() {
    return r;
}

public double getH() {
    return h;
}

public void setR(double new_r) {
    if (new_r >= 0)
        r = new_r;
    else
        r = 0;
}

public void setH(double new_h) {
    if(new_h >= 0)
        h = new_h;
    else
        h = 0;
}

public static int getnum_of_cylinder() {
    return num_of_cylinder;
}

public static void setnum_of_cylinder(int n) {
    num_of_cylinder = n;
}

public double base_area() {
    return r * r * Math.PI;
}

public double surface_area() {

    double x = r + h;
    double y = 2 * Math.PI;
    return x * y;
}

public double volume() {
    return r * r * h * Math.PI;
}

public double getmass(double density) {
    return r * r * h * Math.PI * density;
}
}
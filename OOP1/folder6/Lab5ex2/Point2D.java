
import java.util.*;

public class Point2D {
    private int x;
    private int y;

    private static int limX = 10;
    private static int limY = 10;

    public Point2D() {
        Random rnd = new Random();
        x = rnd.nextInt(limX);
        y = rnd.nextInt(limY);
    }

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public static int getLimX() {
        return limX;
    }
    public static int getLimY() {
        return limY;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public static void setLimX(int aLimX) {
        limX = aLimX;
    }
    public static void setLimY(int aLimY) {
        limY = aLimY;
    }
    public String toString() {
        return "X: " + x + " ___||___ Y: " + y;
    }
    public boolean equals(int x, int y) {
        return this.x == x && this.y == y;
    }
}
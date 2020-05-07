
/*-------------------------------------
Point2D                               -
---------------------------------------
-x:int                                -
-y: int                               -
-limX: int                            -
-limY:int                             -
---------------------------------------
+Point2D()                            -
+Point2D (x:int, y:int)               -
+getX():int                           -
+getY():int                           -
+getlimX():int                        -
+getlimY():int                        -
+setX(x:int):void                     -
+setY(y:int):void                     -
+setlimX(aLimX:int):void              -
+setlimY(aLimYint):void               -
+equals(x:int,y:int):boolean          -
+equals(p:Point2D):boolean            -
+addPoint(p:Point2D):void             -
+sumPoints(p:Point2D):Point2D         -
+toString():String                    -
-------------------------------------*/

import java.util.*;

public class Point2d {
    private int x;
    private int y;
    private static int limX = 10;
    private static int limY = 10;

public Point2d() {
    Random ran = new Random();
    this.x = ran.nextInt(limX);
    this.y = ran.nextInt(limY);
}

public Point2d (int x, int y) {
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

public void setX(int newX) {
    this.x = newX;
}

public void setY(int newY) {
    this.y = newY;
}

public static void setLimX(int newLimX) {
    limX = newLimX;
}

public void setLimY(int newLimY) {
    limY = newLimY;
}

public boolean equals(int x, int y) {
    return this.x == x && this.y == y;
}

public boolean equals(Point2d p) {

    return x == p.x && y == p.y; // Private attribute accessible from their class OR
//  return this.x == p.getX() && this.y == p.getY();
}

public String toString() {
    return "X = " + x + " _____||_____ Y = " + y;
}

public void addPoints(Point2d p) {
    x = x + p.x;
    y = y + p.y;
}

public Point2d sumPoints(Point2d p) {

    Point2d resP = new Point2d(p.x, p.y);
    // OR
    //resP.x = p.x;
    //resP.y = p.y;
    return resP;
}
}
/*
write java program that calculate s=s0 + v0*t +1/2 at^2 (position eq).
*/

/**
 *
 * @omerjava
 */
import java.util.*;

public class Ex1 {
    private double s, s0, v0, t, a; // variables.

    public static void main(String[] arg){ // main method.
        Ex1 opj = new Ex1(); // create opject
        opj.calS(); // call the method and calculate s.
        System.out.println(opj.gitS()+ " Meter"); // call the method gitS and print s.

}

    Ex1(){ // constructor give the variable initial value.
        s= 0;
        s0 = 0;
        v0 = 0;
        t = 6;
        a = 1;
    }

public double calS(){ // method calculate s.
    return s = s0 + v0*t +0.5*a*t*t;
}

public double gitS(){ // method return s.
    return s;
}
}
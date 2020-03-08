
import java.util.*;

public class TestTv {
    public static void main (String[] arg) {
        Tv tv1 = new Tv();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(5);

        Tv tv2 = new Tv();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();


        System.out.println(" TV 1 Channel Number: " + tv1.channel + " | " + " TV 1 Volume: " + tv1.volumeLevel);
        System.out.println(" TV 2 Channel Number: " + tv2.channel + " | " +" TV 2 Volume: " + tv2.volumeLevel);

    }
}
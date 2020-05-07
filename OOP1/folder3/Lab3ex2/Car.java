/* Implement  Car class
Create Car objects in the test program
*/

import java.util.*;

public class Car {
    String model = "2010";
    String color = "Black";
    int speed = 60;

public Car() {

}

public Car(String newModel, String newColor, int newSpeed) {

    model = newModel;
    color = newColor;
    speed = newSpeed;
}

public void increaseSpeed(int newSpeed) {
    speed = speed + newSpeed;
}

public void dicreaseSpeed(int newSpeed) {
    speed = speed + newSpeed;
}
}
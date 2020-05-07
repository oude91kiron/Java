

import java.util.*;

public class TestCar {
    public static void main (String[] arg) {

        Car car1 = new Car();

        System.out.println("Car Model is: "+ car1.model + "\nCar color is: "+ car1.color + "\nCar speed is: " + car1.speed + " km/h");

        car1.increaseSpeed(30);
        System.out.println("------------------------------------------");
        System.out.println("new Car speed is: " + car1.speed + " km/h");
        System.out.println("------------------------------------------");


        String new_model = "Sedan";
        String new_color = "red";
        int new_speed = (int) (Math.random() * 61 + 80);

        Car car2 = new Car(new_model, new_color, new_speed);

        System.out.println("Car Model is: "+ car2.model + "\nCar color is: "+ car2.color + "\nCar speed is: " + car2.speed + " km/h");
        System.out.println("------------------------------------------");

        car2.dicreaseSpeed(50);
        System.out.println("------------------------------------------");

        System.out.println("new Car speed is: " + car2.speed + " km/h");
        System.out.println("------------------------------------------");

    }
}
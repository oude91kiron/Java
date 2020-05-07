import java.util.*;

public class test3 {

    public static void main(String[] args) {

        System.out.println("What is the your  choise 1, 2, 3, 4 ? ");
        Scanner input = new Scanner(System.in);
        int choise = input.nextInt();

        switch (choise) {

            case 1: System.out.println("Günaydın");
            break;
            case 2: System.out.println("iyi tavşanlar");
            break;
            case 3: System.out.println("gule gule");
            break;
            case 4: System.out.println("merhaba");
            break;
            default: System.out.println("wrong choise");
        }
    }
}
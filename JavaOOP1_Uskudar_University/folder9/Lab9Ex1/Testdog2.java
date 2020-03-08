/*----------------------------------------------------------------------------------
 Now, develop a test class that stores 5 dog instances using an array list.       -
Here are possible dog names and owner names.                                        -
 DOGNAMES = {"AX" , "BX", "CX", "DX", " EX"};                                     -
 OWNERNAMES = {" Ali", "Can", "Emre", "Duygu", "Su"};                             -
 AGES = {1..10}; use random class                                                 -
 Create random dogs                                                               -
 Print the information about the dogs                                             -
----------------------------------------------------------------------------------*/
import java.util.*; // for Random and ArrayList

public class Testdog2 {
    public static void main (String[] args) {
        String[] dog_names = {"AX", "BX", "CX", "DX"};
        String[] owner_names = {"Ali", "Can", "Emre", "Duygu"};

        ArrayList<Dog> dogs = new ArrayList<>();
        Random rnd = new Random();

        for (int i = 0; i<5; i++) {
            String name =dog_names[rnd.nextInt(dog_names.length)];
            String owner_name = owner_names[rnd.nextInt(owner_names.length)];
            int age = rnd.nextInt(20);
            Dog d = new Dog(0, name, owner_name, age);
            dogs.add(d); // add a new dog obj to the array list **
        }

        for(int i = 0; i < dogs.size(); i++){
            Dog d = dogs.get(i);
            System.out.println("");
            System.out.println(d.info());
            System.out.println("*********************");
        }
      /*
      Dog d1 = new Dog(0, "AX", "Wael", 10);
      System.out.println("");
      System.out.println(d1.toString()); */
    }
}

import java.util.*;

public class Main{
public static void main(String[] arg){

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 1; i <= 10; i++) {
    list.add(10 * i);   // [10, 20, 30, 40, ..., 100]
}

    for (int i = 0; i < list.size(); i++) {
        list.remove(i);
    }
    System.out.println(list);
}
}
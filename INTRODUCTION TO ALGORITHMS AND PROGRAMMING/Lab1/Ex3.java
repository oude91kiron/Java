/* program displays the following output:

  ______
 /      \
/        \
\        /
 \______/

-"-'-"-'-"-
  ______
 /      \
/        \
\        /
 \______/

*/

public class Ex3{

    public static void eggUp(){
        System.out.println("  ______");
        System.out.println(" /      \\");
        System.out.println("/        \\");
    }

    public static void eggBottem(){
        System.out.println("\\        /");
        System.out.println(" \\______/");
    }

    public static void qoMarks(){
        System.out.println("\n-\"-'-\"-'-\"-");
    }

    public static void main(String[] arg){
        eggUp();
        eggBottem();
        qoMarks();
        eggUp();
        eggBottem();
    }
}
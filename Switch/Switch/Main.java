import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String fruit = in.next();

        if (fruit.equals("Mango")){
            System.out.println("King of fruit");
        }

        if (fruit.equals("apple")){
            System.out.println("a sweet red fruit");
        }
    }
}
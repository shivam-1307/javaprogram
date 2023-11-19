import java.util.Scanner;

public class Casecheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().charAt(0);
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowewrcase");
        } else {
            System.out.println("Uppercase");
        }


    }
}

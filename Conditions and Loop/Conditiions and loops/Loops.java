import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
           Syntax of for loops:

           for (initialisation; contion; increment/decrement) {
             //body
           }
         */

        // Q: Print numbers from 1 to 5
//        for (int num = 1; num <= 5; num += 1) {
//           System.out.println(num);
//           }
//


            // print numbers from 1 to n
//            Scanner in = new Scanner(System.in);
//            int n = in.nextInt();
//
//            for (int num = 1; num <= n; num++) {
//                // System.out.print(num + " ");
//                System.out.println(" I Love You ");
//            }


            // While loops
        /*
            Syntax:
            while (condition) {
                     //body
            }
         */

//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num += 1;
//        }

        // do while loop is used to run the code only once when while is not true
        /*
        do {
               //body
        } while (condition)
         */
//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        } while (n <= 5);

        int n = 1;
        do {
            System.out.println("Hello World");
        } while (n != 1);
    }
}

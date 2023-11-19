import java.util.Scanner;

public class Case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango":
//                System.out.println("King of fruits");
//                break;
//
//            case "Apple":
//                System.out.println("a sweet red fruit");
//                break;
//
//            case "Orange":
//                System.out.println(" round fruit ");
//                break;
//
//            case "Grapes":
//                System.out.println(" sour in taste");
//
//            default:
//                System.out.println("Please enter a valid fruit name");
//        }

//        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("monday");
//            case 2 -> System.out.println("tuesday");
//            case 3 -> System.out.println("thursday");
//            case 4 -> System.out.println("wednesday");
//            case 5 -> System.out.println("thursday");
//            case 6 -> System.out.println("friday");
//            case 7 -> System.out.println("saturday");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println(" week day ");
                break;
            case 6:
            case 7:
                System.out.println(" weekend day ");
                break;
        }
//        int day = in.nextInt();
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println(" week day ");
//            case 6, 7 -> System.out.println(" weekend day ");
//        }
    }
}

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("shivam tiwari");
                break;
            case 2:
                System.out.println(" madhu mishra");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "management":
                        System.out.println("management Department");
                        break;
                    default:
                        System.out.println("No department entered");

                }                 `
                break;
            default:
                System.out.println("Enter correct empID");

        }

    }
}

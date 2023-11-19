import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
       // int ans = sum3(a:20, b:30);
    }
    // pass the value of numbers when you are calling the method in main()

//    static int sum3(int a, int b){
//        int sum = a + b;
//        return sum;
//    }

    // return the value
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum = " + sum);
    }


    /*
    access modifier (we'll look in OOP) return_type name() {
       //body
       return statement;
    }
     */
}

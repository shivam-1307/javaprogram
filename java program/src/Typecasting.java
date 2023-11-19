import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

            // TYPE CASTING

//        int num= (int)(67.6877);
//        System.out.println(num);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);
//
//
//        int number = 'A';
//        System.out.println("hello world");

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f + b) + (i / c) - (d * s);
        System.out.print((f + b) +" " +(i / c) + " " + (d * s));
        System.out.print(result);



    }
}

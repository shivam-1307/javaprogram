import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array of objects
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 14;
        arr[2] = 54;
        arr[3] = 76;
        arr[4] = 65;
        System.out.println(arr[3]);

        // input using for loops
//        for (int i =0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        System.out.print(Arrays.toString(arr));
//        }
//        for (int i =0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
 //       }
//        for(int num : arr) { // for every element in array, print the element
//            System.out.println(num + " "); //here num represents element of the array
//        }

        // array of objects
        String[] str = new String[4];
        for(int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        //modify
        str[2] ="Shivam Tiwari"; // this code is to modify the output by replacing input
        System.out.print(Arrays.toString(str));
    }
}

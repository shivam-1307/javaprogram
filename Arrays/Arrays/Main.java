public class Main {
    public static void main(String[] args) {
        // Q: store a roll number
        String name = "Shivam Tiwari";

        //  Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        //
        // datatype[] variable_name = new datatype[size];
        // store 5 roll numbers:
//        int[] rnos = new int[5];
        // or directly
 //       int[] rnos2 = {12, 23,34, 15};
        int[] ros; //declaration of array,ros is getting definedin the stack
        ros = new int[5]; // initialisation:   actually here object is being created in the memory (heap)
 //       System.out.println(ros[1]);
        String[] arr = new String[4];
        System.out.println(arr[0]);


    }
}
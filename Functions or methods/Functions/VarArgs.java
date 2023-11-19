import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
  //      fun(3,50);
  //      multiple(2,3, "Shivam", "Rahul", "Madhu");
        demo("shivam tiwari", "rahul");
    }
    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));

    }
    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}

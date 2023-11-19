public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("Shivam Tiwari");
    }
    static void fun(int a) {
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }
}

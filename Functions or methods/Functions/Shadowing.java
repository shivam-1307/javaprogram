public class Shadowing {
    static int X = 90;
    public static void main(String[] args) {
      System.out.println(X);
      int X;   // the class variables at the line 2 by this
//        System.out.println(X);//scope will begin when value is initialised

      X = 40;
      System.out.println(X);
      fun();
    }
    static void fun() {
        System.out.println(X);
    }
}

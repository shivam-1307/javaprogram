public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Shivam";
        {
//            a = 78; // already initialised outside the block in the same method, hence you cannot initialise again
            int c = 99;
            a = 100;// reassign the origin ref variable to some other value
            name = "Madhu";
            System.out.println(name);
            System.out.println(a);
            // values initialised in this block, will remain in

            // scoping in for loops
            for (int i = 0; i < 4; i++){
                System.out.println(i);
                int num = 90;
                a = 10000;
            }
        }
        System.out.println(name);
        System.out.println(a);

   //     System.out.println(c); // cannot use outside the block

    }
    static void random(int marks){
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}

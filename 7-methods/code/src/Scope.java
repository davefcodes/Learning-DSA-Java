public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "David";

        {
//            a = 78; // already initialised outside the block in the same method, hence you can't initialise again
            a = 100; // reassign the original ref variable to some other value

            int c = 99;
            name = "Rahuel";
            // values initialised in this block, will remain in block
            System.out.println(a);
            System.out.println(name);
        }
//        System.out.println(c); // can not use outside the block
        System.out.println(name);
        System.out.println(a);

        // scooping in for loops
        for(int i = 1; i < 11; i++ ){
            System.out.println(i);

            a = 10_000; // ref variable can be updated in this block
        }
        System.out.println(a);




    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);

    }
}

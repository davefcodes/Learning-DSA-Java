

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

        swap(a, b);

        String newName = "Wonder";
        changeName(newName);
        System.out.println(newName);
    }

    static void changeName(String name) {
        name = "Dave"; // creating a new object
    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1 + " " + num2);
        // this change will only be valid in this function scope only.

    }
}

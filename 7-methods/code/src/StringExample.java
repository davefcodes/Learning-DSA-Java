import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String message = greet();
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String name = input.next();
        String personalized = myGreet("Sam");
        System.out.println(personalized);

    }

    // pass the value of sting when you are calling the method in main()

    static String myGreet(String name){
        String message = "Hello " + name;
        return message;

    }
    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }
}

import java.util.Scanner;

import static java.lang.System.in;

public class Greeting {
    public static void main(String[] args) {
        greeting();
        name();

    }
    static void greeting(){
        System.out.println("Hello there");
    }

    static void name(){
        Scanner input = new Scanner(System.in);
        System.out.print("Type your name here: ");
        String user_name = input.next();
        System.out.println("Hello " + user_name);
    }
}



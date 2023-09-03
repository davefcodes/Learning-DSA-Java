import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruits = input.next();

        switch (fruits) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("Sweet green fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Please enter a valid fruit");
        }



    }
}

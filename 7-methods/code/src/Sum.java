import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
//        int ans = sum();
        int ans = sum2(20, 30);
        System.out.println(ans);
    }

    // pass the value of numbers when you are calling the method in main()
    static int sum2(int a, int b){
        int sum = a + b;
        return sum;
    }


    // return the value
    static int sum (){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2 :");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    /*
        return_type name (arguments){
            // body
            return statement
        }
     */
}

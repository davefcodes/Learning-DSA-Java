import java.util.Scanner;
import java.util.Arrays;

public class InputData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // arrays of primitives
        int[] arr = new int[5];
        arr[0] = 22; // this code is repetitive
        arr[1] = 10;
        arr[2] = 543;
        arr[3] = 238;
        arr[4] = 100;
        // directly
        // int arr2[] = {22, 10, 543, 238, 100};
        // [22, 10, 543, 238, 100]
        System.out.println(arr[2]);



        // input using for loops
        for (int i = 0; i < arr.length; i++){
            arr[i] = input.nextInt();
//          System.out.println(arr[i]); // will take in an input and print all elements
        }

        // converts the array into a string and prints
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]); // prints elements in the array
        }

        for (int n: arr){ // for every element in the array, print the element
            System.out.println(n); // n represent the elements in the array
        }

        // array of object
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}

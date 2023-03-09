package com.davefcode;

import java.util.Scanner;

// Take 2 numbers as input and print the largest number.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter second number: ");
        int num2 = input.nextInt();

        int largestNum = Math.max(num1, num2);

        System.out.println("The largest number is: " + largestNum);
    }
}

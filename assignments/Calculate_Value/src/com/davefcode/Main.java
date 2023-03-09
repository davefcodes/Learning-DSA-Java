package com.davefcode;

import java.util.Scanner;
// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter the operator:");
        String operator = input.next();

        if (operator.equals("+")){
            System.out.println("The value is: " + (num1 + num2));
        }
        else if (operator.equals("-")){
            System.out.println(num1 - num2);
        }
        else if (operator.equals ("*")){
            System.out.println(num1 * num2);
        }
        else if (operator.equals("/")){
            System.out.println(num1 / num2);
        }
    }
}

package com.davefcode;

import java.util.Scanner;
// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter principal amount: ");
        int principal = input.nextInt();
        System.out.println("Enter rate per year:");
        float rate = input.nextFloat();
        System.out.println("Enter term :");
        float time = input.nextFloat();

        float total_Interest = (principal * rate/100 * time);
        System.out.println("Your simple interest is: " + total_Interest);

    }
}

package com.davefcode;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        if (num % 2 == 0){
            System.out.println("This number is even.");
        }
        else{
            System.out.println("This number is odd.");
        }




    }
}

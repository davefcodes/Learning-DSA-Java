package com.davefcode;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
            Syntax of for loops:
            for(initialization; condition; increment/decrement) {
                // body
            }
         */

        // Q: Print numbers from 1 to 5
        for (int num = 1; num <= 5; num += 1 ){
            System.out.println(num);

        }

        // Print numbers from 1 to n
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int num = 1; num <= n; num++){
            System.out.println(num + " ");
            System.out.println("Hello World");
        }

        /*
            Syntax for while loop:

            while (condition){
                // body
            }

         */

        int num = 1;

        while (num <= 5){
            System.out.println(num);
            num++;
        }

        /*
            Syntax for do while loop:

            do {
                // body
            } while(condition);

         */




    }
}

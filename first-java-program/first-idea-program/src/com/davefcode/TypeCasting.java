package com.davefcode;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // Types need to be compatible
        Scanner input = new Scanner (System.in);
//        float num = input.nextInt();
//        System.out.println(num);

        // type casting
        int nums = (int)(67.56f);
        System.out.println(nums);

        // automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); // 237 % 256 = 1

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;

//        byte b = 50;
//        b = b * 2;

 //       int number  = 'A';
//        System.out.println(number);
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d*s);
        // float + int - double = double
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);





    }

}

package com.davefcode;

public class CountNums {
    public static void main(String[] args) {
        int n = 138339;
        int count = 0;

        while (n > 0){
           int rem = n % 10;
           if (rem == 3){
               count += 1;
           }
           n /= 10;
        }
        System.out.println(count);

    }
}

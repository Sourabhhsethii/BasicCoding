package com.recursion;

import java.util.Scanner;

/*
You are given a number n. You need to keep finding the sum of its digits until the sum becomes a single digit.

For example, let's say n = 4651.
Sum of digits = 4+ 6 + 5 + 1 = 16 (double-digit sum)
Sum of digits now = 1 + 6 = 7 (single-digit sum)
 */
public class SumOfDigits {
    static int sumOfDigitsSingle(int n)
    {
       if(n <= 0){
          return n;
       }
         // Double Digit
        n = n%10 + sumOfDigitsSingle(n/10);

        // Again do recursion to get Single Digit.
       if(n >= 9){
           n =  n%10 + sumOfDigitsSingle(n/10);
       }

       return n;
    }

    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        System.out.println(sumOfDigitsSingle(n) + "\n" );
    }
}

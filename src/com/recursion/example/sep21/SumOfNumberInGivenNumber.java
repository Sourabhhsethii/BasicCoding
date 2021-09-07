package com.recursion.example.sep21;

import java.util.Scanner;

/*
Write a Java program to calculate the sum of the digits of a given number using recursion.

Example:

Number: 492; then, the output is 4 + 9 + 2 = 15

The input accepts the number whose sum of digits needs to be evaluated, and the output prints the value of the sum.
 */
public class SumOfNumberInGivenNumber {
    public static int sum(int n) {
        // Base condition or terminating condition
        if(n < 1){
            return n;
        }
        // work
         return (n%10) + sum(n/10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}

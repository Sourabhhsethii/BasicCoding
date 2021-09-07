package com.recursion.example.sep21;

import java.util.Scanner;

/*
print number in asc and desc order using Recursion
 */
public class HeadRecursionTailRecursion {

    public  void increasingOrder(int number) {
        // Base Case
        if (number <= 0)
            return;

            // Recursion call
            increasingOrder(number-1);

            // Work
            System.out.print(number);

    }

    public  void decreasingOrder(int number){
        if(number < 1)
            return;

            // Work
            System.out.print(number);

            // Recursion call
            decreasingOrder(number-1);

    }

    public static void main( String args[]){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HeadRecursionTailRecursion headRecursionTailRecursion = new  HeadRecursionTailRecursion();
        headRecursionTailRecursion.increasingOrder(n);
        System.out.println(" ");
        headRecursionTailRecursion.decreasingOrder(n);;
    }
}

// What is head & tail?
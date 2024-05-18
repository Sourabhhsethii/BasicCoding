package com.combinatorics;

/**
 * Problem Description
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents p and p is a prime number greater than equal to n, find and return the value of nCr % p where nCr % p = (n! / ((n-r)! * r!)) % p.
 *
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 *
 * NOTE: For this problem, we are considering 1 as a prime.
 */
public class NCR {
    public static void main(String[] args) {
        System.out.println(solve(5,2,13));
    }

    public static int solve(int A, int B, int C) {

        int a = fact(A)%C;
        System.out.println(a);
        int b = (int) (Math.pow(fact(A-B)%C,C-2)%C);
        int c = (int) (Math.pow(fact(B)%C,C-2)%C);

        return a * b * c;

    }


    public static int  fact(int number) {
        if(number == 0){
            return 1;
        }
        return number * fact(number-1);
    }
}

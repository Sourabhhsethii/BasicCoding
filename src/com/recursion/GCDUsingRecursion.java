package com.recursion;

import java.util.Scanner;

/*
The GCD (Greatest Common Divisor) of two numbers is the largest number that divides both the numbers. You are given two numbers. Determine their GCD.

Approach
The GCD of two numbers does not change if the smaller number is subtracted from the larger number. This fact can be used in forming your recurrence relation.
You can also use the modulo operator instead of subtraction for a more efficient solution.

 */
public class GCDUsingRecursion {

    static int gcd(int x, int y)
    {
        if(y == 0)
            return x;
        return gcd(y, x%y);
    }

    public static void main(String args[])
    {
        int x, y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y = s.nextInt();

        System.out.println(gcd(x, y) + "\n" );
    }
}

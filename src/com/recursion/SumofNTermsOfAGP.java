package com.recursion;

import java.util.Scanner;

/*
GP stands for Geometric Progression. A GP is a sequence of numbers where each new term is found by multiplying the previous term by a fixed number (called the common ratio, denoted by 'r'). The first term of a GP is denoted by 'a'.

For example, the GP for a = 3, r = 2 looks like this:
3, 6, 12, 24, 48...

You need to find the sum of the first n terms of a GP and return the result mod m (result % m).
 */
public class SumofNTermsOfAGP {
    static long gp(long a, long r, long n, long m)
    {
        long answer;
        answer = a * sum(r, n, m);
        answer = answer % m;

       return answer;
    }

    static long sum(long r, long n,
                          long m)
    {

        // Base cases
        if (n == 0)
            return 1;
        if (n == 1)
            return (1 + r) % m;

        long ans;

        // If n is odd
        if (n % 2 == 1)
        {
            ans = (1 + r) *
                    sum((r * r) % m,
                            (n - 1) / 2, m);
        }
        else
        {
            // If n is even
            ans = 1 + (r * (1 + r) *
                    sum((r * r) % m,
                            (n / 2) - 1, m));
        }

        return (ans % m);
    }

    public static void main(String args[])
    {
        int a, r, n, m;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        r = s.nextInt();
        n = s.nextInt();
        m = s.nextInt();

        System.out.println(gp(a, r, n, m) + "\n" );
    }
}

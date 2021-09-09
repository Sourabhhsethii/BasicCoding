package com.recursion.example.sep21;

import java.util.Scanner;

public class FindTheLastNonZeroDigitInNFactorital {

    static int digit[] = {1, 1, 2, 6, 4, 2, 2, 4, 2, 8};
    static int lastNonZeroDigit(int n) {
        if (n < 10)
            return digit[n];

        // Check whether tens (or second last)
        // digit is odd or even
        // If n = 375, So n/10 = 37 and
        // (n/10)%10 = 7 Applying formula for
        // even and odd cases.
        if (((n / 10) % 10) % 2 == 0)
            return (6 * lastNonZeroDigit(n / 5)
                    * digit[n % 10]) % 10;
        else
            return (4 * lastNonZeroDigit(n / 5)
                    * digit[n % 10]) % 10;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.print(lastNonZeroDigit(n));

    }
}

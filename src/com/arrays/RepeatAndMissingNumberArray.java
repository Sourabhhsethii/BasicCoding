package com.arrays;

/**
 * You are given a read only array of n integers from 1 to n.
 *
 * Each integer appears exactly once except A which appears twice and B which is missing.
 *
 * Return A and B.
 *
 * Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Note that in your output A should precede B.
 *
 * Example:
 *
 * Input:[3 1 2 5 3]
 *
 * Output:[3, 4]
 *
 * A = 3, B = 4
 */
public class RepeatAndMissingNumberArray {

    public static void main(String[] args) {

        int[]  input = {1,2,1,4};
        int xor = 0;
        for(int i = 0; i< input.length;i++) {
            xor ^= input[i];
        }
        System.out.println(xor);

    }

    public int[] repeatedNumber(final int[] A) {
        int[] temp = new int[2];



        return temp;

    }
}

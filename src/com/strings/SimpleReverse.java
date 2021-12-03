package com.strings;

import java.util.Scanner;

/**
 * Problem Description
 *
 * Given a string A, you are asked to reverse the string and return the reversed string.

 *
 * Problem Constraints
 *
 * 1 <= |A| <= 105
 *
 * String A consist only of lowercase characters.
 *
 *
 *
 * Input Format
 *
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 *
 * Return a string denoting the reversed string.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *
 *  A = "scaler"
 * Input 2:
 *
 *  A = "academy"
 *
 *
 * Example Output
 *
 * Output 1:
 *
 *  "relacs"
 * Output 2:
 *
 *  "ymedaca"
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *
 *  Reverse the given string.
 */
public class SimpleReverse {

    // Iteration Over Array.
    public String solve(String A) {
        String reverse = "";
        for(int i =0; i<A.length();i++){
            char ch;
            ch = A.charAt(i);
            reverse = ch+reverse;
        }
        return reverse;
    }

    // Optimized Using StringBuilder
    public String solve2(String A) {
        StringBuilder reverse = new StringBuilder();
        reverse.append(A);
        reverse.reverse();
        return String.valueOf(reverse);
    }

    public static void main(String[] args) {
        SimpleReverse  reverse= new SimpleReverse();
        Scanner input = new Scanner(System.in);
        String defaultString  = input.next();
        System.out.println(reverse.solve2(defaultString));
    }

}

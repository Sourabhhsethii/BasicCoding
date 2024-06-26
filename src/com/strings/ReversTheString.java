package com.strings;

import java.util.Scanner;

/**
 * Problem Description
 *
 * Given a string A of size N.
 *
 * Return the string A after reversing the string word by word.
 *
 * NOTE:
 *
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 *
 *
 * Problem Constraints
 *
 * 1 <= N <= 3 * 105
 *
 *
 *
 * Input Format
 *
 * The only argument given is string A.
 *
 *
 *
 * Output Format
 *
 * Return the string A after reversing the string word by word.
 *
 *
 *
 * Example Input
 *
 * Input 1:
 *     A = "the sky is blue"
 * Input 2:
 *     A = "this is ib"
 *
 *
 * Example Output
 *
 * Output 1:
 *     "blue is sky the"
 * Output 2:
 *     "ib is this"
 *
 *
 * Example Explanation
 *
 * Explanation 1:
 *     We reverse the string word by word so the string becomes "the sky is blue".
 * Explanation 2:
 *     We reverse the string word by word so the string becomes "this is ib".
 */
public class ReversTheString {
    public String solve(String A) {

        StringBuilder reverse = new StringBuilder();
        reverse.append(A);
        reverse.reverse();

        StringBuilder reversedLine = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i =0;i < reverse.length();i++){


            if(reverse.charAt(i) != ' ') {
                sb.append(reverse.charAt(i));
            } else  {
                sb.reverse();
                reversedLine.append(sb + " ");
                sb = new StringBuilder();
            }
        }

        sb.reverse();
        reversedLine.append(sb);

        return  String.valueOf(reversedLine).trim();

    }

    public static void main(String[] args) {
        ReversTheString  reverse= new ReversTheString();
        Scanner input = new Scanner(System.in);
        String defaultString  = input.nextLine();
        System.out.println(reverse.solve(defaultString));
    }
}

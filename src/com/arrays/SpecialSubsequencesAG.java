package com.arrays;

import java.util.Scanner;

/**
 * Special Subsequences "AG"
 * Problem Description
 *
 * You have given a string A having Uppercase English letters.
 *
 * You have to find that how many times subsequence "AG" is there in the given string.
 *
 * NOTE: Return the answer modulo 109 + 7 as the answer can be very large.
 *
 *
 *
 * Problem Constraints
 * 1 <= length(A) <= 105
 *
 *
 *
 * Input Format
 * First and only argument is a string A.
 *
 *
 *
 * Output Format
 * Return an integer denoting the answer.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = "ABCGAG"
 * Input 2:
 *
 *  A = "GAB"
 *
 *
 * Example Output
 * Output 1:
 *
 *  3
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  Subsequence "AG" is 3 times in given string
 * Explanation 2:
 *
 *  There is no subsequence "AG" in the given string.
 */
public class SpecialSubsequencesAG {

    public int solve(String A) {
        int n = A.length();
        int count = 0;
        for (int i=0;i<n;i++){
            if(A.charAt(i) == 'A'){
                for(int j=i+1;j<n;j++){
                    if(A.charAt(j) == 'G'){
                        count++;
                    }
                }
            }

        }
        return count;
    }

    public int moreOptimized(String A) {
        int n = A.length();
        int count = 0;
        int ans = 0;

        for (int i=n-1;i>=0;i--){
            if(A.charAt(i) == 'G'){
                count++;
            }else if(A.charAt(i) == 'A'){
                ans = ans +count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String  AG = input.next();

        SpecialSubsequencesAG obj = new SpecialSubsequencesAG();
        System.out.println(obj.solve(AG));
        System.out.println(obj.moreOptimized(AG));
    }
}

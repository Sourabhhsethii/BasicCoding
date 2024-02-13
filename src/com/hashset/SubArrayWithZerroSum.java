package com.hashset;

import java.util.HashSet;

/**
 * Problem Description
 * Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
 *
 * If the given array contains a sub-array with sum zero return 1, else return 0.
 */
public class SubArrayWithZerroSum {

    public static void main(String[] args) {
        int[] A = {-1,1};
        System.out.println(solve(A));
    }

    public static int solve(int[] A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<A.length;i++){
            sum = sum + A[i];

            if(hs.contains(sum)){
                return 1;
            } if (sum == 0) {
                return 1;
            } {
                hs.add(sum);
            }
        }
        return 0;
    }
}

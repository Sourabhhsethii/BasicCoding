package com.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Noble Integer
 * Problem Description
 *
 * Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals to p.
 *
 * Input Format
 * First and only argument is an integer array A.
 *
 *
 * Output Format
 * Return 1 if any such integer p is found else return -1.
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 2, 1, 3]
 * Input 2:
  3 2 1 3
 *  A = [1, 1, 3, 3]
 *
 1 1 3 3
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  -1
 *
 * Example Explanation
 * Explanation 1:
 *
 *  For integer 2, there are 2 greater elements in the array. So, return 1.
 * Explanation 2:
 *
 *  There is no such integer exists.
 */

public class NobleInteger {

    // TC - O(N^2)
    public static int solve(int[] A) {
        int found = -1;
        for(int i=0;i<A.length;i++){
            int count = 0;
            for( int j=0;j<A.length;j++){
                if(A[i]<A[j]){
                    count = count + 1;
                }
            }
            if(count == A[i]){
                found = 1;
            }
        }
        return found;
    }

    // TC - O(nlogn)
    public static int solveMore(int[] A) {
        int found = -1;
       Arrays.sort(A);
       System.out.println(Arrays.toString(A));
        for(int i=0;i<A.length-1;i++){
            if(A[i] == A[i+1]){
                continue;
            }

            int diff = A.length -i-1;
                if(A[i] == diff){
                    found = 1;
                }
        }

        if (A[A.length - 1] == 0)
            return -1;

        return found;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(solveMore(num));

    }

}

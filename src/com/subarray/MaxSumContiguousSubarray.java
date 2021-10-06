package com.subarray;

import com.sorting.SumClosestToZero;

import java.util.Scanner;

/**
 * Max Sum Contiguous Subarray
 * Problem Description
 *
 * Find the contiguous subarray within an array, A of length N which has the largest sum.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 1e6
 * -1000 <= A[i] <= 1000
 *
 *
 *
 * Input Format
 * The first and the only argument contains an integer array, A.
 *
 *
 *
 * Output Format
 * Return an integer representing the maximum possible sum of the contiguous subarray.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [1, 2, 3, 4, -10]
 * Input 2:
 5
 1 2 3 4 -10
 *
 *  A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

 9
 -2 1 -3 4 -1 2 1 -5 4
 *
 * Example Output
 * Output 1:
 *
 *  10
 * Output 2:
 *
 *  6
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
 * Explanation 2:
 *
 *  The subarray [4,-1,2,1] has the maximum possible sum of 6.
 */
public class MaxSumContiguousSubarray {
    public static int maxSubArray(final int[] A) {
        int max = Integer.MIN_VALUE;
        for (int i=0;i<A.length;i++){
            int sum =0;
            for(int j=i;j<A.length;j++){
                    sum = sum + A[j];
                if(max<sum){
                    max = sum;
                }
            }
        }
        return max;
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
        System.out.println(maxSubArray(num));
    }
}

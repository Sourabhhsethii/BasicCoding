package com.arrays;

import java.util.Scanner;

/**
 * Array - Prefix sum and carry forward
 *
 * Sum of All Subarrays
 * Problem Description
 * You are given an integer array A of length N.
 * You have to find the sum of all subarray sums of A.
 * More formally, a subarray is a defined as a contiguous part of an array,
 * which we can obtain by deleting zero or more elements from either end of the array.
 * A subarray sum denotes the sum of all the elements of that subarray.
 *
 *
 *
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= Ai <= 10 4
 *
 *
 * Input Format
 * The first argument is the integer array A.
 *
 *
 * Output Format
 * Return a single integer denoting the sum of all subarray sums of the given array.
 *
 *
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 *
 * A = [2, 1, 3]
 *
 *
 * Example Output
 * Output 1:
 * 20
 * Output 2:
 *
 * 19
 *
 *
 * Example Explanation
 * Explanation 1:
 * The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
 * Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20
 * Explanation 2:
 *
 * Similiar to the first example, the sum of all subarray sums for this array is 19.
 */
public class SumOfAllSubarrays {
    public long subarraySum(int[] A) {

        int sum =0, totalSum = 0; // Prefix sum and carry forward
        // All Sub Arrays
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j++){
                for(int k=i;k<=j;k++){
                    sum = sum + A[k];
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int n;
        SumOfAllSubarrays obj= new SumOfAllSubarrays();
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(obj.subarraySum(num));

    }
}

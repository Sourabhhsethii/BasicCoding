package com.arrays;

import java.util.Scanner;

/**
 * Time to equality
 * Problem Description
 *
 * Given an integer array A of size N. In one second you can increase the value of one element by 1.
 *
 * Find the minimum time in seconds to make all elements of the array equal.
 *
 *
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 *
 *
 * Input Format
 * First argument is an integer array A.
 *
 *
 * Output Format
 * Return an integer denoting the minimum time to make all elements equal.
 *
 *
 * Example Input
 * A = [2, 4, 1, 3, 2]

 5
 2 4 1 3 2

 * Example Output
 * 8
 *
 *
 * Example Explanation
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeToEquality {
    public static int solve(int[] A) {

        int max = 0;
        int count = 0;

        //Found Out Max element
        for(int i=0;i<A.length;i++){

            if(max<A[i]){
                max = A[i];
            }

        }

        for (int i=0;i<A.length;i++){

            count += (max - A[i]);
        }

        return count;
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
        System.out.println(solve(num));

    }
}

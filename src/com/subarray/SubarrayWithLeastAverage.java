package com.subarray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Subarray with least average
 * Problem Description
 * Given an array of size N, Find the subarray with least average of size k.
 *
 *
 *
 * Problem Constraints
 * 1<=k<=N<=1e5
 * -1e5<=A[i]<=1e5
 *
 *
 * Input Format
 * First argument contains an array A of integers of size N.
 * Second argument contains integer k.
 *
 *
 * Output Format
 * Return the index of the first element of the subarray of size k that has least average.
 * Array indexing starts from 0.
 *
 *
 * Example Input
 * Input 1:
 * A=[3, 7, 90, 20, 10, 50, 40]
 * B=3
 * Input 2:

 7
 3 7 90 20 10 50 40
 3


 * A=[3, 7, 5, 20, -10, 0, 12]
 * B=2

 7
 3 7 5 20 -10 0 12
 2

 *
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 *
 * 4

 A : [ 20, 3, 13, 5, 10, 14, 8, 5, 11, 9, 1, 11 ]
 B : 9

 12
 20 3 13 5 10 14 8 5 11 9 1 11
 9

 15
15 7 11 7 9 8 18 1 16 18 6 1 1 4 18
6

7
 20 1 5 2 7 5 17
 6
 *
 * Example Explanation
 * Explanation 1:
 * Subarray between indexes 3 and 5
 * The subarray {20, 10, 50} has the least average
 * among all subarrays of size 3.
 * Explanation 2:
 *
 *  Subarray between [4, 5] has minimum average
 */
public class SubarrayWithLeastAverage {

// Approach to solve this kind of sub array is to use sliding window as the window size is fixed.

    public static int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        if (n < B)
            return 0;

        int start = 0;
        int sum = 0;
        for (int i = 0; i < B; i++)
            sum += A.get(i);
        int leastSum = sum;
        for (int i = B; i < n; i++)
        {
            sum +=  A.get(i) - A.get(i - B);
            if (sum < leastSum)
            {
                leastSum = sum;
                start = (i - B + 1);
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int n,m;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++){
            A.add(input.nextInt());
        }

        m = input.nextInt();
        System.out.print(solve(A,m));
    }
}

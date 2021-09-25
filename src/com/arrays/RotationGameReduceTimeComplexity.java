package com.arrays;
import java.lang.*;
import java.util.*;

/**
 * Rotation Game
 * Problem Description
 *
 * You are given an integer array A and an integer B. You have to print the same array after rotating it B times towards right.
 *
 * NOTE: You can use extra memory.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 106
 *
 * 1 <= A[i] <= 109
 *
 * 1 <= B <= 109
 *
 *
 *
 * Input Format
 * First line begins with an integer |A| denoting the length of array, and then |A| integers denote the array elements.
 * Second line contains a single integer B
 *
 *
 *
 * Output Format
 * Print an array of integers which is the Bth right rotation of input array A, on a separate line.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  4 1 2 3 4
 *  2
 * Input 2:
 *
 *  3 1 2 2
 *  3
 *
 *
 * Example Output
 * Output 1:
 *
 *  3 4 1 2
 * Output 2:
 *
 *  1 2 2
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  [1,2,3,4] => [4,1,2,3] => [3,4,1,2]
 *
 * Explanation 2:
 *
 *
 *  [1,2,2] => [2,1,2] => [2,2,1] => [1,2,2]

 3 1 2 2
 3
 */
public class RotationGameReduceTimeComplexity
{

    public static void main(String[] args) {

        int n,d;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }


        d = input.nextInt();

        while (d > n) {
            d = d - n;
        }


        int[] temp = new int[n-d];

        for (int i = 0; i < n - d; i++)
            temp[i] = num[i];

        // Shift Rest Elements
        for (int i = n -d;i<n;i++){
            num[i - n +d] = num[i];
        }

        // Add temp array elements.
        for(int i=0;i<n-d;i++){
            num[i+d] = temp[i];
        }

        for(int i=0;i<n;i++){
            System.out.print(num[i] + " ");
        }


    }

}

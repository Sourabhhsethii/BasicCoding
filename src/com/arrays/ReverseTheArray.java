package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Reverse the Array
 * Problem Description
 *
 * You are given a constant array A.
 *
 * You are required to return another array which is the reversed form of input array.
 *
 * Problem Constraints
 * 1 <= A.size() <= 10000
 *
 * 1 <= A[i] <= 10000
 *
 * Input Format
 * First argument is a constant array A.
 *
 * Output Format
 * You have to return an integer array.
 *
 * Example Input
 * Input 1:
 *
 * A = [1,2,3,2,1]
 * Input 2:
 *
 * A = [1,1,10]
 *
 * Example Output
 * Output 1:
 *
 *  [1,2,3,2,1]
 * Output 2:
 *
 *  [10,1,1]
 *
 * Example Explanation
 * Explanation 1:
 *
 * Reversed form of input array is same as original array
 * Explanation 2:
 *
 * Clearly, Reverse of [1,1,10] is [10,1,1]
 */
public class ReverseTheArray {
    public int[] solve(final int[] A) {

        int i=0;
        int j= A.length -1;
       while (i<j){
           A[i] = A[i] ^ A[j];
           A[j] = A[i] ^ A[j];
           A[i] = A[i] ^ A[j];
           i++;
           j--;
       }
        return A;
    }

    public static void main(String[] args) {
        int n;
        ReverseTheArray obj= new ReverseTheArray();
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++){
            num[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(obj.solve(num)));
    }
}

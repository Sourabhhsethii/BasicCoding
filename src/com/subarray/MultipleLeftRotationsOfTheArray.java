package com.subarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Multiple left rotations of the array
 * Problem Description
 *
 * Given an array of integers A and multiple values in B which represents number of times array A needs to be left rotated.
 *
 * Find the rotated array for each value and return the result in the from of a matrix where i'th row represents the rotated array for the i'th value in B.
 *
 *
 *
 * Problem Constraints
 * 1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer array B.
 *
 *
 * Output Format
 * Return the resultant matrix.
 *
 *
 * Example Input
 * Input 1:
 *
 *     A = [1, 2, 3, 4, 5]
 *     B = [2, 3]
 *
 * Input 2:
 *
 *
 *     A = [5, 17, 100, 11]
 *     B = [1]
 *
 *
 *
 *
 * Example Output
 * Output 1:
 *
 *     [ [3, 4, 5, 1, 2]
 *      [4, 5, 1, 2, 3] ]
 *
 *
 * Output 2:
 *
 *
 *     [ [17, 100, 11, 5] ]
 *
 *
 *
 * Example Explanation
 * for input 1 -> B[0] = 2 which requires 2 times left rotations
 *
 * 1: [2, 3, 4, 5, 1]
 *
 * 2: [3, 4, 5, 1, 2]
 *
 * B[1] = 3 which requires 3 times left rotation
 *
 * 1: [2, 3, 4, 5, 1]
 *
 * 2: [3, 4, 5, 1, 2]
 *
 * 2: [4, 5, 1, 2, 4]
 */
public class MultipleLeftRotationsOfTheArray {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int rotationCount = B.size();
        int temp[] = new int[2*rotationCount];
      //  int [][] = new int[rotationCount][A.length];

        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();


        for(int i=0;i<rotationCount;i++){
            result.add(leftRotate(A, A.size(), B.get(i)));
        }
        return result;
    }

    // Function to left rotate an array k time
    static ArrayList<Integer> leftRotate(ArrayList<Integer> A, int n, int k)
    {
        // Starting position of array after k
        // rotations in temp[] will be k % n
        ArrayList<Integer> result= new ArrayList<Integer>();

        // Print array after k rotations
        for (int i = k; i < k + n; i++)
            result.add(A.get(i % n));

        return result;
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

        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < m; i++){
            B.add(input.nextInt());
        }
        System.out.print(solve(A,B));
    }
}

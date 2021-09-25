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
public class RotationGameWithForLoopLinerTimeComplexity {

    public static void main(String[] args) {

        int sizeOfArray,rotationNumber;
        Scanner input = new Scanner(System.in);
        sizeOfArray = input.nextInt();

        int[] num = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++){
            num[i] = input.nextInt();
        }

        rotationNumber = input.nextInt();
        // O(n^2) - Liner Timer complexity
        for (int i = 0; i < rotationNumber; i++) {

            int last = num[sizeOfArray - 1];
            for (int j =sizeOfArray-1; j>0; j--) {
                num[j] = num[j-1];
            }
            num[0] = last;
        }

        for (int i=0;i<num.length;i++){
            System.out.print(num[i] + " ");
        }

    }

}

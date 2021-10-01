package com.arrays;

import java.util.Scanner;

/**
 * Is It Identity Matrix?
 * Problem Description
 *
 * You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
 *
 * Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
 *
 *
 *
 * Problem Constraints
 * 2 <= N <= 103
 *
 * A[i][j] equals 0 or 1.
 *
 *
 *
 * Input Format
 * First and only argument is an integer matrix A.
 *
 *
 *
 * Output Format
 * Return 1 if A is an identity matrix, else return 0.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  [[1, 0]
 *   [0, 1]]
 * Input 2:
 *
 *  [[0, 0, 1]
 *   [0, 1, 0]
 *   [1, 0, 0]]
 *
 *
 * Example Output
 * Output 1:
 *
 *  1
 * Output 2:
 *
 *  0
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 *  All the main diagonal elements in A are 1, all other elements are 0.
 *  So, A is an identity matrix.
 * Explanation 2:

 2
 0 0 1 1


 5
 1 0 0 0 0
 0 1 0 0 0
 0 0 1 0 0
 0 0 0 1 0
 0 0 0 0 1
 
 *  All the main diagonal elements in A are not 1, also all other elements are not equal to 0.
 *  So, A is not an identity matrix.
 */
public class IdentityMatrixProblem {
    public int solve(final int[][] A) {
        int resultAbove =0, resultBelow=0, diagonalSum=0;
        for (int i=0;i<A.length;i++){
            for (int j=0;j<A[i].length;j++){
                if(j>i ){
                    resultAbove += A[i][j];
                }

                if(i<j){
                    resultBelow += A[i][j];
                }

                if(i==j){
                    diagonalSum += A[i][j];
                }
            }
        }
        if(resultAbove == 0 && resultBelow ==0 && diagonalSum == A[0].length){
            return 1;
        } else
            return 0;
    }
    public static void main(String[] args) {

        int n,m;
        System.out.println("Enter Number of elements of array");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        int[][]  arr = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] =  input.nextInt();
            }
        }

        IdentityMatrixProblem obj = new IdentityMatrixProblem();
        System.out.println(obj.solve(arr));

    }
}

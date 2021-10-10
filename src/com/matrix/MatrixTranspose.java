package com.matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Matrix Transpose
 * Problem Description
 *
 * You are given a matrix A, you have to return another matrix which is the transpose of A.
 *
 * NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row
 *
 *
 *
 * Problem Constraints
 * 1 <= A.size() <= 1000
 *
 * 1 <= A[i].size() <= 1000
 *
 * 1 <= A[i][j] <= 1000
 *
 * Input Format
 * First argument is vector of vector of integers A representing matrix.
 *
 *
 * Output Format
 * You have to return a vector of vector of integers after doing required operations.
 *
 * Example Input
 * Input 1:
 *
 * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Input 2:
 *
 * A = [[1, 2],[1, 2],[1, 2]]
 *
 *
 * Example Output
 * Output 1:
 *
 * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * Output 2:
 *
 * [[1, 1, 1], [2, 2, 2]]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]] we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 */
public class MatrixTranspose {
    public int[][] solve(int[][] A) {

        int n = A.length; // row
        int m = A[0].length; // column

        int[][] result = new int[m][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n,m;
        System.out.println("Enter N  Matrix A");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Enter M  Matrix A");
        m = input.nextInt();

        int[][]  mat1 = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++) {
                mat1[i][j] =  input.nextInt();
            }
        }


        MatrixTranspose obj = new MatrixTranspose();
        System.out.println(obj.solve(mat1));
    }
}

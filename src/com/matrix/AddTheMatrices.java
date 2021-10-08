package com.matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class AddTheMatrices {
    public int[][] solve(int[][] A, int[][] B) {

        int n = A.length; // row
        int m = A[0].length; // column

        int p = B.length; // row
        int q = B[0].length; // column

        int[][] result = new int[n][m];
        if(n == p && m == q ){

            for(int i=0;i<n;i++){
                for (int j=0;j<m;j++){
                    result[i][j] = A[i][j] + B[i][j];
                }

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

        int p,q;
        System.out.println("Enter P  Matrix B");
        p = input.nextInt();
        System.out.println("Enter Q  Matrix B");
        q = input.nextInt();

        int[][]  mat2 = new int[p][q];
        for (int i = 0; i < p; i++){
            for (int j = 0; j < q; j++) {
                mat2[i][j] =  input.nextInt();
            }
        }


        AddTheMatrices obj = new AddTheMatrices();
        System.out.println(Arrays.toString(obj.solve(mat1,mat2)));
    }
}

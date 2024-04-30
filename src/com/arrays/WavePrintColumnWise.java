package com.arrays;

import java.util.Scanner;

public class WavePrintColumnWise {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        for(int j=0; j<n; j=j+2) {

            if(j%2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(array[i][j] + " ");
                }
            }

            else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }

    }
}

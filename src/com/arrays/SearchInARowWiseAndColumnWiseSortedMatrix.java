package com.arrays;

import java.util.Arrays;

public class SearchInARowWiseAndColumnWiseSortedMatrix {

    public static void main(String[] args) {
        int[][] B = {{1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}};

        int[][] c = {{1, 2},
                {3, 3}};

        int[][] d = {{2,8,8,8},
                    {2,8,8,8},
                    {2,8,8,8}};

        System.out.println(solve(c,3));
    }

    /**
     * O(N) - Time Complexity!!
     * @param A
     * @param B
     * @return
     */
    public static int solve(int[][] A, int B) {

        int n = A.length;
        int m = A[0].length;

        int i = 0, j = m-1;
        int result = -1;
        int min = Integer.MAX_VALUE;
        while( i<n && j>=0){

            if(A[i][j] == B) {
                result = (((i+1)*1009) + (j+1));
                if(min>result){
                    min = result;
                }
            }

            if(A[i][j]>=B) {
                j--;
            } else if(A[i][j]<B)  {
                i++;
            }

        }
        if(min == Integer.MAX_VALUE){
            min = -1;
        }
        return min;

    }
}



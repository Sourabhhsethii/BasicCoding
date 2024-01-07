package com.assignment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BeggersProblem {

    public static void main(String[] args) {
        int[][] B = new int[3][3];

        B[0][0] = 1;
        B[0][1] = 2;
        B[0][2] = 10;

        B[1][0] = 2;
        B[1][1] = 3;
        B[1][2] = 20;

        B[2][0] = 2;
        B[2][1] = 5;
        B[2][2] = 25;

        System.out.println(List.of(solve2(5, B )));
    }

    /**
     * TLE  O8(Q * N)
     * @param A
     * @param B
     * @return
     */
    public static int[] solve(int A, int[][] B) {
        int[] beggars = new int[A];

        for(int i=0;i<B.length;i++) {

            for(int j=B[i][0]-1 ;j <= B[i][1]-1; j++) {
                beggars[j] += B[i][2];
            }
        }
        return beggars;
    }

    /**
     * TLE  O8(Q + N)
     * @param A
     * @param B
     * @return
     */
    public static int[] solve2(int A, int[][] B) {
        int[] beggars = new int[A];

        for(int i=0;i<B.length;i++) {

            int l = B[i][0]-1;
            int r = B[i][1]-1;

            beggars[l] +=  B[i][2];
            if(r < beggars.length-1) {
                beggars[r+1] -=  B[i][2];
            }

        }

        /**
         *   Prefix Sum
         **/

        int sum = beggars[0];
        for(int i=0;i<A;i++){
            sum = sum + beggars[i];
            beggars[i] = sum;
        }



        return beggars;
    }
}

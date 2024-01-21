package com.assignment;

import java.util.Arrays;

public class XorQueries {

   public static int[][] temp = null;

    public static void main(String[] args) {
        int[] A = {1,0,0,0,1};
        int[][] B = {{2,4}, {1,5},{3,5} };
        System.out.println(Arrays.toString(solve(A,B)[2]));
    }


    @Override
    public String toString() {
        return "XorQueries{}";
    }

    public static int[][] solve(int[] A, int[][] B) {

         temp = new int[B.length][B[0].length];

        for(int i=0; i<B.length;i++){
            int l = B[i][0] - 1;
            int r = B[i][1] - 1;

            int xored =  xoredQuery(A,l,r);
            int countUnsetBit = countUnsetBit(A,l,r);

            temp[i][0] = xored;
            temp[i][1] = countUnsetBit;
        }

        return temp;



    }

    static int  xoredQuery(int[] A, int L, int R ){
        int xored = 0;
        for(int i=L; i<=R;i++){
            xored ^= A[i];
        }
        return xored;
    }

    static int  countUnsetBit(int[] A, int L, int R) {
        int countUnSetBitSum = 0;
        for(int i=L; i<=R;i++){
            if(!((A[i]&1) == 1)){
                countUnSetBitSum++;
            }
        }
        return countUnSetBitSum;
    }

}

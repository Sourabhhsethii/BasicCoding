package com.arrays;

public class SpiralOrderMatrixII {

    public static void main(String[] args) {
        int[][] result = generateMatrix(1);
        System.out.println(result);
    }

    public static int[][] generateMatrix(int A) {

        int[][] result = new int[A][A];
        int number = 0;
        int i =0, j= 0;
        while(A > 0) {

            for (int k=1;k<=A-1;k++) {
                result[i][j] =  ++number;
                j++;
            }

            for(int k=1;k<=A-1;k++) {
                result[i][j] = ++number;
                i++;
            }

            for (int k=1;k<=A-1;k++){
                result[i][j] = ++number;
                j--;
            }

            for (int k=1;k<=A-1;k++){
                result[i][j] = ++number;
                i--;
            }

            if(A == 1){
                for (int k=1;k<=A;k++){
                    result[i][j] = ++number;
                    i++;
                }
            }

            A = A-2;
            i++;
            j++;

        }

        return result;

    }

}

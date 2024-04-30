package com.arrays;

public class SearchInMatrix {
    public static void main(String[] args) {

        int[][] temp = {{2,8,8,8},{2,8,8,8},{2,8,8,8}};

        System.out.println(solve(temp,2));

    }

    public static int solve(int[][] A, int B) {


        int i = 0;
        int rsize = A.length;
        int j = A[0].length-1;
        int result = -1;
        while(i<rsize && j>=0){

            if(A[i][j] > B) {
                j--;
            } else if(A[i][j] < B) {
                i++;
            } else  {
                for (int k = j;k>=0;k--){
                    if(A[i][k] == B){
                        result = ((i+1) * 1009 + (k+1));
                    }
                }
                break;
            }

        }
        return result;
    }

}

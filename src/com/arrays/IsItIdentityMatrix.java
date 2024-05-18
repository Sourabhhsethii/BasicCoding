package com.arrays;

public class IsItIdentityMatrix {

    public int solve(final int[][] A) {

        int result = 1;
        outerloop:
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                if(i == j){
                    if(A[i][j]==0){
                        result = 0;
                        break outerloop;
                    }
                }

                if(i>j || j>i) {
                    if (A[i][j]!=1){
                        result = 0;
                        break outerloop;
                    }
                }
            }
     }

        return result;
    }



}

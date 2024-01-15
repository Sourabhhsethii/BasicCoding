package com.assignment;

public class SpecialSubsequencesAG {

    public static void main(String[] args) {
        System.out.println(solve("AGAG"));
    }

    public static long solve(String A) {
        long count = 0;
        long ans = 0;
        long n = A.length();

        /**
         *-> O(N)
         **/
        for(long i=n-1;i>=0;i--){
            if(A.charAt((int)i)== 'G'){
                count++;
            } else if(A.charAt((int)i) == 'A'){
                ans = ans + count;
            }
        }
        return ans;
    }
}

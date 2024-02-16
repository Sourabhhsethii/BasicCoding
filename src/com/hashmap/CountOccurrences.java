package com.hashmap;

/**
 Problem Description
 Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 */
public class CountOccurrences {
    public static void main(String[] args) {
        System.out.println(solve("bobbobobob"));
    }

    /**
     * bob -> length of the 3 Char
     * O(N)
     * @param A
     * @return
     */
    static public int solve(String A) {

        int result = 0;
        for(int i=0;i<A.length()-2;i++){
            if(A.charAt(i)== 'b' && A.charAt(i+1)== 'o' && A.charAt(i+2)== 'b'){
                result++;
            }
        }
        return result;

    }
}

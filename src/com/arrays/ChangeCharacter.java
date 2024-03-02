package com.arrays;

import java.util.HashSet;

/**
 * Problem Description
 * You are given a string A of size N consisting of lowercase alphabets.
 *
 * You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
 *
 * Find the minimum number of distinct characters in the resulting string.
 */
public class ChangeCharacter {
    public static void main(String[] args) {
        System.out.println(solve("abcabbccd", 3));
    }

    public static int  solve(String A, int B) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<A.length();i++){
            if (!hs.contains(A.charAt(i))) {
                hs.add(A.charAt(i));
            }
        }

        if(hs.isEmpty()){
            return 1;
        } else if(B == 0){
            return hs.size();
        } else {
            return hs.size() - B;
        }
    }
}

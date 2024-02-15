package com.hashmap;

import java.util.HashMap;

/**
 *
 *  Is Dictionary?
 * Problem Description
 * Surprisingly, in an alien language, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
 *
 * Given an array of words A of size N written in the alien language, and the order of the alphabet denoted by string B of size 26, return 1 if and only if the given words are sorted lexicographically in this alien language else, return 0.
 */
public class IsDictionary {
    public static void main(String[] args) {
        String[]  test ={"fine","none","no"};
        System.out.println(solve2(test,"qwertyuiopasdfghjklzxcvbnm"));
    }

    // O(N^2)
    public static int solve2(String[] A, String B) {

        HashMap<Character,Integer> dicnMap = new HashMap<Character,Integer>();
        // Create Dictionary
        for(int i=0;i<B.length();i++) {
            dicnMap.put(B.charAt(i),i);
        }

        for(int i=0;i<A.length-1;i++) {
            //find difference between adajcent work
            int index = differenceIndex(A[i], A[i+1]);
            String a = A[i];
            String b = A[i+1];
            if(index>=0) {
                if(b.length()>index) {
                    if (dicnMap.get(a.charAt(index)) > dicnMap.get(b.charAt(index))) {
                        return 0;
                    }

                } else {
                    if (dicnMap.get(a.charAt(index)) > dicnMap.get(b.charAt(index-1))) {
                        return 0;
                    }
                }
            }
        }
        return 1;
    }

    public static int differenceIndex(String A, String B) {
        if(A.equalsIgnoreCase(B)) {
           return 0;
        }
        if(A == null || B == null){
            return 0;
        }
        int i;
        for(i=0;i<A.length() && i<B.length();++i){
            if(A.charAt(i) != B.charAt(i)){
                break;
            }
        }
        if(i<B.length() || i<A.length()){
            return i;
        }
        return -1;
    }

    public static int solve(String[] A, String B) {

        HashMap<Character,Integer> dicnMap = new HashMap<Character,Integer>();
        // Create Dictionary
        for(int i=0;i<B.length();i++) {
            dicnMap.put(B.charAt(i),i);
        }

        int[] temp = new int[A.length];
        for(int i=0;i<A.length;i++) {
            char firstChar = A[i].charAt(0);
            int orderNo = dicnMap.get(firstChar);
            temp[i] = orderNo;
        }

        for(int i=0;i<A.length-1;i++) {
            if(temp[i] > temp[i+1]) {
                return 0;
            }
        }

        return 1;

    }
}

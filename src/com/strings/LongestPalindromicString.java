package com.strings;

/**
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring in A.
 *
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 *
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 *
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 */
public class LongestPalindromicString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome2("aaaaba"));
    }

    public static String longestPalindrome2(String A) {

        int max =1;
        int n = A.length();
        String result = "";
        for (int i =0;i<n;i++) {

            String odd = expand(A,n/2,n/2);
            if(max < odd.length()){
                max = odd.length();
                result = odd;
            }
            String even = expand(A,n/2,n/2+1);
            if(max < even.length()){
                max = even.length();
                result = even;
            }

        }

        return result;

    }

    public static String  expand(String A, int i, int j) {

        String result = "";
        StringBuilder left = new StringBuilder();
        StringBuilder right  = new StringBuilder();

        while(i>0 && j<A.length() && A.charAt(i) == A.charAt(j)) {
            left.append(A.charAt(i));
            right.append(A.charAt(j));
                i--;
                j++;

        }
        result = left.reverse().toString() + result.toString();
        return result;
    }

    public static String longestPalindrome(String A) {

        int max =0;
        int n = A.length();
        String result = "";
        for (int i =0;i<n;i++){
            for(int j =i;j<n;j++){
                // all substring are here!!!

                StringBuilder checkPalindrome =  new StringBuilder();

                for(int k=i;k<=j;k++) {
                    checkPalindrome.append(A.charAt(k));
                }

                if(checkPalindrome.toString().equalsIgnoreCase(checkPalindrome.reverse().toString())) {
                    if(max < checkPalindrome.length()){
                        max = checkPalindrome.length();
                        result = checkPalindrome.toString();
                    }
                }

            }
        }

        return result;

    }

}

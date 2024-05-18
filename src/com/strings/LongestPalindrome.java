package com.strings;

public class LongestPalindrome {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("bacc"));
    }

    public static String longestPalindrome(String A) {


        int n = A.length();
        if (n == 0)
            return "";
        String longest = A.substring(0, 1);
        for(int mid = 0; mid<n;mid++){
            int s = mid;
            int e = mid;
            while (s>=0 && e<n && A.charAt(s) == A.charAt(e)){
                s--;
                e++;
            }
            String result =  A.substring(s + 1, e);
            if (result.length() > longest.length())
                longest = result;

        }

        for(int mid = 0; mid<n;mid++){
            int s = mid;
            int e = mid+1;
            while (s>=0 && e<n && A.charAt(s) == A.charAt(e)){
                s--;
                e++;
            }
            String result =  A.substring(s + 1, e);
            if (result.length() > longest.length())
                longest = result;
        }


        return longest;

    }

}

package com.assignment;

public class FirstOccurrence {

    public static void main(String[] args) {

        System.out.println(solve("abc,",97));
    }

    public static int solve(final String A, final int B) {
        int ans = -1;
        for(int i=0;i<A.length();i++){
            int code = (int)A.charAt(i);
            if(code == B) {
                ans = i;
                break;
            }
        }
        return ans;
    }
}

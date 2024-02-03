package com.strings;

import com.oca.training.udemy.test.classes.B;

public class ModString {
    public static void main(String[] args) {
        System.out.println(findMod("23",25));
    }
    public static int findMod(String A, int p) {

        int ans = 0, pow = 1;
        int N = A.length();
        for (int i=N-1;i>=0;i--) {
            ans = ans + Integer.valueOf(A.charAt(i)) * pow;
            ans = ans % p;
            pow = (pow * 10) % p;
        }

        return ans;
    }

}

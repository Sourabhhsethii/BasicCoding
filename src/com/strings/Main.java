package com.strings;

public class Main {

    public static void main(String[] args) {
        System.out.println(solve("TEST"));
    }

    public static String solve(String A) {
        String ans = "";
        A.toLowerCase();
        int size = A.length();
        for(int i=0;i<size;i++){
            int value = A.charAt(i)+32;
            char changedValue = (char) value;
            ans = ans + changedValue;
        }
        return ans;
    }
}

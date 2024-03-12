package com.recursion;

import java.util.Scanner;

public class PrintReverseString {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        reverse(str,str.length()-1);

    }

    public static void reverse(String str, int index) {
        // Base Condition
        if(index == -1){
            return;
        }

        // First print last chara.
        System.out.print(str.charAt(index));

        // Recusive Work
        reverse(str, --index);

    }

}

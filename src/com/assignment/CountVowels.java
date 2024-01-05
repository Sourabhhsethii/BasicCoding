package com.assignment;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output

        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        for(int i=0;i<=testCase;i++) {
            int noOfVowels = 0;
            int consonants = 0;
            String input = sc.nextLine();
            for(int jIndex=0;jIndex<input.length();jIndex++) {
                if ( input.charAt(jIndex) == 'a' ||
                        input.charAt(jIndex) == 'e' ||
                        input.charAt(jIndex) == 'i' ||
                        input.charAt(jIndex) == 'o' ||
                        input.charAt(jIndex) == 'u'){
                    noOfVowels++;
                }
            }


                consonants = Math.abs(input.length() - noOfVowels);
            if(noOfVowels != 0 &&  consonants!=0) {
                System.out.println(noOfVowels + " " + consonants);
            }
        }

    }
}

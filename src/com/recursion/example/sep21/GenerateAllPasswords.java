package com.recursion.example.sep21;

import java.util.Scanner;

/*
You are given a set of characters. You need to generate all possible passwords from them. For this,
you need to find all possible permutations of the given characters.

Approach
Recursion can be used here to find the solution.
You can make a helper function and pass all the possible lengths and an empty string to it.
Keep appending all the characters in the string one by one to the current string in the helper function.
Then, recur to fill the remaining string until the desired length is reached.
 */
public class GenerateAllPasswords {

    static void genPW(char[] arr, int n) {

        for (int i=0;i<=n;i++){
            generatedAllCombinationOfPassword(arr, i, "",n);
        }
    }

    static void generatedAllCombinationOfPassword(char[] arr, int iteration, String possibleCombination, int len){
        if(iteration == 0){
            System.out.println(possibleCombination);
            return;
        }

         for (int i=0; i< len; i++){
             String combination = possibleCombination + arr[i];
             generatedAllCombinationOfPassword(arr,iteration-1, combination,len);
         }

    }


    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.next().charAt(0);
        genPW(arr, n);
    }

}


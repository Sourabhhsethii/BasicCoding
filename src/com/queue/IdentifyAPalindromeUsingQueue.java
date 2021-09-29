package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Identify a palindrome using Queue
 * Description
 * Given an input string of unknown length, write a program to check whether the string is a palindrome or not using a queue data structure. If the string comes out to be a palindrome, then print “ The given input is a palindrome.”  else print “ The given input is not a palindrome.” . Your program should take the following as input from the user:
 *
 * The string to be checked for palindrome.
 *
 * Note: The input is to be taken as a string and it should be case sensitive.
 *
 * Sample Input 1:
 * DAD
 * Sample Output 1:
 * The given input is a palindrome.
 * Sample Input 2:
 * .&.*.&.
 * Sample Output 2:
 * The given input is a palindrome.
 * Sample Input 3:
 * abca
 * Sample Output 3:
 * The given input is not a palindrome.
 */
public class IdentifyAPalindromeUsingQueue {
    public void checkPalindrome(String input) {

        String reverse = "";
        Queue<Character> queue = new LinkedList<>();

        for (int i=input.length()-1;i>=0;i--){
            queue.add(input.charAt(i));
        }
        while (!queue.isEmpty()){
            reverse += queue.remove();
        }

        if(input.equalsIgnoreCase(reverse)){
            System.out.println("The given input is a palindrome.");
        } else {
            System.out.println("The given input is not a palindrome.");
        }
    }
    public static void main(String[] args) {
        IdentifyAPalindromeUsingQueue obj = new IdentifyAPalindromeUsingQueue();
        Scanner in = new Scanner(System.in);
        String inputString = in .nextLine();
        obj.checkPalindrome(inputString);

    }

}

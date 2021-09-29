package com.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Identify a Palindrome Using a Stack
 * Write an algorithm to determine whether or not a given string is a palindrome, using stacks.
 *
 * A palindrome is a word, string, phrase or sentence that reads the same when read backward as well as forward. For example, 'MALAYALAM'.
 * Since queues and stacks are one of the most frequently used data structures for storing and modifying information
 */
public class IdentifyAPalindromicUsingStack {

    public static boolean check(String word){

        Stack<Character> palindromeStack= new Stack();
        Stack<Character> reveredStack= new Stack();
        boolean check = false;

        for (int i=0;i<word.length();i++){
            palindromeStack.push(word.charAt(i));
        }
        reveredStack.push(palindromeStack.pop());

        for(int i=0;i<word.length();i++) {
            if (!reveredStack.isEmpty()){
                if (word.charAt(i) == reveredStack.peek()) {
                    reveredStack.pop();
                    check = true;
                } else {
                    check = false;
                    break;
                }
        }
        }
        return check;
    }

    public static void main(String[] args) {
        String word = "";
        Scanner input = new Scanner(System.in);
        word = input.next();
        System.out.println(check(word));
    }
}

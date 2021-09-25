package com.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse a string using a stack.
 * Description
 * You are given a string and you have to print the reverse of the string using a stack.
 *
 * Input Format
 * A string which has to be reversed.
 * Output Format
 * The reverse of the input string
 * Sample Input 1:
 * abcd
 * Sample Output 1:
 * dcba
 * Sample Input 2:
 * abcdef
 * Sample Output 2:
 * fedcba
 */
public class ReverseAStringUsingAStack {

        public static void main(String arg[]) {
            Stack<Character> s = new Stack<Character>();
            Scanner in = new Scanner(System.in);
            String data = in.nextLine();
            String reverse = "";

            for (int i=0;i<data.length();i++){
                s.push(data.charAt(i));
            }

            while (!s.isEmpty()){

                reverse += s.pop();
            }

            System.out.println(reverse);

        }
}

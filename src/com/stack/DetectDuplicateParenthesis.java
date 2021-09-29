package com.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Detect duplicate parenthesis
 *
 * Description
 * Write a program that can evaluate a given balanced expression for the duplicate parenthesis if it contains. If the expression includes duplicate parenthesis then print “Input string contains duplicate parenthesis” else print “Input string does not contain duplicate parenthesis”.
 *
 * Your application should take the following as input:
 * The input string in a single line without any space between the characters.
 *
 * Note: The program should only test for duplicate parenthesis which means the other brackets ‘{‘ or ‘[‘ will be just as normal characters like ‘a’ or ‘1’
 * Sample Input:
 * (((a+1))+(b+1))
 *
 * Sample output:
 * Input string contains duplicate parenthesis
 * Sample Input:
 * (909)
 *
 * Sample output:
 * Input string does not contain duplicate parenthesis
 */
public class DetectDuplicateParenthesis {

    public static String findDuplicateParenthesis(String inputString) {

        Stack<Character> st = new Stack<Character>();
        String ans = "Input string does not contain duplicate parenthesis";
        // O(n) - Time Complexity
        // O(n) - Space Complexity
        for (int i=0;i<inputString.length();i++){
            if(!(inputString.charAt(i) == ')')){
                st.push(inputString.charAt(i));
            } else if (inputString.charAt(i) == ')'){
                if(st.peek()!= '('){
                    while(st.peek()!= '('){
                        st.pop();
                    }
                } else
                 if(st.peek()== '(') {
                    ans = "Input string contains duplicate parenthesis";
                    break;
                }
            }
        }

        if(st.isEmpty())
            ans = "Input string does not contain duplicate parenthesis";

        return ans;

    }


    public static void main(String[] args){
        DetectDuplicateParenthesis obj = new DetectDuplicateParenthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));

    }

}

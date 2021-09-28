package com.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Reverse the elements
 * Description
 * You are given a stack with n integers. You need to reverse the last half of the elements i.e. floor(n/2) elements
 * from the bottom of the stack using recursion and print the elements of the stack.
 * Note : Floor function takes input as a real number and it returns the greatest integer less than or equal to the input.
 * Ex. floor(5.4) will give output as 5 and floor(4) will give 4.
 *
 * Example:
 * Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 * Output: [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 *
 * Stack(bottom -> top) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 * Output: [1, 2, 3, 4, 5, 6, 11, 10, 9, 8, 7]
 *
 * Input Format:
 * 12
 * 1 2 3 4 5 6 7 8 9 10 11 12
 *
 * Output format:
 * [1, 2, 3, 4, 5, 6, 12, 11, 10, 9, 8, 7]
 */
public class StackProblemReverseElements {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        reverseSecondHalf(stack);
    }

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalf(Stack<Integer> stack) {
        int size = stack.size();
        int i = (int)Math.floor(size/2);

        ArrayList<Integer> popedArrayFirstHalf = new ArrayList<>();
        ArrayList<Integer> popedArraySecondHalf = new ArrayList<>();
        ArrayList<Integer> finalArray = new ArrayList<>();
        while (i>0){
            popedArraySecondHalf.add(stack.pop());
            i--;
        }

        while (stack.size() > 0){
            popedArrayFirstHalf.add(stack.pop());
        }


         for(int j =popedArrayFirstHalf.size()-1;j>=0;j--){
             finalArray.add(popedArrayFirstHalf.get(j));
        }

        for(int j =0;j<popedArraySecondHalf.size();j++){
            finalArray.add(popedArraySecondHalf.get(j));
            //System.out.print( popedArraySecondHalf.get(j) + " " );
        }

        System.out.println(finalArray.toString());
    }
}

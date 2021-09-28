package com.stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * Sort the stack
 * Description
 * You are given a stack with n integers. You need to sort the elements of the stack in ascending order such that the minimum value is at the bottom-most position of the stack.
 * Input Format:
 * The first line of input is the number of elements in the stack. The next line of input consists n space separated integers in the order bottom to top.
 * Output Format:
 * The output is sorted stack with minimum value at bottom of the stack and maximum value at the top of the stack.
 * Example:
 * Stack(bottom -> top) = [6, 12, 3, 4]
 * Output: [3, 4, 6,12]
 *
 * Sample Input:
 * 12
 * 6 12 3 4 5 1 7 8 10 9 11 2
 *
 * Sample Output:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 *
 * Note: You can use extra stack if needed.
 */
public class SortTheStack {

    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            stack.push(s.nextInt());
        sort(stack);
    }

    // Method to sort the elements of the stack in ascending order
    static void sort(Stack<Integer> stack) {

        Stack<Integer> tmpStack = new Stack<Integer>();
        while (!stack.isEmpty()){
            int temp = stack.pop();

            while (!tmpStack.isEmpty() && tmpStack.peek()>temp){
                stack.push(tmpStack.pop());

            }
            tmpStack.push(temp);
        }

        System.out.println(tmpStack.toString());
    }

}

package com.stack;


import java.util.Scanner;
import java.util.Stack;

/**
 * Find kth largest element
 * Description
 * Write a code to find the kth largest number of the given sequence in a stack. Your program should take the following lines of input:
 *
 * The number of elements in the input stack.
 * The elements in the input stack.
 * The value of ‘k’.
 * Note:
 *
 * If the input stack is empty, your program should print “ stack is empty”.
 * If the value of ‘k’ is greater than the number of elements in the input stack, then print “ invalid input”
 */
public class FindktLargestElement {
    // This function returns the sorted stack
    public static Stack < Integer > sortStack(Stack < Integer > input) {
        int tempNumber = 0;
        Stack < Integer > tempStack = new Stack<>();
        while(!input.isEmpty()){
            tempNumber = input.pop();
            while (!tempStack.isEmpty() && tempNumber < tempStack.peek()) {
                    input.push(tempStack.pop());
                }
            tempStack.push(tempNumber);
            }
        return tempStack;
        }

    public static void findKthLargestNum(Stack <Integer> sortedStack, int k) {

        while (k > 1){
            sortedStack.pop();
            k--;
        }
        System.out.print(sortedStack.peek());
    }


    public static void main(String args[]) {
        Stack < Integer > inputStack = new Stack< Integer >();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            inputStack.add( in .nextInt());
        }

        if (inputStack.isEmpty()) {
            System.out.println("stack is empty");
            System.exit(0);
        }

        int k = in .nextInt();
        if (k > inputStack.size()) {
            System.out.println("invalid input");
            System.exit(0);
        }

        // This is the temporary stack

        Stack < Integer > temp = sortStack(inputStack);
        findKthLargestNum(temp, k);

    }
}

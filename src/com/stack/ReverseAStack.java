package com.stack;

import java.util.Scanner;

/**
 * Reverse a stack
 * Description
 * Given an input sequence of characters stored in a stack and the stack is created using a linked list. Write a code to reverse the elements within the stack without using any auxiliary memory or recursive algorithm. Your code should take following lines of input:
 * The number of elements to be reversed in the stack.
 * The elements to be reversed in the stack.
 * Note:
 *  If the stack is empty then, print "the stack is empty".
 * The stub code also prints the original list.
 *
 * Sample Input 1:
 * 8
 * A 1 B 2 C 3 D 4
 * Sample Output 1:
 * 4 D 3 C 2 B 1 A
 * A 1 B 2 C 3 D 4
 * Sample Input 2:
 * 0
 * Sample Output 2:
 * the stack is empty
 */
public class ReverseAStack {
    class Node {
        char data;
        Node next;
        public Node(char new_data) {
            data = new_data;
            next = null;
        }
    }

    Node top;

    // Push and pop operations
    public void push(char new_data) {

        Node new_node = new Node(new_data);
        if (top == null) {

            top = new_node;
        } else {
            new_node.next = top;
            top = new_node;


        }
    }

    public Node pop() {
        Node node = top;
        top = top.next;
        return node;
    }

    // prints contents of stack
    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Reverses the stack using simple
    // linked list reversal logic.
    public Node reverse() {

        Node prev = null;
        Node current = top;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
        return top;
    }

    public static void main(String[] args) {
        ReverseAStack obj = new ReverseAStack();
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        for (int i = 0; i < n; i++) {
            obj.push( in .next().charAt(0));

        }

        obj.display(obj.top);
        System.out.println(" ");
        // reverse
        Node temp = obj.reverse();
        if(temp == null){
            System.out.print("the stack is empty");
        } else {
            obj.display(temp);
        }


    }
}

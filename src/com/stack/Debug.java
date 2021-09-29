package com.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Debug {

    public static void main(String arg[]) {
        Queue<Integer> queue = new LinkedList();
        Stack<Integer> stack = new Stack<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        queue.add(9);
        queue.add(10);
        int count =0;

        while (!queue.isEmpty()) {
            count++;
            if (stack.isEmpty() || stack.peek() > queue.peek()) {
                int x = queue.remove();
                stack.push(x);

            } else {
                stack.pop();
            }
        }
        System.out.println(queue.toString());
        System.out.println(count);
    }
}
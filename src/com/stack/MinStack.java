package com.stack;

import java.util.Stack;

public class MinStack {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();
    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek()<=x) {
            minStack.add(x);
        }
    }

    public void pop() {
        if(stack.size()>=0) {
            int temp = stack.pop();
            if (temp == minStack.peek()) {
                minStack.pop();
            }
        }

    }

    public int top() {
        if(stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}

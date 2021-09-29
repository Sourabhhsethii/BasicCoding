package com.queue;

import java.util.*;
import java.lang.*;
import java.util.Queue;

/**
 * Queues
 * Description
 * Try to modify the queue to return the desired output.
 *
 * Input:
 * No input required
 *
 * Output:
 * [1, 4, 9, 14, 15]
 */
public class ExampleQueue {

    public static void main(String[] args) {
        Queue numbers = new LinkedList();
        List(numbers);

        numbers.remove();
        numbers.remove();
        numbers.remove();
        numbers.remove();
        numbers.remove();
        numbers.remove();
        numbers.remove();

        numbers.add(1);
        numbers.add(4);
        numbers.add(9);
        numbers.add(14);
        numbers.add(15);

        // Write your code here
        // You should only add some numbers, dequeue, or peek to change the elements in the queue
        // so that the queue becomes [1,4,9,14,15]

        System.out.println(numbers);
    }

    public static void List(Queue numbers) {
        int i = 0;
        while(i <= 12) {
            if(i%2==0) {
                numbers.add(i);
            }
            i++;
        }
    }
}

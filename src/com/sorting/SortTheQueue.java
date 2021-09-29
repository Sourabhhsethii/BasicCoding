package com.sorting;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Sort the queue
 * Description
 * You are given a queue with n integers. You need to sort the queue in ascending order such that the minimum value is at the head of the queue. The expected input is the the number of elements and the elements of the queue, you need to print the elements in the queue after they are sorted in ascending order.
 *
 * Example:
 * Queue (head -> tail)= [6, 12, 3, 4, 5, 1, 7, 8, 10, 9, 11, 2]
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 *
 * Input Format:
 * 12
 * 6 12 3 4 5 1 7 8 10 9 11 2
 *
 * Output format:
 * [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 *
 * Note: You can use extra queue if needed.
 */
public class SortTheQueue {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        sort(queue);
        System.out.println(queue);
    }

    // Method to sort the queue
    static void sort(Queue<Integer> list) {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() - i);
            insertMinToRear(list, min_index);
        }


    }
    // Queue elements after sortIndex are
    // already sorted. This function returns
    // index of minimum element from front to
    // sortIndex
    public static int minIndex(Queue<Integer> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();

            // This is dequeue() in Java STL
            list.poll();

            // we add the condition i <= sortIndex
            // because we don't want to traverse
            // on the sorted part of the queue,
            // which is the right part.
            if (current <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = current;
            }
            list.add(current);
        }
        return min_index;
    }

    // Moves given minimum element
    // to rear of queue
    public static void insertMinToRear(Queue<Integer> list,
                                       int min_index)
    {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            list.poll();
            if (i != min_index)
                list.add(current);
            else
                min_value = current;
        }
        list.add(min_value);
    }
}

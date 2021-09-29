package com.practice.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Description
 * You are given a queue with n integers. You need to delete the second half of the elements i.e., floor(n/2) elements from the head of the queue and print the remaining elements.
 *
 * floor(3.5) will give the output as 3, greatest integer less than or equal to the input
 * Input format:
 * The first line of input is an integer n denoting the size of the queue. The next line contains n space separated integers.
 * Output Format:
 * The output should be the remaining queue after deleting the required elements.
 * Example:
 * Queue(head -> tail) = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
 * Output: [1, 2, 3, 4, 5, 6]
 * Queue (head -> tail)= [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
 * Output: [1, 2, 3, 4, 5, 6]
 * Sample Input:
 12
1 2 3 4 5 6 7 8 9 10 11 12
 * Sample Output:
 * [1, 2, 3, 4, 5, 6]
 */
public class DeleteTheElements {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        int mid = (int) Math.floor(queue.size()/2);

        while(mid > 0){
            queue.remove();
            mid--;
        }

        System.out.println(queue.toString());

    }
}

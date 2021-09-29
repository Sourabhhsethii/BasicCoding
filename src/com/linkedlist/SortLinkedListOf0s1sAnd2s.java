package com.linkedlist;

import java.util.Scanner;

/**
 * You are given a linked list consisting of just 0s, 1s and 2s. You need to return the sorted linked list.

 * Approach
 *
 * Traverse the list and count the number of 0s, 1s and 2s. Let the counts be a, b and c, respectively.
 * Traverse the list again, fill the first a nodes with 0, then b nodes with 1, and finally, c nodes with 2
 * Sort a Linked List of 0s, 1s and 2s
 * Description
 * You are given a linked list consisting of just 0s, 1s and 2s. You need to return the sorted linked list.
 *
 * Input Format:
 *
 * The input contains the number of elements in the linked list, followed by the elements in the linked list.

 * Output Format:
 *
 * The output contains the sorted linked list.
 *
 * Sample Test Cases:
 *
 * Input:
 *
 * 5 1 0 2 1 0

 * Output:
 *
 * 0 0 1 1 2

 * Input:
 *
 * 8 0 1 2 0 2 1 0 2

 * Output:
 *
 * 0 0 0 1 1 2 2 2
 */
public class SortLinkedListOf0s1sAnd2s {

    public static void main(String[] args) {

        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        LinkedList li = new LinkedList();

        for(int i = 0; i < n; i++)
        {
            int a;
            a = s.nextInt();
            li.push(a);
        }

        li.sortList();
        li.printList();
    }

}

class LinkedList
{
    Node head;

    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

    void sortList()
    {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        Node temp = head;

        while(temp != null){
            if(temp.data == 0){
                count0++;
            } else if(temp.data == 1){
                count1++;
            } else if(temp.data == 2){
                count2++;
            }
            temp = temp.next;
        }

        head = null;

        while (count2>0){
            this.push(2);
            count2--;
        }


        while (count1>0){
            this.push(1);
            count1--;
        }

        while(count0>0){
            this.push(0);
            count0--;
        }


    }

    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    void printList()
    {
        Node temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


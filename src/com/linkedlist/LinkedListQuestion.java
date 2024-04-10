package com.linkedlist;

/**
 * Problem Description
 * Design and implement a Linked List data structure.
 * A node in a linked list should have the following attributes - an integer value and a pointer to the next node.
 *
 * It should support the following operations:
 *
 * insert_node(position, value) - To insert the input value at the given position in the linked list.
 * delete_node(position) - Delete the value at the given position from the linked list.
 * print_ll() - Print the entire linked list, such that each element is followed by a single space (no trailing spaces).
 * Note:
 *
 * If an input position does not satisfy the constraint, no action is required.
 * Each print query has to be executed in a new line.
 */
public class LinkedListQuestion {

     public static Node head = null;

    public static class Node {
        int value;
        Node next;

        // Constructor
        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if(head == null)
          head = new Node(value);

        // Insert At First position...
        if(position ==1) {
            Node newNode = new Node(value);
            newNode.next = head.next;
            head = newNode;
        }

        // Insert At Kth position...

        int c = 0;
        Node temp = head;
        while (c<position-1) {
            c++;
            temp = temp.next;
        }
        Node newNode = new Node(value);
        newNode.next = temp.next;
        temp.next = newNode;

    }

    public static void delete_node(int position) {
        // @params position, integer
        // Delete At First position...
        if(position ==1){
            head = head.next;
        }
        // Delete At Kth position...
        Node temp = head;
        int c = 0;
        while (c<position-1) {
            c++;
            temp = temp.next;
        }
        temp.next = temp.next.next;

    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        while(temp.next!= null) {
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }
}

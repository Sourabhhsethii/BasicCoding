package com.linkedlist;

import java.security.PublicKey;
import java.util.Scanner;

/**
 * Implement Linked List
 */
public class ImplementLinkedList {

    Node head;

    // Node Class Used for storing data and pointer to next node.
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }

    public void addNodeInLinkedList(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void printLinkedList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int n;
        ImplementLinkedList linklist = new ImplementLinkedList();
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int i = 0; i < n; i++)
            linklist.addNodeInLinkedList(s.nextInt());

        linklist.printLinkedList();
    }
}



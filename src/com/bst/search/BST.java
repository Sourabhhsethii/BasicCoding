package com.bst.search;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}
class Tree {
    Node root;

    Tree() {
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i) {
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the height of a binary tree
    public int findHeight(Node node) {
        if(node == null)
            return 0;
        else {
            int ld = findHeight(node.left);
            int rd = findHeight(node.right);
            if(ld>rd){
                return (ld +1);
            } else {
                return (rd +1);
            }
        }
    }

    // Method to traverse the elements of a tree using BFS (level-order traversal) in iterative way using queue
    void levelOrderOrBFS() {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            System.out.print(temp.data + " ");

            // enqueue left child into queue
            if (temp.left != null)
                queue.add(temp.left);

            // enqueue right child into queue
            if (temp.right != null)
                queue.add(temp.right);
        }
    }

    Node insert(Node node, int key){
        if(node == null){
            node = new Node(key);
            return node;
        }
        if(key < node.data) {
            node.left = insert(node.left, key);
        }  else if(key > node.data) {
            node.right = insert(node.right, key);
        }
        return node;
    }

    void printInorderBST(Node node){

        if(node == null){
            return;
        }
        printInorderBST(node.left);
        System.out.print(node.data+" ");
        printInorderBST(node.right);

    }

    // Method to search for a node with given key in a BST
    boolean search(Node node, int key) {
        if (node == null)
            return false;

        if (key == node.data)
            return true;

        if (key < node.data)
            return search(node.left, key);
        else
            return search(node.right, key);
    }
}
public class BST {

    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.root = new Node(4);
        bst.root.right =  new Node(2);
        bst.root.left = new Node(6);

        bst.printInorderBST(bst.root);
        bst.insert(bst.root,3);
        System.out.println("  ");
        bst.printInorderBST(bst.root);
    }
}

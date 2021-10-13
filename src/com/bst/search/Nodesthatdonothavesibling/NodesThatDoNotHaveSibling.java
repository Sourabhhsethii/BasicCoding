package com.bst.search.Nodesthatdonothavesibling;

import java.util.Scanner;

/**
 * Description
 * A sibling is a node that has the same parent.
 * In a binary search tree, there can be at the most one sibling. Print all such nodes in a single line that do not have a sibling.
 *
 * ﻿Input: The input will be in the following format:
 *
 * The first line will be ‘n’, which represents the number of elements to be inserted into the BST.
 * The next line will be n elements separated by spaces, which represents the elements to be inserted into the BST.
 *
 *
 * Output: The output should be in the following format:
 *
 * The values of all the nodes separated by spaces in a single line that do not have a sibling in the BST [first, the nodes of the left subtree (level wise from the top) are printed, followed by the ones in the right subtree in the same format].
 *
 *
 * Sample Input:
 *
 * 6
 *
 * 5 2 8 1 4 3
 *
 * Sample Output:
 *
 * 3
 *
 *
 *
 * Sample Input:
 *
 * 7
 *
 * 22 1 45 27 19 41 3
 *
 * Sample Output:
 *
 * 19 3 27 41
 *
 *
 *
 * Note that the root node should not be printed because there is no parent of the root node to determine whether it is a sibling or not.
 */
public class NodesThatDoNotHaveSibling {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if (size <= 0) {
            System.out.println("Size should be a positive integer");
        } else {
            int[] elementsArr = new int[size];
            for (int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            tree.printSingles(tree.root);
        }
    }

    static class Node {
        int data;
        Node left, right;

        Node(int value) {
            data = value;
            left = right = null;
        }
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        void insert(int key) {
            root = insertRec(root, key);
        }

        // A recursive function to insert a new key in BST
        Node insertRec(Node root, int key) {

            if (root == null) {
                root = new Node(key);
                return root;
            }

            if (key < root.data)
                root.left = insertRec(root.left, key);
            else if (key > root.data)
                root.right = insertRec(root.right, key);

            return root;
        }

        //Function to print nodes that dont have a sibling
        void printSingles(Node node) {

            if (node.left != null && node.right != null) {

                printSingles(node.left);
                printSingles(node.right);
            } else if(node.right != null){
                System.out.print(node.right.data + " ");
                printSingles(node.right);
            } else  if (node.left != null) {
                System.out.print(node.left.data+ " ");
                printSingles(node.left);
            }


        }
    }
}

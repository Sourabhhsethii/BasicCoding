package com.bst.search.lowestcommonancestorinBST;

import java.util.Scanner;

/**
 *
 * Lowest common ancestor in BST
 * Description
 * You are given the root of the tree which is “root” in the program and nodes n1 and n2, you have to print the LCA of the nodes n1 and n2.
 *
 * Note: Both the nodes n1 and n2 will be present in the tree.
 *
 *
 *
 * Input: The input will be in the following format:
 *
 * The first line will be ‘n’, which represents the number of elements to be inserted into the BST.
 * The next line will be n elements separated by spaces, which represents the elements to be inserted into the BST. The code for inserting the values in the tree has been addressed in the code.
 * The next line will be the value of node n1.
 * The next line will be the value of node n2.
 *
 *
 * Output: The output should be in the following format:
 *
 *        The value of the lowest common ancestor of nodes n1 and n2
 *
 *
 * Sample Input:
 *
 * 15
 *
 * 12 6 18 3 9 15 20 1 11 19 10 18 31 4 21
 *
 * 3
 *
 * 10
 *
 * Sample Output:
 *
 * 6
 *
 *
 *
 * Sample Input:
 *
 * 5
 *
 * 8 7 15 2 20
 *
 * 7
 *
 * 2
 *
 * Sample Output:
 *
 * 7
 */
public class LowestCommonAncestorInBST {
    public static void main(String[] x) {
        BST bst = new BST();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size>0){
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
                bst.insert(elementsArr[i]);
            }

            int n1 = sc.nextInt();
            int n2 = sc.nextInt();

            Node lca = bst.lca(bst.root, n1, n2);
            System.out.print(lca.data);
        }
        else
            System.out.println("Size should be a positive integer");
    }
}
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class BST {
    Node root;

    BST() {
        root = null;
    }

    // Method to construct a binary tree from the given array
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

    // Method to find the lowest common ancestor of two nodes - n1 and n2
    Node lca(Node node, int n1, int n2) {
        if(node == null)
        return null;

        if(node.data > n1 && node.data > n2){
            return lca(node.left,n1,n2);
        }
        if(node.data < n1 && node.data < n2){
            return lca(node.right,n1,n2);
        }
        return node;
    }
}
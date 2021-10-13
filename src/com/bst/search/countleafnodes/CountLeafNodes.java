package com.bst.search.countleafnodes;

import java.util.Scanner;

/**
 * Description
 * A node is a leaf node if its left and right child nodes are NULL.
 *
 *
 *
 * Consider the example of the following binary search tree:
 *
 * Here, the leaf nodes would be 4, 10, 22 and 14 because they are the only ones that do not have any children (neither left child nor right child). Thus, when the input is the tree given above, the output is 4.
 *
 *
 *
 * Input: The input will be in the following format:
 *
 * The first line will be ‘n’, which represents the number of elements to be inserted into the BST.
 * The next line will be n elements separated by spaces, which represents the elements to be inserted into the BST.
 *
 *
 * Output: The output should be in the following format:
 *
 *        The value of the number of leaf nodes
 *
 *
 *
 *
 *
 * Sample Input:
 *
 * 7
 *
 * 20 8 4 22 12 10 14
 *
 * Sample Output:
 *
 * 4
 *
 *
 *
 * Sample Input:
 *
 * 6
 *
 * 3 4 2 5 7 1
 *
 * Sample Output:
 *
 * 2
 */
public class CountLeafNodes {
    public static class Node
    {
        int data;
        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    public static class BinaryTree
    {
        Node root;

        BinaryTree() {
            root = null;
        }

        // Function to insert in the BST
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

        int getLeafCount()
        {
            return getLeafCount(root);
        }

        int getLeafCount(Node node)
        {
           if(node.right == null || node.left == null){
               return 1;
           } else {
               return getLeafCount(node.right) + getLeafCount(node.left);
           }
        }
    }

    public static void main(String[] args)
    {

        BinaryTree tree = new BinaryTree();
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();

        if(size<= 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
                tree.insert(elementsArr[i]);
            }
            System.out.println(tree.getLeafCount());
        }
    }
}

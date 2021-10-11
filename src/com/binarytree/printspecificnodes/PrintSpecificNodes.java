package com.binarytree.printspecificnodes;

import java.util.Scanner;

/**
 * Print Specific Nodes
 * Description
 * You are given a binary tree. You need to print all the nodes that are
 * multiples of the root node. The nodes that are multiples of the root node should be printed using in-order traversal.
 * ﻿Output: 20 10 25 5 15 30
 *
 * Here, nodes that are multiples of root node 5 are 5, 10, 15, 20, 25 and 30. These nodes should be printed using in-order traversal. The resulting output will be 20 10 25 5 15 30.
 *
 *
 *
 * Input:
 *
 * The input will be in the following format:
 *
 * The first line should be the number ‘n’. Here, ‘n’ represents the number of nodes present in the binary tree.
 * The second line contains space-separated ‘n’ values. These are the values of respective nodes. The code for inserting the values in the tree has already been addressed in the code.
 *
 *
 * Output:
 *
 * The output should be all the nodes that are multiples of the root node. Note: Print the nodes using inorder traversal separated by spaces.
 *
 *
 *
 *
 *
 * Sample Input:
 *
 * 5
 *
 * 3 4 5 6 7
 *
 * Sample Output:
 *
 * 6 3
 *
 *
 *
 * Sample Input:
 *
 * 4
 *
 * 0 1 2 3
 *
 * Sample Output:
 *
 * Division by zero is undefined
 */


class Node{
    int data;
    Node left,right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

class Tree{
    Node root;

    Tree() {
        root = null;
    }

    // Method to construct a binary tree from the given array (Do not edit the code given below)
    public Node insertNode(int[] elementsArr, Node node, int i){
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);
            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to print nodes that are multiple of root node
    public void printNodes(Node node){

        if(node == null)
            return;

        printNodes(node.left);
        if(root.data != 0 && node.data % root.data == 0){
            System.out.print(node.data + " ");
        }
        printNodes(node.right);

    }
}

public class PrintSpecificNodes {
    public static void main(String[] x){
        Tree tree = new Tree();

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
            }
            tree.root = tree.insertNode(elementsArr,tree.root,0);
            if(tree.root.data == 0){
                System.out.println("Division by zero is undefined");
            } else {
                tree.printNodes(tree.root);
            }
        }
    }
}

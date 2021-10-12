package com.binarytree.spirallevelordertraversal;

import java.util.Scanner;

/**
 * Spiral Level-Order Traversal
 * Description
 * Consider the binary tree given below. You are required to print the spiral level-order traversal for it
 *
 * Input:
 *
 * The input will be in the following format:
 *
 * The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
 * The second line contains space-separated ‘n’ values. This is the level-order traversal of the tree. The code for inserting the values in the tree for the given level-order traversal has been addressed in the code.
 *
 *
 * Output:
 *
 * The output should be the spiral level-order traversal of the tree with the nodes separated by spaces.
 *
 *
 *
 * Sample Input:
 *
 * 5
 *
 * 1 2 3 4 5
 *
 * Sample Output:
 *
 * 1 2 3 5 4
 *
 *
 *
 * Sample Input:
 *
 * 4
 *
 * 8 2 5 6
 *
 * Sample Output:
 *
 * 8 2 5 6
 */
public class SpiralLevelOrderTraversal {
    public static void main(String[] x) {
        Tree tree = new Tree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++) {
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr, tree.root, 0);

            tree.spiralOrder();
        }
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

    // Method to traverse the elements of a tree using BFS (level-order traversal) in the spiral order
    void spiralOrder() {
        int h = height(root);
        boolean flag = false;
        for (int i = 1; i <= h; i++) {
            printNodesAtLevel(root, i, 1,flag);
            if(flag == true){
                flag = false;
            } else {
                flag = true;
            }
        }
    }


    int height(Node root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }

    // Method to print nodes at the given level
    void printNodesAtLevel (Node root, int level, int currentLevel, boolean flag) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else if(flag == true) {
            printNodesAtLevel(root.left, level, currentLevel + 1, flag);
            printNodesAtLevel(root.right, level, currentLevel + 1,flag);
        } else if(flag == false){
            printNodesAtLevel(root.right, level, currentLevel + 1, flag);
            printNodesAtLevel(root.left, level, currentLevel + 1, flag);
        }
    }
}

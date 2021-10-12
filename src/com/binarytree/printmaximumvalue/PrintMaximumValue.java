package com.binarytree.printmaximumvalue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Print Maximum Value
 * Description
 * You are given a binary tree.
 * You need to print the node that has the highest value in the binary tree using the BFS (Iterative) approach. If the tree is empty, the output should be -1.
 *Output: 10
 *
 * Here, in the given tree, the node that has the maximum value is 10. Therefore, the output is 10.
 *
 * Input:
 *
 * The input will be in the following format:
 *
 * The first line should be the number ‘n’. Here, the number ‘n’ is the total number of nodes present in the binary tree.
 * The second line contains space-separated ‘n’ values. No value should be equal to -1. The code for inserting the values in the tree has already been taken care of in the code.

 *
 * Output:
 *
 * The output should be the maximum value among all nodes in the tree.
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
 * 5
 *
 * Sample Input:
 *
 * 0
 *
 * Sample Output:
 *
 * -1
 */
public class PrintMaximumValue {
    public static void main(String[] x){
        BinaryTree tree = new BinaryTree();

        int size;
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();

        if(size == 0){
            System.out.println("-1");
        }

        else if (size < 0){
            System.out.println("Size should be a positive integer");
        }

        else{
            int[] elementsArr = new int[size];
            for(int i = 0; i < size; i++){
                elementsArr[i] = sc.nextInt();
            }

            tree.root = tree.insertNode(elementsArr,tree.root,0);

            System.out.println(tree.findMax(tree.root));
        }
    }
}

class Node {
    int data;
    Node left, right;

    public Node(int value) {
        data = value;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree(){
        root = null;
    }

    // Method to construct a binary tree from the given array
    public Node insertNode(int[] elementsArr, Node node, int i){
        if(i < elementsArr.length){
            node = new Node(elementsArr[i]);

            node.left = insertNode(elementsArr,node.left,2 * i + 1);
            node.right = insertNode(elementsArr,node.right,2 * i + 2);
        }
        return node;
    }

    // Method to find the largest value in the tree
    public int findMax(Node node)
    {
        int max = 0;
        if(node == null){
            return  -1;
        }

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.peek();
            queue.remove();
            if(max<temp.data){
                max = temp.data;
            }

            // enqueue left child into queue
            if (temp.left != null)
                queue.add(temp.left);

            // enqueue right child into queue
            if (temp.right != null)
                queue.add(temp.right);
        }


        return max;
    }
}

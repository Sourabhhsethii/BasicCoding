package com.bst.search.roottoleafpaths;

import java.util.Scanner;

/**
 * Description
 * Suppose a binary tree such as this one has been provided.﻿
 *
 * Since there are leaf nodes in this case, all the paths from the root node to the leaf nodes would be as follows:
 *
 * 10 8 3
 *
 * 10 8 5
 *
 * 10 2 2
 *
 *
 *
 * Input: The input will be in the following format:
 *
 * The first line will be ‘n’, which represents the number of elements to be inserted into the binary tree.
 * The next line will be n elements separated by spaces, which represent the elements to be inserted into the binary tree. The code for inserting the values in the tree has been addressed in the code.
 *
 *
 * Output: The output should be in the following format:
 *
 * You need to print the path from the root node of the tree until the leaf nodes. The path is printed on separate lines with every node separated by spaces. Note that the path is from the left to the right order leaf nodes; so, the path for the leftmost node gets printed first.
 *
 *
 *
 *
 *
 * Sample Input:
 *
 * 6
 *
 * 10 8 2 3 5 2
 *
 * Sample Output:
 *
 * 10 8 3
 *
 * 10 8 5
 *
 * 10 2 2
 *
 *
 *
 * Sample Input:
 *
 * 4
 *
 * 1 7 3 9
 *
 * Sample Output:
 *
 * 1 7 9
 *
 * 1 7 3
 */
public class RootToLeafPaths {
    public static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }

    public static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }

        // Method to construct a binary tree from the given array (Do not edit the code given below)
        public Node insertNode(int[] elementsArr, Node node, int i) {
            if (i < elementsArr.length) {
                node = new Node(elementsArr[i]);
                node.left = insertNode(elementsArr, node.left, 2 * i + 1);
                node.right = insertNode(elementsArr, node.right, 2 * i + 2);
            }
            return node;
        }

        void printPaths(Node node) {
            int path[] = new int[1000];
            print(node, path, 0);
        }

        void print(Node node, int path[], int pathLen) {
            if (node == null) {
                return;
            }
            path[pathLen] = node.data;
            pathLen++;

            if (node.left == null && node.right == null) {
                printArray(path, pathLen);
            } else {
                print(node.left,path,pathLen);
                print(node.right,path,pathLen);
            }
        }

        void printArray(int ints[], int len) {
            int i;
            for (i = 0; i < len; i++) {
                System.out.print(ints[i] + " ");
            }
            System.out.println("");
        }
    }


            public static void main (String args[])
            {
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
                    }
                    tree.root = tree.insertNode(elementsArr, tree.root, 0);
                    tree.printPaths(tree.root);
                }


            }
        }



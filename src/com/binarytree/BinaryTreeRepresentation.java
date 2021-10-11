package com.binarytree;

// class representing a node (element) in a tree
class Node {
    int data; // value contained inside a node
    Node left, right; // left & right children of a node

    // constructor to set the data of a node to the passed value and make it a leaf node
    Node(int value) {
        data = value;
        left = right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

// class representing a binary tree
class Tree {
    Node root; // root node of the binary tree

    // constructor to create an empty tree with no root node
    Tree() {
        root = null;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "root=" + root +
                '}';
    }
}

// driver class to create tree and test code
public class BinaryTreeRepresentation {
    public static void main(String[] args) {
        Tree tree = new Tree(); // constructing an empty tree

        tree.root = new Node(1); // adding the root node

        tree.root.left = new Node(2); // adding left child of root node
        tree.root.right = new Node(3); // adding right child of root node

        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println(tree);

        preOrderDFS(tree.root);
        System.out.println(" ");
        inOrderDFS(tree.root);
        System.out.println(" ");
        postOrderDFS(tree.root);
    }
    // Method to print the tree in pre-order traversal
    static  void preOrderDFS(Node node) {
        if (node == null)
            return;

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to left subtree
        preOrderDFS(node.left);

        // recursively go to right subtree
        preOrderDFS(node.right);
    }

    // Method to print the tree in in-order traversal
    static void inOrderDFS(Node node) {
        if (node == null)
            return;

        // recursively go to left subtree
        inOrderDFS(node.left);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");

        // recursively go to right subtree
        inOrderDFS(node.right);
    }

    // Method to print the tree in post-order traversal
    static void postOrderDFS(Node node) {
        if (node == null)
            return;

        // recursively go to left subtree
        postOrderDFS(node.left);

        // recursively go to right subtree
        postOrderDFS(node.right);

        // visit the parent node (parent of left & right children)
        System.out.print(node.data + " ");
    }
}

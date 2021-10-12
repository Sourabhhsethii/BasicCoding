package com.binarytree.bfs;

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

    // Method to traverse the elements of a tree using BFS (level-order traversal) in recursive way
    void levelOrderOrBFS() {
        int h = height(root);
        for (int i = 1; i <= h; i++)
            printNodesAtLevel(root, i, 1);
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
    void printNodesAtLevel (Node root, int level, int currentLevel) {
        if (root == null)
            return;
        if (level == currentLevel)
            System.out.print(root.data + " ");
        else {
            printNodesAtLevel(root.left, level, currentLevel + 1);
            printNodesAtLevel(root.right, level, currentLevel + 1);
        }
    }

}

public class BFS {
    // Method to calculate height of a tree
    public static void main(String[] args) {
        Tree tr = new Tree();
        tr.root = new Node(1);
        tr.root.left = new Node(2);
        tr.root.right = new Node(3);
        tr.root.left.left = new Node(4);
        tr.root.left.right = new Node(5);

        tr.root.right.left = new Node(6);
        tr.root.right.right = new Node(7);
        tr.levelOrderOrBFS();

    }
}

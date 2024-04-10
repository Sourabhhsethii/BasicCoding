package com.tree;

import java.util.ArrayList;
import java.util.Stack;

public class PreOrderTraversal {

     class TreeNode {
     int val;
     TreeNode left;
    TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }



    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        TreeNode root = A;
        // All all left first
        while (root != null || stack.size()>0 ) {
            // Before adding into Stack, Print the root value or put it in arrayList

            while (root!= null){
                stack.push(root);
                arrayList.add(stack.peek().val);
                root = root.left;
            }
            root = stack.pop();
            root = root.right;
        }

        return arrayList;

    }
}

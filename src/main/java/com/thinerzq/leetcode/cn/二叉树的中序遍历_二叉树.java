package com.thinerzq.leetcode.cn;

import java.util.ArrayList;
import java.util.List;

public class 二叉树的中序遍历_二叉树 {


    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);

        TreeNode right1 = new TreeNode(2);

        TreeNode right1left = new TreeNode(3);


        root.right = right1;


        right1.left = right1left;


        System.out.println(inorderTraversal(root));




    }
    public static List<Integer> inorderTraversal(TreeNode root) {


        if (root==null){
            return null;
        }else{
            List<Integer> list  = new ArrayList<Integer>();
            inorderTraversal2(list,root);
            return list;
        }



    }
    public static void inorderTraversal2(List<Integer> list, TreeNode root) {


        if (root==null){
            return;
        }else{
            inorderTraversal(root.left);
            list.add(root.val);
            inorderTraversal(root.right);
        }


    }


      public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    
    
}

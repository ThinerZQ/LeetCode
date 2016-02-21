package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/21
 * Time: 13:03
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class InvertBinaryTree_226 {
    public static void main(String[] args) {

    }
    public TreeNode invertTree(TreeNode root) {

       if (root!=null){
            TreeNode temp;
            temp = root.left;
            root.left = root.right;
            root.right = temp;
           invertTree(root.left);
           invertTree(root.right);
       }
        return root;

    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

    }

}
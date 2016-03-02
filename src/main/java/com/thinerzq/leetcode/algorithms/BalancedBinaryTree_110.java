package com.thinerzq.leetcode.algorithms;

import javax.swing.tree.TreeNode;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/26
 * Time: 20:30
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class BalancedBinaryTree_110 {
    public static void main(String[] args) {

    }
    public boolean isBalanced(TreeNode root) {
        TreeNode tempRoot = root;

        if (tempRoot == null){
            return true;
        }

        int diff =Math.abs(maxDepth(tempRoot.left) -maxDepth(tempRoot.right));
        if (diff>1 || diff <0){
            return false;
        }
        return isBalanced(tempRoot.left) && isBalanced(tempRoot.right);


    }

    public int maxDepth(TreeNode root) {

        if (root==null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        if (root.left==null){
            return maxDepth(root.right)+1;
        }
        if (root.right == null){
            return  maxDepth(root.left)+1;
        }

        return maxValue(maxDepth(root.left),maxDepth(root.right))+1;

    }
    public int maxValue(int m,int n){
        return m>n?m:n;
    }

    private class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
        }
}

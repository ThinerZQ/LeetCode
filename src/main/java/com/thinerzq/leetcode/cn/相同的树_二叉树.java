package com.thinerzq.leetcode.cn;

public class 相同的树_二叉树 {
    public static void main(String[] args) {



        TreeNode left = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        left.left = left1;

        TreeNode right = new TreeNode(1);

        TreeNode right1 = new TreeNode(2);


        right.right = right1;

        System.out.println(isSameTree(left,right));



    }
    public static boolean isSameTree(TreeNode p, TreeNode q) {

        if (p==null && q==null){
            return true;
        }else if (p==null){
            return false;
        }else if (q == null){
            return false;
        }

       return isSameTree(p.left,q.left) && isSameTree(p.right,q.right) && p.val==q.val;
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

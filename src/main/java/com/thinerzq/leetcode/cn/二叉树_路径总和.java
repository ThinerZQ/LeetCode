package com.thinerzq.leetcode.cn;

public class 二叉树_路径总和 {
    public static void main(String[] args) {



        TreeNode root = new TreeNode(1);

        TreeNode left = new TreeNode(2);

        root.left = left;


        System.out.println(hasPathSum(root,1));
    }
    public static boolean hasPathSum(TreeNode root, int targetSum) {

        if (root==null ){
            return false;
        }
        return hasPathSumInner(root,targetSum);
    }

    public static boolean hasPathSumInner(TreeNode root, int targetSum) {

        if (root==null ){
            if (targetSum==0){
                return true;
            }
            return false;
        }
        if (root.left != null && root.right !=null) {
            //根节点
            return hasPathSumInner(root.left,targetSum-root.val) || hasPathSumInner(root.right,targetSum-root.val);
        }else if (root.left == null && root.right==null){
            //叶子节点，判断是否=0
            if (targetSum ==0){
                return true;
            }
            return false;
        }
        else if (root.left ==null ){
            //右边还有值, 判断当前节点
            return hasPathSumInner(root.right,targetSum-root.val);
        }else if (root.right ==null){
            //左边还有值，判断当前节点
            return hasPathSumInner(root.left,targetSum-root.val);
        }else {
            //
            return true;
        }

    }

}

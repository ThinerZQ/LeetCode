package com.thinerzq.leetcode.my100;



import java.util.ArrayList;
import java.util.List;

public class 二叉树的所有路径 {
    public static void main(String[] args) {

    }
    public List<String> binaryTreePaths(TreeNode root) {

        List<String> resultList =  new ArrayList<>();
        String current = "";

        findPathAndRecursive(root,current,resultList);
        return resultList;

    }

    public static void findPathAndRecursive(TreeNode root,String current,List<String> resultList){



        if (root==null){
            return;
        }
        if (current!=null && !current.equals("")){
            current = current+"->"+root.val;
        }else{
            current = ""+root.val;
        }

        if (root.left==null && root.right==null){
            resultList.add(current);
        }
        if (root.left!=null){

            findPathAndRecursive(root.left,current,resultList);
        }
        if (root.right!=null){

            findPathAndRecursive(root.right,current,resultList);
        }
    }
    public  static class TreeNode {

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

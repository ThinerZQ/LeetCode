package com.thinerzq.leetcode.algorithms;

import java.util.*;

/**
 * User：ThinerZQ
 * Email：thinerzq@gmail.com
 * Date：2016/9/2 20:52
 * Project：LeetCode
 * Package：com.thinerzq.leetcode.algorithms
 */
public class SumRootToLeafNumbers_129 {
    public static void main(String[] args) {
        TreeNode treeNode= new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(4);
        System.out.println(new SumRootToLeafNumbers_129 ().sumNumbers(treeNode));
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String> numbers = new ArrayList<String>();
        String value = new String ();
        sumNumbers(root,value,numbers);
        int sum=0;
        for (String str : numbers) {
            sum+=Integer.parseInt(str);
        }
        return sum;
    }
    public void sumNumbers(TreeNode root,String value,ArrayList<String> numbers ) {

        if (root!=null){
            value+=root.val;
            if (root.left !=null){
                sumNumbers(root.left,value,numbers);
            }
            if (root.right !=null){
                sumNumbers(root.right,value,numbers);
            }
            if (root.right ==null && root.left==null)
                numbers.add(value);
        }
    }


    static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
}

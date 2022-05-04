package com.thinerzq.leetcode.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历_二叉树 {

    public static void main(String[] args) {

    }
    public List<List<Integer>> levelOrder(TreeNode root) {



        List<List<Integer>> list = new ArrayList<List<Integer>>();


        if (root == null ){
            return list;
        }
        if (root.left == null && root.right==null){
            List<Integer> list1 = new ArrayList<Integer>();
            list1.add(root.val);
            list.add(list1);
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()){

            int length =queue.size();

            List<Integer> result = new LinkedList<Integer>();
            while (length>0){
                TreeNode current = queue.poll();

                if (current.left!=null){
                    queue.add(current.left);
                }
                if (current.right!=null){
                    queue.add(current.right);
                }
                result.add(current.val);
                length--;
            }
            list.add(result);
        }
        return list;
    }
}

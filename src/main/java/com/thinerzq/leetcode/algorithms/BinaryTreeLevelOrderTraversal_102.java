package com.thinerzq.leetcode.algorithms;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 19:50
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class BinaryTreeLevelOrderTraversal_102 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        levelOrder(treeNode);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<TreeNode> treeNodes = new ArrayList<TreeNode>();
            ArrayList<Integer> vals = new ArrayList<Integer>();
            Iterator<TreeNode> iterator = queue.iterator();
            while (iterator.hasNext()) {
                TreeNode temp = iterator.next();
                treeNodes.add(temp);
                vals.add(temp.val);
            }
            lists.add(vals);
            queue.clear();
            for (TreeNode treeNode : treeNodes) {
                TreeNode temp = treeNode;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        return lists;

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

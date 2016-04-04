package com.thinerzq.leetcode.algorithms;

import java.util.*;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 21:43
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MinimumDepthofBinaryTree_111 {
    public static void main(String[] args) {

    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        int count = 0;
        while (!queue.isEmpty()) {
            ArrayList<TreeNode> treeNodes = new ArrayList<TreeNode>();
            Iterator<TreeNode> iterator = queue.iterator();
            while (iterator.hasNext()) {
                TreeNode temp = iterator.next();
                treeNodes.add(temp);
            }
            queue.clear();
            count++;
            for (TreeNode treeNode : treeNodes) {
                TreeNode temp = treeNode;
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                if (temp.left == null && temp.right == null) {
                    return count;
                }
            }
        }
        return count;

    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

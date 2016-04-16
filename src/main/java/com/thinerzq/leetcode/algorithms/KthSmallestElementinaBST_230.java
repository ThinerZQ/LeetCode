package com.thinerzq.leetcode.algorithms;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 21:17
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class KthSmallestElementinaBST_230 {
    public int kthSmallest(TreeNode root, int k) {

        if (k == 1) {
            //找到最小，返回
            TreeNode index = root;
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(index);
            while (!stack.isEmpty()) {
                TreeNode temp = stack.pop();
                if (temp.right != null) {
                    stack.push(temp.right);
                }
                if (temp.left != null) {
                    stack.push(temp.left);
                } else {
                    return temp.val;
                }
            }
            return 0;

        } else {
            //找 k-1 小，返回
            TreeNode index = root;
            if (root != null) {
                TreeNode pre = index;
                while (index.left != null) {
                    pre = index;
                    index = index.left;
                }
                if (root == index) {
                    root = root.right;
                } else {
                    if (index.left == null && index.right == null) {
                        pre.left = null;
                    } else if (index.right != null) {
                        pre.left = index.right;
                    }
                }
            }
            return kthSmallest(root, k - 1);
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

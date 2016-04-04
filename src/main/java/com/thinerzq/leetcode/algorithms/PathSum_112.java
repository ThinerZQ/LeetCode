package com.thinerzq.leetcode.algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 21:00
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class PathSum_112 {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int sum) {


        if (root != null && root.left == null && root.right == null && sum - root.val == 0) {
            return true;
        } else if (root != null) {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        } else {
            return false;
        }
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

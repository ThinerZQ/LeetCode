package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/15
 * Time: 22:34
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class BinaryTreeInorderTraversal_94 {


    public static void main(String[] args) {

    }

    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> list = new ArrayList<Integer>();
        //put root
        if (root != null) {
            stack.push(root);

            // loop to put left
            TreeNode index = root;
            while (index.left != null) {
                stack.push(index.left);
                index = index.left;
            }
            // stack is not null,
            while (!stack.isEmpty()) {
                //get top node
                TreeNode node = stack.pop();
                list.add(node.val);

                //judge whether it has right node
                if (node.right != null) {
                    TreeNode node1 = node.right;
                    stack.push(node1);

                    while (node1.left != null) {
                        stack.push(node1.left);
                        node1 = node1.left;
                    }
                }
            }
        }


        return list;

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

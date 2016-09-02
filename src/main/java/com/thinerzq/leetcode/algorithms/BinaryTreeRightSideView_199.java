package com.thinerzq.leetcode.algorithms;

import java.util.*;

/**
 * Created by Intellij IDEA
 * Date: 16-5-21
 * Time: 上午12:23
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class BinaryTreeRightSideView_199 {

    public List<Integer> rightSideView(TreeNode root) {
        if(root==null){
            return null;
        }
        List<Integer> lists = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<TreeNode> treeNodes = new ArrayList<TreeNode>();
            Iterator<TreeNode> iterator = queue.iterator();
            while (iterator.hasNext()) {
                TreeNode temp = iterator.next();
                treeNodes.add(temp);
                if (!iterator.hasNext())
                    lists.add(temp.val);
            }

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
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}


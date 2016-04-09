package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 22:08
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class BinaryTreePreorderTraversal_144 {
    public static void main(String[] args) {

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list =new ArrayList<Integer>();
        if (root!= null){
            Stack<TreeNode> stack = new Stack<TreeNode>();
            stack.push(root);
            while (!stack.isEmpty()){
                TreeNode temp = stack.pop();
                list.add(temp.val);
                if (temp.right!= null){
                    stack.push(temp.right);
                }
                if(temp.left != null) {
                    stack.push(temp.left);
                }
            }
        }
        return list;
    }

    private class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
}

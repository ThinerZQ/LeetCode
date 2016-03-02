package com.thinerzq.leetcode.algorithms;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/2
 * Time: 21:18
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class BinaryTreeLevelOrderTraversalII_107 {
    public static void main(String[] args) {

        Stack<String> strings = new Stack<String>();
        strings.push(null);
        strings.push(null);
        System.out.println(strings.size());
    }
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> queue = new PriorityQueue<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        queue.add(root);
        stack.push(root);
        while (!queue.isEmpty()){
            TreeNode temp = queue.poll();
            if (temp.left!=null){
                queue.add(temp.left);
            }
            if (temp.right!=null){
                queue.add(temp.right);
            }
            stack.push(temp.right);
            stack.push(temp.left);
        }

        int maxDepth = maxDepth(root);
        int k = (int) (Math.pow(2,maxDepth)-1);



        return null;

    }

    public int maxDepth(TreeNode root) {

        if (root==null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        if (root.left==null){
            return maxDepth(root.right)+1;
        }
        if (root.right == null){
            return  maxDepth(root.left)+1;
        }

        return maxValue(maxDepth(root.left),maxDepth(root.right))+1;

    }
    public int maxValue(int m,int n){
        return m>n?m:n;
    }
    public class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
}

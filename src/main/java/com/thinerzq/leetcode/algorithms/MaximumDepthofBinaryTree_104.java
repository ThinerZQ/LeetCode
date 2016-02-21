package com.thinerzq.leetcode.algorithms;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import sun.security.pkcs11.P11Util;

import java.util.Random;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/21
 * Time: 12:05
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MaximumDepthofBinaryTree_104 {
    public static void main(String[] args) {

        MaximumDepthofBinaryTree_104 maximumDepthofBinaryTree_104 = new MaximumDepthofBinaryTree_104();

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
    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

    }
}



package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/26
 * Time: 21:09
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class SymmetricTree_101 {
    public static void main(String[] args) {

    }

    public boolean isSymmetric(TreeNode root) {

        //��α���
        Queue<TreeNode> queue = new LinkedBlockingQueue<TreeNode>();
        queue.add(root);
        while (root != null) {
            //�ж�queue��Ԫ���Ƿ���������ȵġ�
            //TreeNodequeue.toArray()
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
        }
        return false;
    }


    //��α���


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}

package com.thinerzq.leetcode.algorithms;


import java.util.*;

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
        List<Integer> list2 = new ArrayList<Integer>();
        {
            List<Integer> list = new ArrayList<Integer>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);
            list.add(6);
            Collections.swap(list, 0, list.size() - 1);
            list2 = list;
            System.out.println(list);
            list2.set(3, 10);
            System.out.println(list);
        }
        System.out.println(list2);

    }

    public List<List<Integer>> levelOrderBottom_1(TreeNode root) {
        if (root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
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
            list.add(vals);
            queue.clear();
            for (TreeNode treeNode : treeNodes) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
        }
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            Collections.swap(list, i, j);
        }
        return list;
    }

    public List<List<Integer>> levelOrderBottom_2(TreeNode root) {
        if (root == null)
            return new ArrayList<List<Integer>>();
        int maxDepth = maxDepth(root);

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();
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
            list.add(--maxDepth, vals);
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
        return list;
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null)
            return null;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        queue.add(root);
        stack.push(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }
            stack.push(temp.right);
            stack.push(temp.left);
        }

        int maxDepth = maxDepth(root);
        int k = (int) (Math.pow(2, maxDepth) - 1);

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = maxDepth - 1; i >= 0; i--) {
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            int m = (int) Math.pow(2, i);
            while (m > 0) {
                TreeNode temp;
                if (!stack.empty() && (temp = stack.pop()) != null) {
                    arrayList.add(temp.val);
                }
                m--;
            }
            list.add(arrayList);
        }

        return list;

    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return maxDepth(root.right) + 1;
        }
        if (root.right == null) {
            return maxDepth(root.left) + 1;
        }

        return maxValue(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

    public int maxValue(int m, int n) {
        return m > n ? m : n;
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

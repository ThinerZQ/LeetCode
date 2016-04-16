package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 0:00
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class ConvertSortedArraytoBinarySearchTree_108 {

    public static void main(String[] args) {

        ConvertSortedArraytoBinarySearchTree_108 t = new ConvertSortedArraytoBinarySearchTree_108();
        System.out.println(t.sortedArrayToBST(new int[]{3, 4, 5}));
    }

    public TreeNode sortedArrayToBST_1(int[] nums) {

        //TODO:
        int size = nums.length;

        if (size > 0) {
            return build(nums, 0, size - 1);
        } else {
            return null;
        }


    }

    private TreeNode build(int[] nums, int left, int right) {


        if (left > right) {
            return null;
        } else if (left == right) {
            return new TreeNode(nums[left]);
        } else {
            int middle = 0;
            middle = left + ((right - left) >> 1);
            TreeNode node = new TreeNode(nums[middle]);
            node.left = build(nums, left, middle - 1);
            node.right = build(nums, middle + 1, right);
            return node;
        }

    }


    public TreeNode sortedArrayToBST(int[] nums) {

        //TODO:

        if (nums.length == 0) {
            return null;
        } else {

            TreeNode root = new TreeNode(nums[0]);
            TreeNode tempRoot = root;
            for (int i = 1; i < nums.length; i++) {
                tempRoot = insert(tempRoot, nums[i]);
            }
            return tempRoot;
        }

    }

    private TreeNode insert(TreeNode root, int data) {


        //只处理 RR型的破坏就好了

        TreeNode index = root;
        TreeNode pre = index;
        while (index.right != null) {
            pre = index;
            index = index.right;
        }
        TreeNode dataNode = new TreeNode(data);
        index.right = dataNode;

        //判断是否被破坏,从最里层开始判断
        boolean flag = false;
        while (Math.abs(getHeight(pre.left) - getHeight(pre.right)) > 1) {
            flag = true;
        }
        //标示最底层的需要RR旋转的位置
        TreeNode tempRoot = pre.right;
        if (flag) {
            TreeNode left = pre.right.left;
            pre.right.left = pre;
            pre.right = left;
            //TODO:
            return tempRoot;
        } else {
            //从顶层开始判断是否被破坏
            TreeNode temp = root;
            pre = temp;
            while (Math.abs(getHeight(temp.left) - getHeight(temp.right)) > 1) {
                pre = temp;
                temp = temp.right;
                flag = true;
            }
            tempRoot = pre.right;
            if (flag) {
                TreeNode left = pre.right.left;
                pre.right.left = pre;
                pre.right = left;
                return tempRoot;
            } else {
                return root;
            }

        }
    }

    private int getHeight(TreeNode root) {

        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        if (root.left == null) {
            return getHeight(root.right) + 1;
        }
        if (root.right == null) {
            return getHeight(root.left) + 1;
        }

        return maxValue(getHeight(root.left), getHeight(root.right)) + 1;
    }

    public int maxValue(int m, int n) {
        return m > n ? m : n;
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

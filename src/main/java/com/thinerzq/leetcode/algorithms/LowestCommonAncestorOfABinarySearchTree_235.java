package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 18:55
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 According to the definition of LCA on Wikipedia: ¡°The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).¡±

 _______6______
 /              \
 ___2__          ___8__
 /      \        /      \
 0      _4       7       9
 /  \
 3   5
 For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestorOfABinarySearchTree_235 {
    public static void main(String[] args) {

    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        TreeNode treeNode = root;

        if (root==null){
            return null;
        }

        if (treeNode.val == p.val && treeNode.val == q.val){
            return treeNode;
        }else if (treeNode.val == p.val){
            //query
            if (containNode(treeNode,q)){
                return treeNode;
            }else{
                return null;
            }
        }else if (treeNode.val == q.val) {
            //query
            if (containNode(treeNode,p)){
                return treeNode;
            }else{
                return null;
            }
        }else{
                TreeNode leftResult = lowestCommonAncestor(root.left,p,q);
                if ( leftResult== null){
                    TreeNode rightResult = lowestCommonAncestor(root.right,p,q);
                    if (rightResult==null){
                        return root;
                    }else{
                        return rightResult;
                    }
                }else{
                    return leftResult;
                }

            }

    }
    public static boolean containNode(TreeNode root,TreeNode node){

        TreeNode temp = root;
        if (temp!=null){
            if (root.val == node.val){
                return true;
            }else{
                boolean left  = containNode(temp.left,node);
                if (left == true){
                    return left;
                }else{
                    boolean right = containNode(temp.right,node);
                    if (right == true){
                        return right;
                    }else{
                        return false;
                    }
                }
            }
        }else{
            return false;
        }


    }
    private static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
    }
}

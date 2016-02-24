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


        if(p ==null && q== null){
            return null;
        }else if (p==null){
            return q;
        }else if (q == null){
            return p;
        }


        if (treeNode.val == p.val && treeNode.val == q.val){
            return treeNode;
        }else if (treeNode.val == p.val || treeNode.val == q.val) {
            return treeNode;
        } else{
            if (containNode(treeNode.left,p,q)){
                // recursive left
                return lowestCommonAncestor(treeNode.left,p,q);
            }else if (containNode(treeNode.right,p,q)){
                //recursive right
                return lowestCommonAncestor(treeNode.right,p,q);
            }else if ((containNode(treeNode.left,p) && containNode(treeNode.right,q)) || (containNode(treeNode.left,q) && containNode(treeNode.right,p))){
                return treeNode;
            }else{
                return null;
            }
        }

    }
    public static boolean containNode(TreeNode root,TreeNode node){

        TreeNode temp = root;

        if (temp!=null){
            if (temp.val == node.val){
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
    public static boolean containNode(TreeNode root,TreeNode p,TreeNode q){

        TreeNode temp = root;

        return containNode(temp,p) && containNode(temp,q);

    }
    private static class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
    }
}

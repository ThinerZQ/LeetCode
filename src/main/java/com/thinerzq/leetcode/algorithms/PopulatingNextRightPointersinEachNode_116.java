package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 14:19
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 *
 * For example,
 Given the following perfect binary tree,
 1
 /  \
 2    3
 / \  / \
 4  5  6  7
 After calling your function, the tree should look like:
          1 -> NULL
        /  \
       2 -> 3 -> NULL
      / \  / \
     4->5->6->7 -> NULL
 *
 *
 */
public class PopulatingNextRightPointersinEachNode_116 {
    public static void main(String[] args) {

        TreeLinkNode node = new TreeLinkNode(0);

        connect(node);

    }
    public static void connect(TreeLinkNode root) {


        if (root!=null){
            Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
            queue.add(root);
            while (!queue.isEmpty()){
                ArrayList<TreeLinkNode> list = new ArrayList<TreeLinkNode>();
                Iterator<TreeLinkNode> iterator = queue.iterator();

                while (iterator.hasNext()){
                    list.add(iterator.next());
                }
                queue.clear();
                for (int i = 0; i < list.size(); i++){
                    TreeLinkNode node = list.get(i);
                    if (node.left!=null){
                        queue.add(node.left);
                    }
                    if (node.right !=null){
                        queue.add(node.right);
                    }
                    if (i!=list.size()-1)
                        node.next = list.get(i+1);
                }
            }
        }


    }


    public static class TreeLinkNode {
             int val;
             TreeLinkNode left, right, next;
             TreeLinkNode(int x) { val = x; }
         }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/22
 * Time: 23:59
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.

 Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 */
public class DeleteNodeInALinkedList_237 {

    public static void main(String[] args) {

        ListNode node1 = new ListNode(0);
        ListNode node2 = new ListNode(1);

        node1.next=node2;

        DeleteNodeInALinkedList_237 deleteNodeInALinkedList_237 = new DeleteNodeInALinkedList_237();
        deleteNodeInALinkedList_237.deleteNode(node1);

        System.out.println(node1);;

    }

    public void deleteNode(ListNode node) {



        if (node.next ==null || node == null){
            node = null;
        }else{
            ListNode tempNode = node;
            while (tempNode.next != null){

                int tempVal = tempNode.next.val;
                tempNode.val = tempVal;
                if(tempNode.next.next == null){
                    tempNode.next = null;
                }else{
                    tempNode=tempNode.next;
                }
            }
        }

    }

    private static class ListNode {
             int val;
             ListNode next;
             ListNode(int x) { val = x; }
         }
}

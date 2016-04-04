package com.thinerzq.leetcode.algorithms;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 18:18
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ReverseLinkedList_206 {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;

        reverseList(node1);
    }

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode index = head.next;
        ListNode pre = head;
        while (index != null) {
            ListNode tempNode = index.next;
            if (pre.next == index) {
                pre.next = null;
            }

            index.next = pre;
            pre = index;
            index = tempNode;
        }
        return pre;

    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

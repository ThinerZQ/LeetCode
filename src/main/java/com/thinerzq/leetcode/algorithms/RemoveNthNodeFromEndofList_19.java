package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/19
 * Time: 15:50
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class RemoveNthNodeFromEndofList_19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }
        ListNode next = head;
        ListNode pre = head;

        for (int i = 0; i < n; i++) {
            next = next.next;
        }

        if (next == null) {
            head = head.next;
            return head;
        }

        while (next.next != null) {
            next = next.next;
            pre = pre.next;
        }
        ListNode temp = pre.next.next;
        pre.next = temp;
        return head;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/24
 * Time: 22:21
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class RemoveDuplicatesFromSortedList_83 {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode index = head.next;
        ListNode pre = head;
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(pre.val);
        while (index != null) {

            if (!hashSet.contains(index.val)) {
                hashSet.add(index.val);
                pre = index.next;
            } else {
                pre.next = index.next;
            }

            index = index.next;
        }
        return head;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}

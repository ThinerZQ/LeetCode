package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 13:37
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class LinkedListCycle_141 {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        if (head ==null || head.next ==null){
            return false;
        }
        ListNode low=head.next,fast = head.next;

        while (fast !=null && fast.next !=null){
            low =low.next;
            fast=fast.next.next;
            if (low==fast){
                return true;
            }
        }
        return false;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

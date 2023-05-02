package com.thinerzq.leetcode.my100;

import java.util.List;

public class 反转链表 {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode5;
        listNode5.next = listNode6;
    }


    public static ListNode reverseList(ListNode head){


        if (head == null ){
            return null;
        }
        if (head.next == null){
            return head;
        }

        ListNode pre = head;
        ListNode next = head.next;

        while (next!=null){

            // 断开中间节点
           pre.next = next.next;

           //当前节点往前指
           next.next = head;
           head = next;

           //为反转下一个节点做准备
           next = pre.next;
        }

        return head;



    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

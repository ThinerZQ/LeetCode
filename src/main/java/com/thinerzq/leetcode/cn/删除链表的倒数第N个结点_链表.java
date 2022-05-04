package com.thinerzq.leetcode.cn;

import com.thinerzq.leetcode.algorithms.RemoveNthNodeFromEndofList_19;

import java.util.List;

public class 删除链表的倒数第N个结点_链表 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

//       ListNode reverse =  reverse(listNode);



        ListNode reverse =  removeNthFromEnd(listNode,2);

        while (reverse!=null){
            System.out.println(reverse.val);
            reverse  = reverse.next;
        }


    }

    private static ListNode reverse(ListNode head){

        if (head ==null){
            return null;
        }
        if (head.next ==null){
            return head;
        }
        //逆序过来
        ListNode pre= head;
        ListNode post = head.next;
        ListNode temp = null;
        while (post!=null){
            temp = post.next;
            post.next = pre;
            pre=post;
            post = temp;
        }
        head.next = null;
        return pre;
    }



    public static ListNode removeNthFromEnd(ListNode head, int n) {

        if (head ==null){
            return null;
        }



        //逆序过来
        ListNode pre= head;
        ListNode post = head.next;
        ListNode temp = null;
        while (post!=null){
            temp = post.next;
            post.next = pre;
            pre=post;
            post = temp;
        }
        head.next = null;

        head = pre;






        if (head.next==null &&n==1){
            return null;
        }
        if (n==1){
            head = head.next;
        }else {

            ListNode p = head;
            ListNode q = head.next;
            //删除第N个
            int index = 1;
            while (q != null) {
                if ((index + 1) == n) {
                    ListNode temp1 = q.next;
                    p.next=temp1;
                }else{
                    p=q;
                    q=q.next;
                }
                index++;

            }
            ;
        }


        //在逆序回去



        //逆序过来
        ListNode pre2= head;
        ListNode post2 = head.next;
        ListNode temp2 = null;
        while (post2!=null){
            temp2 = post2.next;
            post2.next = pre2;
            pre2=post2;
            post2 = temp2;
        }
        head.next = null;
        return pre2;


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

package com.thinerzq.leetcode.cn;

public class 合并两个有序链表_链表 {
    public static void main(String[] args) {

        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);



        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode.next = listNode2;
        listNode2.next = listNode3;


        listNode4.next = listNode5;
        listNode5.next = listNode6;

        mergeTwoLists(listNode,listNode4);
        
        
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1==null ){
            return list2;
        }
        if (list2==null){
            return list1;
        }


        ListNode start = null;
        ListNode p1 = list1;
        ListNode q2 = list2;
        if (list1.val< list2.val){
            start = list1;
            p1 = p1.next;
        }else{
            start = list2;
            q2 = q2.next;
        }
        ListNode head = start;

        while (p1!=null || q2!=null) {
            if (p1==null){
                start.next =q2;
                break;
            }else if (q2 ==null){
                start.next=p1;
                break;
            }
            if (p1.val < q2.val) {
                start.next = p1;
                p1 = p1.next;
            } else {
                start.next = q2;
                q2 = q2.next;
            }
            start = start.next;

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

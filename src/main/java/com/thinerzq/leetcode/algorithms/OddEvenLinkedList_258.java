package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/20
 * Time: 13:57
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class OddEvenLinkedList_258 {
    private ListNode root;
    public static void main(String[] args) {

        OddEvenLinkedList_258 oddEvenLinkedList_258 = new OddEvenLinkedList_258();

        oddEvenLinkedList_258.insert(2);
        oddEvenLinkedList_258.insert(4);
        oddEvenLinkedList_258.insert(3);
        oddEvenLinkedList_258.insert(5);
        oddEvenLinkedList_258.insert(1);
        oddEvenLinkedList_258.insert(6);

        System.out.println(oddEvenLinkedList_258.oddEvenList(oddEvenLinkedList_258.root).val);


    }
    public void insert(int a){
        ListNode listNode = new ListNode(a);
        ListNode temp = root;
        if (root ==null){
            root = listNode;
            return;
        }
        while (temp.next != null){
            temp= temp.next;
        }
        temp.next = listNode;
    }
    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next ==null){
            return head;
        }
        ListNode last = head;
        int length=0;
        while(last.next != null){
            last = last.next;
            length++;
        }
        ListNode index = head.next;
        ListNode pre = head;

        while(index != null && length>0){

            if((index.val%2) ==0){
                ListNode temp = new ListNode(index.val);

                pre.next = index.next;

                last.next = temp;
                last = last.next;
            }else{
                pre = pre.next;
            }
            index = index.next;
            length--;
        }
        return head;
    }
    private static class ListNode {
            int val;
            ListNode next;
            ListNode(int x) { val = x; }
    }
}

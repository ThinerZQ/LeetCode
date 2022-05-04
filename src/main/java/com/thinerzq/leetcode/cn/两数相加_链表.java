package com.thinerzq.leetcode.cn;

public class 两数相加_链表 {

    public static void main(String[] args) {

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        if (l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }
        ListNode node = new ListNode(0);
        ListNode result = node;
        //进位值
        int p=0;
        while(true){
            int current=0;
            if (l1==null && l2==null){
                if(p!=0){
                    ListNode temp = new ListNode(p);
                    node.next = temp;
                    node = temp;
                }
                break;
            }else if (l1==null){
                current =  l2.val+p;
                l2 = l2.next;
            }else if (l2==null){
                current =  l1.val+p;
                l1= l1.next;
            }else{
                current =  l1.val+l2.val+p;
                l1= l1.next;
                l2=l2.next;
            }
            p = current/10;

            int val = current%10;
            ListNode temp = new ListNode(val);
            node.next = temp;
            node = temp;
        }
        return result.next;







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

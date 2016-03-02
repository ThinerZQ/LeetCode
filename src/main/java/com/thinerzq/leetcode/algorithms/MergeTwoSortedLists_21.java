package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 16:37
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode first, ListNode two) {

        if (first ==null && two ==null){
            return null;
        }else if (first == null){
            return two;
        }else if (two == null){
            return first;
        }else{
            ListNode firstIndex = first;
            ListNode twoIndex = two;
            boolean flag = false;
            while (firstIndex != null && twoIndex != null){
                ListNode firstNext = firstIndex.next;
                ListNode twoNext = twoIndex.next;



                if (firstIndex.val < twoIndex.val){
                    if (firstNext != null && firstNext.val <= twoIndex.val){
                        firstIndex = firstNext;
                        flag = true;
                        continue;
                    }
                    firstIndex.next =twoIndex;
                    firstIndex = firstNext;
                    flag = true;
                }else if (firstIndex.val > twoIndex.val){
                    if (twoNext != null && twoNext.val <= firstIndex.val){
                        twoIndex = twoNext;
                        flag = false;
                        continue;
                    }
                    twoIndex.next = firstIndex;
                    twoIndex = twoNext;
                    flag = false;
                }else{
                    if (flag){
                        firstIndex.next = twoIndex;
                    }else{
                        twoIndex.next = firstIndex;
                    }
                    firstIndex = firstNext;
                    twoIndex = twoNext;
                }
            }

            return first.val < two.val ? first : two;
        }

    }

    private class ListNode {
            int val;
            ListNode next;
             ListNode(int x) { val = x; }
         }
}

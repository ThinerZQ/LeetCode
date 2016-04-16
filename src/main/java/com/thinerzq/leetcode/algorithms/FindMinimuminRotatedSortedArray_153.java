package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 23:32
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class FindMinimuminRotatedSortedArray_153 {
    public static void main(String[] args) {

    }
    public static int findMin(int[] nums) {

        int jump =1;
        int last= 0;
        int i = 0;
        for (; i < nums.length;) {
            if (nums[i]<nums[last]){
                for (int j = last; j <= i; j++) {
                    if (nums[j]<nums[j-1]){
                        return nums[j];
                    }
                }
            }
            i+=jump;
            jump++;
            last=i;
        }
        for ( i = i-jump-1; i < nums.length; i++) {
            if (nums[i]<nums[i-1]){
                return nums[i];
            }
        }
        return nums[0];

    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/15
 * Time: 23:38
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class SearchInsertPosition_35 {

    public static void main(String[] args) {

    }

    public static int searchInsert(int[] nums, int target) {


        int left = 0;
        int right = nums.length - 1;
        boolean left_flag = false;
        int middle = 0;
        while (left <= right) {
            middle = left + ((right - left) >> 1);
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
                left_flag = true;
            } else {
                right = middle - 1;
                left_flag = false;
            }
        }
        if (left_flag)
            return middle + 1;
        else
            return middle;


    }
}

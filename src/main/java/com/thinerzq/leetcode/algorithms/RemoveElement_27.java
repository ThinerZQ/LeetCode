package com.thinerzq.leetcode.algorithms;

/**
 * Created by root on 16-3-3.
 */
public class RemoveElement_27 {
    public static void main(String[] args) {

    }

    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                count++;
            } else {
                nums[i - count] = nums[i];
            }
        }
        return nums.length - count;
    }
}

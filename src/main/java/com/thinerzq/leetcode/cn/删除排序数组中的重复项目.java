package com.thinerzq.leetcode.cn;

public class 删除排序数组中的重复项目 {
    public int removeDuplicates(int[] nums) {


        int left =0;
        for (int right = 0;right<nums.length;right++){
            if(nums[left] !=nums[right]) {
                nums[++left]  = nums[right];
            }
        }
        return ++left;
    }
}

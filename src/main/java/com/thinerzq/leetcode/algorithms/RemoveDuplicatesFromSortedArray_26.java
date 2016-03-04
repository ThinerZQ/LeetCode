package com.thinerzq.leetcode.algorithms;

/**
 * Created by root on 16-3-3.
 */
public class RemoveDuplicatesFromSortedArray_26 {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
        int count =0;

        for (int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }else{
                nums[i-count] = nums[i];
            }
        }
        return nums.length-count;
    }
}

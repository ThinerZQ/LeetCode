package com.thinerzq.leetcode.cn;

public class 搜索插入位置_数组 {
    public static void main(String[] args) {





    }
    public int searchInsert(int[] nums, int target) {

        int left =0;
        int right = nums.length;

        int index =-1;

        while (left<right){
            int mid = (left+ right)/2;
            if (nums[mid]==target){
                index = mid;
                break;
            }if (nums[mid]<target){
                left = mid+1;
            }else{
                right = mid;
            }

        }
        if (index!=-1){
            return index;
        }

        if (right==0){
            return 0;
        }else if (left==nums.length){
            return nums.length;
        }else if (left ==right){
            return right;
        }
        return 0;


    }
}

package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 目标和 {
     int count =0;

    public static void main(String[] args) {
        System.out.println(new 目标和().findTargetSumWays(new int[]{1,1,1,1,1},3));;
    }
    public  int findTargetSumWays(int[] nums, int target) {
        findTargetSumWays(nums,target,0,0);
        return count;
    }

    public  void findTargetSumWays(int[] nums, int target,int startIndex,int sum) {

        if (startIndex == nums.length) {
            if (sum == target){
                count++;
                return;
            }else{
                return;
            }
        }

        findTargetSumWays(nums, target, startIndex + 1,sum+nums[startIndex]);
        findTargetSumWays(nums, target, startIndex + 1,sum-nums[startIndex]);
    }
}

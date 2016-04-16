package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 14:54
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MaximumSubarray_53 {
    public static void main(String[] args) {

    }


    public int maxSubArray(int[] nums) {

        int currentSum = 0,maxSum=0,size = nums.length;
        if (nums==null || size==0){
            return 0;
        }
        for (int i = 0; i < size; ++i) {
            currentSum +=nums[i];
            if (currentSum<0){
                currentSum=0;
            }
            if (currentSum>maxSum){
                maxSum = currentSum;
            }
        }
        if (maxSum ==0){
            maxSum = nums[0];
            for (int i = 1; i < size; ++i) {
                if (maxSum <nums[i]){
                    maxSum = nums[i];
                }
            }
        }
        return maxSum;
    }


}

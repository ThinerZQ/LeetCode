package com.thinerzq.leetcode.my100;

public class 最大子数组和 {
    public static void main(String[] args) {

        System.out.println(new 最大子数组和().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    /**
     * 暴力法
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j <nums.length; j++) {
                sum+= nums[j];
                if (sum>max){
                    max=sum;
                }
            }

        }
        return max;
    }
    /**
     * 贪心发
     * @param nums
     * @return
     */
    public int maxSubArray2(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            if (sum>0){
                sum+=nums[i];
            }else{
                sum=nums[i];
            }
            sum = Math.max(sum,nums[i]);
        }
        return sum;
    }
}

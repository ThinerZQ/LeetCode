package com.thinerzq.leetcode.my100;

public class 最长递增子序列的个数 {
    public static void main(String[] args) {

    }
    public int findNumberOfLIS(int[] nums) {
        /**
         * dp[i] = 从0到i的的最长递增子序列长度
         * dp[i] = max(dp[i],dp[j]+1)  , num[i]>num[j] ,这里的递推公式比较特殊， i是和前面的每一个内部循环的j 进行比较，如果num[i]>nums[j] ，那么nums[j]组合上num[i] 都能形成递增子序列
         */
        int[] dp = new int[nums.length];
        int max = Integer.MIN_VALUE;
        int[] cc = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            cc[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i]>nums[j]){
                    if (dp[i] == dp[j]+1){
                        cc[i]++;
                    }
                    dp[i] = Math.max(dp[i],dp[j]+1);

                }
            }
            if(max<dp[i]){
                max = dp[i];
            }
        }
        return cc[nums.length-1];
    }


}

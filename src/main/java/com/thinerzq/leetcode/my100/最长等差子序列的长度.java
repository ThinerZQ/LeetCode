package com.thinerzq.leetcode.my100;


/**
 * dp[i][j]  表示从0-i 以 j 结束的最长等差子序列长度
 * dp[i][j] = max(dp[i][j],dp[i][diff]+1)
 * 初始化dp[i][X任意值]=1;
 */
public class 最长等差子序列的长度 {
    public static void main(String[] args) {

    }
    public int longestArithSeqLength(int[] nums) {


        int[][] dp = new int[nums.length][1020];
        int max =Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            int diff=0;
            for (int k = 0; k < 1020; k++) {
                dp[i][k] = 1; // 0-i 以 任意一个差值结束的最长等差子序列长度1;
            }
            for (int j = 0; j < i; j++) {

                diff = nums[i] - nums[j] + 500;
                dp[i][diff] = Math.max(dp[i][diff],dp[j][diff]+1);
                if (dp[i][diff] > max){
                    max = dp[i][diff];
                }
            }
        }
        return max;


    }
}

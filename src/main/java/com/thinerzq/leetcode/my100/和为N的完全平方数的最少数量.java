package com.thinerzq.leetcode.my100;

/**
 * dp[i] 表示和为 i 的完全平方数的最小数量
 * dp[i] =min(dp[i-j*j]+1,dp[i])  j<i
 */
public class 和为N的完全平方数的最少数量 {
    public static void main(String[] args) {

    }
    public int numSquares(int n) {

        //dp[i] 表示和为 i 的完全平方数的最小数量
        int[] dp = new int[n+1];

        for (int i = 0; i <=100; i++) {

        }

        for (int i = 1; i < dp.length; i++) {
            dp[i]=Integer.MAX_VALUE;

            for (int j = 1; j < i; j++) {
                if (i*i<=dp.length-1){
                    dp[i*i]=1;
                }
                dp[i] = Math.min(dp[i-j*j]+1,dp[i]);
            }
        }
        return dp[dp.length-1];

    }
}

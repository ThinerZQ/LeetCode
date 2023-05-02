package com.thinerzq.leetcode.my100;

import java.util.Arrays;

/**
 * dp[i] = 爬上第i层楼梯所需的最少花费
 * dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
 */
public class 使用最小花费爬楼梯 {
    public static void main(String[] args) {
        new 使用最小花费爬楼梯().minCostClimbingStairs(new int[]{10,15,20});
    }
    public int minCostClimbingStairs(int[] cost) {

        int[] dp = new int[cost.length+1];

        for (int i = 2; i <=cost.length; i++) {
            dp[i] = Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        Arrays.stream(dp).forEach(System.out::println);
        return dp[dp.length-1];

    }
}

package com.thinerzq.leetcode.my100;

public class 买卖股票的最佳时机3 {

    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {


        int[][] dp = new int[prices.length][5];
        dp[0][0] = 0;  // 第i天什么也不做，最后的收益
        dp[0][1] = -prices[0]; // 直到第i天过程中发生第一次买入，第i天结束后的收益情况
        dp[0][2] = 0;// 直到第i天过程中发生第一次卖出，第i天结束后的收益情况
        dp[0][3] = -prices[0];//// 直到第i天过程中发生第二次买入，第i天结束后的收益情况
        dp[0][4] = 0;// 直到第i天过程中发生第二次卖出，第i天结束后的收益情况


        for (int i = 1; i <prices.length; i++) {


            dp[i][0] = dp[i-1][0];

            dp[i][1]  = Math.max(dp[i-1][1], dp[i-1][0]-prices[i]); // 第i-1天之前发生过第一次买入，第i天之前都没有发生过买入,直到i买入了;
            dp[i][2]  = Math.max(dp[i-1][2], dp[i-1][1]+prices[i]); // 第i-1天之前发生过第一次买入，第i天之前都没有发生过买入,直到i买入了;
            dp[i][3]  = Math.max(dp[i-1][3], dp[i-1][2]-prices[i]); // 第i-1天之前发生过第一次买入，第i天之前都没有发生过买入,直到i买入了;
            dp[i][4]  = Math.max(dp[i-1][4], dp[i-1][3]+prices[i]); // 第i-1天之前发生过第一次买入，第i天之前都没有发生过买入,直到i买入了;
        }
        return dp[prices.length-1][4];


    }
}

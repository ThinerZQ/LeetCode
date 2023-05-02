package com.thinerzq.leetcode.my100;

public class 买卖股票的最佳时机2 {

    public static void main(String[] args) {
    }

    public static int maxProfit(int[] prices){


        //d[i][0] 第i天不持有股票，d[i][1] 第i天持有股票的 下的收益
        int[][] dp = new int[prices.length][2];

        dp[0][0] = 0;
        dp[0][1] = -prices[0] ;

        for (int i = 1; i <prices.length; i++) {
            //prices是代价， 今日持有的利润 = max(昨日持有的利润，昨日不持有的利润 - 今日买入花销） 今日未持有的利润 = max(昨日未持有的利润，昨日持有的利润 + 今日卖出赚到的）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
        }
        return dp[prices.length-1][0];
    }

}

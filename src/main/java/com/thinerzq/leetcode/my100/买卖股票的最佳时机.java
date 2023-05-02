package com.thinerzq.leetcode.my100;

public class 买卖股票的最佳时机 {

    public static void main(String[] args) {
    }

    public static int maxProfit(int[] prices){

        int profit = Integer.MIN_VALUE;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]<buyPrice){
                buyPrice = prices[i];
            }
            profit = Math.max(profit, prices[i]-buyPrice);
        }
        return profit;
    }

}

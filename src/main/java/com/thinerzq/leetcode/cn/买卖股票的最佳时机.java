package com.thinerzq.leetcode.cn;

public class 买卖股票的最佳时机 {

    public static void main(String[] args) {

        int[] prices = new int[]{7, 1, 5, 3, 6, 4};

        System.out.println(maxProfit(prices));
        System.out.println(maxProfit2(prices));
    }

    //贪心解法,
    public static int maxProfit(int[] prices) {


        //找到一直上涨的 日子，最低的时候买入，最高卖出，在下降的时候不做任何交易，把所有的 卖出加起来就是最终的最高收益
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int start = 0;
        int total = 0;
        while (start < prices.length) {

            while (start < prices.length - 1 && prices[start] >= prices[start + 1]) {
                start++;
            }
            int min = prices[start];
            while (start < prices.length - 1 && prices[start] <= prices[start + 1]) {
                start++;
            }
            total += (prices[start++] - min);
        }
        return total;

    }


    public static int maxProfit2(int[] prices){

        int total = 0 ;

        for (int i = 0; i < prices.length-1; i++) {


            total+=Math.max(prices[i+1]-prices[i],0);
        }
        return total;


    }






}

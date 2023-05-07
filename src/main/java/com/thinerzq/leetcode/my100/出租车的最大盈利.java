package com.thinerzq.leetcode.my100;

import java.util.*;

public class 出租车的最大盈利 {
    public static void main(String[] args) {

        new 出租车的最大盈利().maxTaxiEarnings(20, new int[][]{{1,6,1},{3,10,2},{10,12,3},{11,12,2},{12,15,2},{13,18,1}});
    }

    /**
     *
     * @param n
     * @param rides
     * @return
     */
    public long maxTaxiEarnings(int n, int[][] rides) {
        //  key:乘客订单的终点 value:(乘客订单的起点，乘客订单的小费)的list
        Map<Integer, List<int[]>> map = new HashMap<>();
        for (int[] ride : rides) {
            if (map.containsKey(ride[1])) {
                map.get(ride[1]).add(new int[]{ride[0], ride[2]});
            } else {
                List<int[]> startTips = new ArrayList<>();
                startTips.add(new int[]{ride[0], ride[2]});
                map.put(ride[1], startTips);
            }
        }
        // dp[i] 表示从1开到i位置的最大盈利
        long[] dp = new long[n + 1];
        for (int i = 2; i <= n; i++) {
            // 表示没有乘客从i位置下车的最大盈利
            dp[i] = dp[i - 1];

            // 计算有乘客从i位置下车的最大盈利
            if (null != map.get(i)) {
                for (int[] startTip : map.get(i)) {
                    dp[i] = Math.max(dp[i], dp[startTip[0]] + i - startTip[0] + startTip[1]);
                }
            }
        }
        return dp[n];

    }
}

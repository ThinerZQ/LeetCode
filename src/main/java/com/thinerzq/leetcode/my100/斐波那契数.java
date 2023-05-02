package com.thinerzq.leetcode.my100;

public class 斐波那契数 {
    public static void main(String[] args) {

    }

    /**
     * 递归
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }


    /**
     * 动态规划
     * @param n
     * @return
     */
    public int fib2(int n) {


        if (n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }
        int dp[] = new int[n+1];
        dp[0]=0;
        dp[1] =1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1]+dp[i-2];
        }
        return dp[dp.length-1];
    }
}

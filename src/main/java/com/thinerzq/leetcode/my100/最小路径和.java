package com.thinerzq.leetcode.my100;

public class 最小路径和 {
    public static void main(String[] args) {

    }
    public int minPathSum(int[][] grid) {


        int m =grid.length;
        int n = grid[0].length;


        int[][] dp= new int[m][n];

        for (int i = 0; i < m; i++) {
            dp[i][0] = dp[i>0?i-1:i][0]+grid[i][0];
        }
        for (int i = 1; i < n; i++) { // i=1 避免初始化两次
            dp[0][i] = dp[0][i>0?i-1:i]+grid[0][i];
        }
        //dp[i][j] 表示从0,0 到i,j 最小路径
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + grid[i][j];
                System.out.println( dp[i][j]);
            }
        }
        return dp[m-1][n-1];





    }
}

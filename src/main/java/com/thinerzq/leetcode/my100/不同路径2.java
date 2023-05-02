package com.thinerzq.leetcode.my100;

public class 不同路径2 {
    public static void main(String[] args) {

int[][] m = new int[][]{{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(new 不同路径2().uniquePathsWithObstacles(m));

    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];

        // 初始化第一列
        int k=m;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0]==1){
                k=i;
                break;
            }else{
                dp[i][0] = 1;
            }
        }
        for (int i = k; i < m; i++) {
            dp[i][0] = 0;

        }

        // 初始化第一行
        int s=n;
        for (int i = 0; i < n; i++) {
            if (obstacleGrid[0][i]==1){
                s=i;
                break;
            }else{
                dp[0][i] = 1;
            }
        }
        for (int i = s; i < n; i++) {
            dp[0][i] = 0;

        }
        // 动态规划dp[i][j] 表示到从0,0 到 i,j有多少条路径
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j]==1){
                    dp[i][j]= 0;
                    continue;
                }
                if (obstacleGrid[i-1][j]!=1 && obstacleGrid[i][j-1]!=1){
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }else if (obstacleGrid[i-1][j]!=1){
                    dp[i][j] = dp[i-1][j];
                }else if (obstacleGrid[i][j-1]!=1){
                    dp[i][j]= dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}

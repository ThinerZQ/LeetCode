package com.thinerzq.leetcode.algorithms;

/**
 * Created by Intellij IDEA
 * Date: 16-5-2
 * Time: 下午4:46
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class MinimumPathSum_64 {

    public static void main(String[] args) {

    }
    public static int minPathSum(int[][] grid) {


        int m =grid.length;
        int n = grid[0].length;

        int[][] pathSum=new int[m][n];

        return find2(grid,pathSum,m-1,n-1);



    }
    //通过完全递归的方法解决
    public static int find(int[][] grid,int m,int n){


        if (m==0 && n==0){
            return grid[0][0];
        }else if (m==0){
            int sum=0;
            for (int i = 0; i <= n; i++) {
                sum+=grid[0][i];
            }
            return sum;
        }else if (n==0){
            int sum=0;
            for (int i = 0; i <= m; i++) {
                sum+=grid[i][0];
            }
            return sum;
        }else{
            return Math.min(find(grid,m-1,n),find(grid,m,n-1))+grid[m][n];
        }


    }
    //通过动态规划的方法解决
    public static int find2(int[][] grid,int[][] pathSum, int m,int n){

        if (pathSum[m][n]!=0){
            return pathSum[m][n];
        }

        if (m==0 && n==0){
            pathSum[0][0]= grid[0][0];
            return grid[0][0];
        }else if (m==0){
            int sum=0;
            for (int i = 0; i <= n; i++) {
                sum+=grid[0][i];
            }
            pathSum[m][n] = sum;
            return sum;
        }else if (n==0){
            int sum=0;
            for (int i = 0; i <= m; i++) {
                sum+=grid[i][0];
            }
            pathSum[m][n] = sum;
            return sum;
        }else{
            pathSum[m][n] = Math.min(find2(grid,pathSum,m-1,n),find2(grid,pathSum,m,n-1))+grid[m][n];
            return pathSum[m][n];
        }


    }

}

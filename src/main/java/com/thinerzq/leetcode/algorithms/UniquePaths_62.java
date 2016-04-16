package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 23:01
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class UniquePaths_62 {

    public static void main(String[] args) {

        System.out.println(uniquePaths(23,12));
    }

    /**
     * 此方法会超时，改为动态规划
     * @param m
     * @param n
     * @return
     */
    public static int uniquePaths(int m, int n) {


        if (m==1 && n==1){
            return 1;
        }else if (m==1 || n==1){
            return 1;
        }else{
            return uniquePaths(m-1,n)+uniquePaths(m,n-1);
        }



    }
    public static int uniquePaths_1(int m, int n) {

        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            temp[i][0]=1;
        }
        for (int i = 0; i < n; i++) {
            temp[0][i] =1;
        }


        return compute(temp,m-1,n-1);


    }
    private static int compute(int[][] array,int m,int n){

        if (m==0 && n==0){
            return 1;
        }else if (m==0 || n==0){
            return 1;
        }else{
            if (array[m-1][n]==0){
                array[m-1][n] = compute(array,m-1,n);
            }
            if (array[m][n-1] ==0){
                array[m][n-1]=compute(array,m,n-1);
            }
            return array[m-1][n]+array[m][n-1];
        }
    }

}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/17
 * Time: 23:25
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class SpiralMatrixII_59 {
    public static void main(String[] args) {
        generateMatrix(3);
    }

    public static int[][] generateMatrix(int n) {

        if(n<=0){
            return new int[0][0];
        }
        int[][] array = new int[n][n];

        int x = 0, y = 0;
        array[x][y] = 1;
        int tol = 1;
        while(tol < n*n){
            System.out.println(tol);
            while(y+1 < n && array[x][y+1]==0)
                array[x][++y] = ++tol;
            while(x+1 < n && array[x+1][y]==0)
                array[++x][y] = ++tol;
            while(y-1 >= 0 && array[x][y-1]==0)
                array[x][--y] = ++tol;
            while(x-1 >= 0 && array[x-1][y]==0)
                array[--x][y] = ++tol;
        }
        return array;
    }

}

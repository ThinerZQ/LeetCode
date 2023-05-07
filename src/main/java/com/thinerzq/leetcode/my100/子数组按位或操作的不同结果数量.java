package com.thinerzq.leetcode.my100;

import java.util.HashSet;
import java.util.Set;

public class 子数组按位或操作的不同结果数量 {
    public static void main(String[] args) {


        new 子数组按位或操作的不同结果数量().subarrayBitwiseORs2(new int[]{13,4,2});
    }

    /**
     * 动态规划，会超时
     * @param arr
     * @return
     */
    public int subarrayBitwiseORs(int[] arr) {

        int[][] dp  = new int[arr.length][arr.length];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i==j){
                    dp[i][j] = arr[j];
                }else{
                    dp[i][j] = dp[i][j-1] | arr[j];
                }
                set.add(dp[i][j]);
            }
        }
        return set.size();
    }
    public int subarrayBitwiseORs2(int[] arr) {
        int max = 0;
        // arr 是非负证书，全部 或运算完了就是最大的的结果值
        for (int j = 0; j < arr.length; j++) {
            max |= arr[j];
        }
        System.out.println(max);
        System.out.println();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int res = 0 ;
            for (int j = i; j < arr.length; j++) {
                res|=arr[j];
                set.add(res);
                System.out.print(res+",");
                if (res>max){
                    break;
                }
            }
            System.out.println();
        }
        System.out.println(set.size()+",,");
        return set.size();
    }
}

package com.thinerzq.leetcode.my100;

import java.util.HashMap;

public class 最长定差子序列长度 {
    public static void main(String[] args) {


        System.out.println(new 最长定差子序列长度().longestSubsequence(new int[]{},5692));
    }

    /**
     * 动态规划 数据量太大会超时
     * @param arr
     * @param difference
     * @return
     */
    public int longestSubsequence(int[] arr, int difference) {


        int[] dp = new int[arr.length];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            dp[i]=1;
            for (int j = 0; j < i; j++) {
                if (difference == arr[i]-arr[j]){
                    dp[i] = Math.max(dp[i],dp[j]+1);
                }
                if (dp[i]>max){
                    max = dp[i];
                }
            }
        }
        return max;
        
        
    }
    /**
     * 利用hashmap
     * @param arr
     * @param difference
     * @return
     */
    public int longestSubsequence2(int[] arr, int difference) {

        int max = 1 ;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <arr.length; i++) {
            int f = arr[i]-difference;
            Integer val= hashMap.get(f);
            if (val!=null){
                max= Math.max( val+1,max);
                hashMap.put(arr[i],val+1);

            }else{
                hashMap.put(arr[i],1);
            }
        }
        return max;

    }
}

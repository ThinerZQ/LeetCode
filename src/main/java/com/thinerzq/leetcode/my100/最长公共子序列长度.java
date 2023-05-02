package com.thinerzq.leetcode.my100;

public class 最长公共子序列长度 {
    public static void main(String[] args) {

        System.out.println(new 最长公共子序列长度().longestCommonSubsequence("abcde","ace"));
    }

    /**
     * dp[i][j] 的定义是 A字符串从第0到第i个字符  与B字符串从第0到第j个字符的最长公共子序列长度  ，这里的第i个字符不是指下标i 而是实际的字符顺序
     * 递推公式如下
     *
     *  dp[i][j] =0 , i=0 | j=0 ,第0个字符与其他任意字符最长公共子序列都是0
     * dp[i][j] = dp[i-1][j-1]+1    , A[i-1] = B[j-1]
     * dp[i][j] = max(dp[i][j-1] ,dp[i-1][j]  )    , A[i] != B[j]
     *
     * @param text1
     * @param text2
     * @return
     */
    public int longestCommonSubsequence(String text1, String text2) {

        char[] A = text1.toCharArray();
        char[] B = text2.toCharArray();


        int[][] dp = new int[A.length+1][B.length+1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (A[i-1]==B[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;   // 第i个字符 对应的数组下标就是 A[i-1]
                }else{
                    dp[i][j] =Math.max(dp[i][j-1] ,dp[i-1][j]);
                }
            }
        }

        return dp[A.length][B.length];
    }
}

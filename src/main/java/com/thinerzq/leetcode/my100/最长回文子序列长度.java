package com.thinerzq.leetcode.my100;

public class 最长回文子序列长度 {

    public static void main(String[] args) {

        new 最长回文子序列长度().longestPalindromeSubseq("bbbab");

    }
    public int longestPalindromeSubseq(String s) {

        int[][] dp = new int[s.length()][s.length()];

        //dp[i][j] 从i,到j 左闭右闭 范围内的最长公共子序列长度
        for (int i = 0; i < s.length(); i++) {
            dp[i][i]=1;
        }
        int max = 1;
        for (int i = s.length()-1; i >=0 ; i--) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1]+2;
                }else{
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }

        return dp[0][s.length()-1];



    }
//    public int longestPalindromeSubseq(String s) {
//        int max =0;
//        char[] m = s.toCharArray();
//        for (int i = 0; i < s.length(); i++) {
//           int length1 =  count(m,i,i);
//           int length2=  count(m,i,i+1);
//           if (length1>max){
//               max = length1;
//           }
//            if (length2>max){
//                max = length2;
//            }
//        }
//        return max;
//    }

//    public int count(char[] chars,int start,int end){
//        int length = 0;
//        while (start>=0&& end<chars.length){
//            if (chars[start] == chars[end]){
//                start--;
//                end++;
//                length++;
//            }
//        }
//        return length;
//    }
}

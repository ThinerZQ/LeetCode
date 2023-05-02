package com.thinerzq.leetcode.cn;

public class 最长回文子串 {
    public static void main(String[] args) {


        longestPalindrome("cbbd");

    }


    public static String longestPalindrome(String s) {



        //dp[i][j] = 1  表示从i-j是最长回文子串
        // dp[i+1][j]

        String item = null;
        int max = 0;
        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = s.length()-1; i>=0; i--) {
            for (int j = i; j <s.length() ; j++) {

                if (s.charAt(i) == s.charAt(j) && ( j <= i + 1 || dp[i+1][j-1])){
                    dp[i][j] =true;
                    if (j-i >= max){
                        item = s.substring(i,j+1);
                        max= j-i;
                    }
                }
            }
        }

        return item;
    }
}

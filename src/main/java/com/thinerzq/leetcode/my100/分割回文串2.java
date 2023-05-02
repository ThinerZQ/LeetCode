package com.thinerzq.leetcode.my100;

public class 分割回文串2 {
    public static void main(String[] args) {

        System.out.println(new 分割回文串2().minCut("aaabaa"));
    }
    /**
     * 动态规划发
     * 回文串是一个区间段，可以采用二维数组的形式来 表示 区间的大小
     *
     * dp[i][j] 表示从i-j这一段是否是回文串, 那么递推公式可以表达为
     * dp[i][j] = true , i=j
     *  dp[i][j] = true , j-i=1 && s[i]=s[j]
     *  dp[i][j] = dp[i+1][j-1] ,j-i>1 && s[i]=s[j]
     *  dp[i][j] = false ,s[i] !=s[j]
     *
     * @param s
     * @return
     */
    public int minCut(String s) {


        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j <=i; j++) {
                if (i==j){
                    dp[i][j] = true;

                    continue;
                }
                if (i-j==1){
                    if (s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;

                    }else{
                        dp[i][j] = false;
                    }
                    continue;
                }
                // 因为 boolean 数组是正方形，是对称的，所以用了 左边的部分来计算. 可以用右边部分来思考
                if (s.charAt(i) == s.charAt(j)){

                    dp[i][j] = dp[i-1][j+1];
                    if (dp[i-1][j+1]){

                    }
                }else{
                    dp[i][j] = false;
                }
            }
        }

        // 通过左边部分，对称补齐右边部分
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                dp[i][j] = dp[j][i];
            }
        }

        for (int i = 0; i < s.length() ; i++) {
            for (int j = 0; j < s.length(); j++) {
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }

        int k = 0;
        // 计算出来了回文串数组，然后开始分割这个数组 , 最少的次数怎么来的 ,局部最优的求法
//        for (int i = 0; i <s.length();) {
//            for (int j = s.length()-1; j >=i; j--) {
//                if (dp[i][j]){
//                    i=j+1;
//                    k++;
//                    break;
//                }
//            }
//        }


        //怎么求全局最优 ,再使用一次动态规划
        int[] mp = new int[s.length()];  // mp[i] = 从0-i字符最小分割次数,
        // mp[i] = min(mp[i],mp[i-1]+1)
        for (int i = 0; i <s.length();i++) {
           if (dp[0][i]){
               mp[i] = 0; // 不需要分割
           }
        }


        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <=i; j++) {
                if(dp[i][j]){
                    mp[i] = Math.min(mp[i],mp[j-1]+1);
                }
            }
        }


        return mp[s.length()-1];
    }




}

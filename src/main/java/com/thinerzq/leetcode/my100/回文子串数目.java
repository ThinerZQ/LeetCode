package com.thinerzq.leetcode.my100;

/**
 * 给你一个字符串 s ，请你统计并返回这个字符串中 回文子串 的数目。
 *
 * 回文字符串 是正着读和倒过来读一样的字符串。
 *
 * 子字符串 是字符串中的由连续字符组成的一个序列。
 *
 * 具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/palindromic-substrings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

/**
 * 题目的变种是 ：最长的回文子串是什么，不重复的回文子串列表是什么
 */
public class 回文子串数目 {

    int num = 0;
    public static void main(String[] args) {

        System.out.println(new 回文子串数目().countSubstrings2("abc"));
    }

    /**
     * 中心拓展法 : 贪心
     * @param s
     * @return
     */
    public int countSubstrings(String s) {


        for (int i = 0; i < s.length(); i++) {
            count(s,i,i);// 奇数回文子串
            count(s,i,i+1); // 偶数回文子串
        }

        return num;


    }
    /**
     * 中心拓展法
     * @param s
     * @return
     */
    public int count(String s,int start,int end) {

        while (start>=0 && end<s.length() && s.charAt(start) == s.charAt(end)){
            num++;
            start--;
            end++;
        }
        return num;
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
    public int countSubstrings2(String s) {

        boolean dp[][] = new boolean[s.length()][s.length()];
        for (int i = 0; i <s.length(); i++) {
            for (int j = 0; j <=i; j++) {
                if (i==j){
                    dp[i][j] = true;
                    num++;
                    continue;
                }
                if (i-j==1){
                    if (s.charAt(i) == s.charAt(j)){
                        dp[i][j] = true;
                        num++;
                    }else{
                        dp[i][j] = false;
                    }
                    continue;
                }
                // 因为 boolean 数组是正方形，是对称的，所以用了 左边的部分来计算. 可以用右边部分来思考
                if (s.charAt(i) == s.charAt(j)){

                    dp[i][j] = dp[i-1][j+1];
                    if (dp[i-1][j+1]){
                        num++;
                    }
                }else{
                    dp[i][j] = false;
                }
            }
        }
        return num;
    }

}

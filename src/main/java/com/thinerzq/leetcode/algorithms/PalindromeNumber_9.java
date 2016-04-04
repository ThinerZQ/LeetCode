package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 20:56
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class PalindromeNumber_9 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(int x) {

        String val = String.valueOf(x);
        int n = val.length();
        char[] chars = val.toCharArray();
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - i - 1]) {
                return false;
            }
        }
        return true;

    }
}

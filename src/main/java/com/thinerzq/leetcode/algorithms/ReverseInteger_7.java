package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/28
 * Time: 23:27
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class ReverseInteger_7 {
    public static void main(String[] args) {

        reverse(-34563);
    }

    public static int reverse(int x) {

        if (x >= 0) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
            stringBuilder = stringBuilder.reverse();

            long n = Long.parseLong(stringBuilder.toString());
            if (n > Integer.MAX_VALUE) {
                return 0;
            } else {
                return (int) n;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(x).substring(1));
            stringBuilder = stringBuilder.reverse();

            long n = Long.parseLong(stringBuilder.toString());
            if (n > Integer.MAX_VALUE) {
                return 0;
            } else {
                return (int) -n;
            }
        }
    }
}

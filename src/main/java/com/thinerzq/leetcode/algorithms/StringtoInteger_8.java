package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 16:06
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class StringtoInteger_8 {
    public static void main(String[] args) {

    }

    public int myAtoi(String str) {

        if (str.equals("") || str == null) {
            return 0;
        }
        return Integer.parseInt(str);
    }
}

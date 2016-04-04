package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/19
 * Time: 16:11
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class LengthofLastWord_58 {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {

        if (s == null || s.trim().length() == 0) {
            return 0;
        } else {
            String[] strings = s.split(" ");
            return strings[strings.length - 1].length();
        }
    }
}

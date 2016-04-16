package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/28
 * Time: 23:05
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class CountingBits_338 {
    public static void main(String[] args) {

    }

    public int[] countBits(int num) {

        int result[] = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            int count = 0;
            while (i != 0) {
                i &= (i - 1);
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}

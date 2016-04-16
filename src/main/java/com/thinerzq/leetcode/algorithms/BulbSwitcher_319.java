package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 20:15
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class BulbSwitcher_319 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            System.out.println(" i=" + i + " number =" + bulbSwitch(i));
        }

    }

    public static int bulbSwitch(int n) {

        boolean[] flag = new boolean[n];
        for (int i = 0; i < n; i++) {
            int j = i % n, k = j + 1;
            for (; j < n; j += k) {
                if (flag[j]) {
                    flag[j] = false;
                } else {
                    flag[j] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                count++;
            }
        }
        return count;
    }

    public static int bulbSwitch_1(int n) {

        return (int) Math.sqrt(n);
    }
}

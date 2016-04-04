package com.thinerzq.leetcode.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 20:14
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class FactorialTrailingZeroes_172 {
    public static void main(String[] args) {
        BigInteger t = trailingZeroes(2743);
        System.out.println(t);
    }

    public static BigInteger trailingZeroes(int n) {
        if (n == 1)
            return new BigInteger("1");
        return new BigInteger(String.valueOf(n)).multiply(trailingZeroes(n - 1));
    }

    public int zeroes(int n) {
        int base = n / 5;
        int offset = n / 25;
        int j = n / 125;
        int sum = 0;
        int count = 0;
        int k = n;
        while (n > 0) {
            n = n / 5;
            count++;
        }
        count--;
        while (count > 0) {
            sum += k / Math.pow(5, count--);
        }


        return sum;
    }
}

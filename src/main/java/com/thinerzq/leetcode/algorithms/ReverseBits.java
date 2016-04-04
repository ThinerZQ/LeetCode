package com.thinerzq.leetcode.algorithms;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/11
 * Time: 21:56
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ReverseBits {
    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();

        System.out.println(reverseBits.reverseBits_2(1));
    }

    public int reverseBits(int n) {

        String k = Integer.toBinaryString(n);

        int size = k.length();
        int diff = 32 - size;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < diff; i++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(k);
        k = stringBuilder.toString();
        int sum = 0;
        System.out.println(k);
        for (int i = 0; i < k.length(); i++) {
            System.out.println(k.charAt(i));
            if (k.charAt(i) != '0')
                sum += (1 << i);
        }
        return sum;
    }

    public int reverseBits_1(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed = (reversed << 1) | (n & 1);
            n = (n >> 1);
        }
        return reversed;
    }

    public int reverseBits_2(int n) {
        String k = Integer.toBinaryString(n);
        int size = k.length();
        int diff = 32 - size;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < diff; i++) {
            stringBuilder.append("0");
        }
        stringBuilder.append(k);
        k = stringBuilder.toString();
        return Integer.parseInt(k, 2);
    }
}


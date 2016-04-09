package com.thinerzq.leetcode.algorithms;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 22:13
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class UniqueBinarySearchTrees_96 {
    public static void main(String[] args) {

    }
    public int numTrees(int n) {

        //卡特兰数
        BigInteger sum1=new BigInteger("1");
        BigInteger sum2=new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            sum2.multiply(new BigInteger(String.valueOf(n)));
            sum1.multiply(new BigInteger(String.valueOf(n+i)));
        }
        return sum1.divide(new BigInteger(String.valueOf(n+1)).multiply(sum2)).intValue();
    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/24
 * Time: 21:58
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * Write a function that takes an unsigned integer and returns the number of ��1' bits it has (also known as the Hamming weight).
 * <p>
 * For example, the 32-bit integer ��11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */
public class NumberOf1Bits_191 {
    public static void main(String[] args) {
        //Wrong with 2147483648
        //System.out.println(hammingWeight(2147483648));
    }

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {


        int count = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


}

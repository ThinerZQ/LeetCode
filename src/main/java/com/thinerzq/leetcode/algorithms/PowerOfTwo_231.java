package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/20
 * Time: 13:57
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class PowerOfTwo_231 {
    public static void main(String[] args) {

    }
    public boolean isPowerOfTwo(int n) {

        if (n<0){
            return false;
        }
        double temp =Math.log10(n) /Math.log10(2);
        return temp -(int)temp ==0;
    }
}

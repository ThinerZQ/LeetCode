package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 22:02
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MissingNumber_268 {


    public int missingNumber(int[] nums) {

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            sum2 += (i + 1);
        }
        return sum2 - sum1;
    }
}

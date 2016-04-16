package com.thinerzq.leetcode.algorithms;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/30
 * Time: 23:00
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class TwoSum_1 {
    public static void main(String[] args) {

        twoSum(new int[]{3, 2, 4}, 6);


    }

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) == null) {
                map.put(nums[i], i);
            } else {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static int[] twoSum_1(int[] nums, int target) {

        int result[] = new int[2];
        int len = nums.length;
        for (int i = 0; i < len; ++i) {
            for (int j = len - 1; j > i; --j) {

                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }

        return result;
    }
}

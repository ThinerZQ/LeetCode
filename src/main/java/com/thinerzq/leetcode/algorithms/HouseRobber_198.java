package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/26
 * Time: 22:14
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class HouseRobber_198 {
    public static void main(String[] args) {

    }

    public int rob(int[] nums) {

        if (nums.length == 0) {
            return 0;
        } else if (nums.length == 1) {
            return nums[0];
        }

        int sum = 0;
        int max = max(nums);
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == max) {
                    if (i == 0 && nums[i + 1] != -1) {
                        nums[i] = -1;
                        sum += max;
                    } else if (i == nums.length - 1 && nums[i - 1] != -1) {
                        nums[i] = -1;
                        sum += max;
                    } else if (i != 0 && i != nums.length - 1 && nums[i - 1] != -1 && nums[i + 1] != -1) {
                        nums[i] = -1;
                        sum += max;
                    } else {
                        flag = false;
                    }
                    break;
                }
            }
            max = max(nums);
        }

        return sum;
    }

    public int max(int[] nums) {
        int max = 0;
        for (int a : nums) {
            if (a >= max) {
                max = a;
            }
        }
        return max;
    }
}

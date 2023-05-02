package com.thinerzq.leetcode.cn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static void main(String[] args) {

        int[] a = new int[]{2,7,11,15};

        Arrays.stream(twoSum(a,9)).forEach(System.out::println);



    }
    public static int[] twoSum(int[] nums, int target) {

        int[] result = new int[2];
        Map<Integer,Integer> temp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            temp.put(target- nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (temp.get(nums[i])!=null && i!=temp.get(nums[i])){
                result[0] = i;
                result[1] = temp.get(nums[i]);
                break;
            }
        }
        return result;
    }
}

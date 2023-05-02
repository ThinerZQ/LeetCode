package com.thinerzq.leetcode.cn;

public class 只出现一次的数字{
    public static void main(String[] args) {
        int[] a = new int[]{2,2,1};


        System.out.println(singleNumber(a));


    }
    public static int singleNumber(int[] nums) {

        int a = nums[0] ;

        for (int i = 1; i <nums.length; i++) {

            a^=nums[i];

        }

        return a;
    }
}

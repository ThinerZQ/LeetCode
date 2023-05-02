package com.thinerzq.leetcode.cn;

public class 存在重复元素 {
    public static void main(String[] args) {


        int a[] = new int[]{1,2,3,4};
        System.out.println(containsDuplicate(a));



    }
    public static boolean containsDuplicate(int[] nums) {

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
               if ((nums[i] ^ nums[j]) ==0  ){
                   return true;
               }
            }
        }
        return false;


    }
}

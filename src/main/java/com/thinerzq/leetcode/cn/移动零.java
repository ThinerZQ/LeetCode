package com.thinerzq.leetcode.cn;

public class 移动零 {

    public static void main(String[] args) {


        int[] a = new int[]{0, 1, 0, 3, 12};
        moveZeroes(a);
    }

    public static void moveZeroes(int[] nums) {


        int zerocount= 0;
        for (int i = 0; i < nums.length; ) {

            if (i+zerocount ==nums.length){
                break;
            }

            if (nums[i] == 0) {
                zerocount++;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = 0;
                i = 0;
            } else {
                i++;
            }
        }


    }
}

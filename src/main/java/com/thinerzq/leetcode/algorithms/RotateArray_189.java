package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 14:59
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class RotateArray_189 {
    public static void main(String[] args) {

       rotate(new int[]{1, 2, 3, 4, 5, 6, 7},3);
    }

    public static void rotate(int[] nums, int k) {


        //行不通，还有负数
        if (k == nums.length){
            return;
        }
        StringBuilder  sb = new StringBuilder();
        for (int i = k+1; i < nums.length; i++) {
           sb.append(nums[i]);
        }
        for (int i = 0; i <= k; i++) {
            sb.append(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(sb.substring(i,i+1));
            System.out.println(nums[i]);
        }
    }
    public static void rotate_1(int[] nums, int k) {


    }
}

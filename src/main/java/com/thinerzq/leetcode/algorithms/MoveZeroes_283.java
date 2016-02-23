package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 10:45
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 *
 */
public class MoveZeroes_283 {
    public static void main(String[] args) {

    }
    public void moveZeroes(int[] nums) {
        int temp[] = new int[nums.length];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<k;i++){
            nums[i] =temp[i];
        }
        for(;k<nums.length;k++){
            nums[k]=0;
        }
    }
}

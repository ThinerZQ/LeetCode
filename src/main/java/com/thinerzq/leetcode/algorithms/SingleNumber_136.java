package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 12:51
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class SingleNumber_136 {
    public static void main(String[] args) {
            ;
    }
    public static int singleNumber(int[] nums) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int m: nums){
            if (!(arrayList.size() ==0) && arrayList.contains(m)){
                arrayList.remove(Integer.valueOf(m));
            }else if(arrayList.size() ==0 || !arrayList.contains(m)){
                arrayList.add(m);
            }
        }
        return arrayList.get(0);
    }
    public static int singleNumber_another(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]){
                    nums[i] =0;
                    nums[j] =0;
                    break;
                }
            }
        }
        for (int num: nums) {
            if (num != 0){
                return num;
            }
        }
        return 0;
    }

    public int[] singleNumberII(int[] nums) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] == nums[i]){
                    nums[i] =0;
                    nums[j] =0;
                    break;
                }
            }
        }
        int i=0;
        for (int num: nums) {
            if (num != 0){
                temp[i++] =num;
            }
        }
        return temp;
    }
    public int singleNumberIII(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (nums[i] == nums[j]){
                    for (int k = j-1; k >=0; k--) {
                        if (nums[j] == nums[k] ){
                            nums[k] =0;
                            nums[j] =0;
                            nums[i] =0;
                            break;
                        }
                    }
                    break;
                }
            }
        }
        for (int num: nums) {
            if (num != 0){
                return num;
            }
        }
        return 0;

    }
}

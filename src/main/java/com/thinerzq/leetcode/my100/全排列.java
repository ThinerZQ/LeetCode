package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    public static void main(String[] args) {

        permute(new int[]{1,2,3,4}).stream().forEach(System.out::print);
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> all = new ArrayList<>();
        permute(nums,new ArrayList<>(),all);
        return all;
    }


    public static void permute(int[] nums ,List<Integer> current,List<List<Integer>> all) {

        if (current.size()==nums.length){
            all.add(new ArrayList<>(current));
            return;
        }
        for (int start = 0; start < nums.length; start++) {
            if (current.contains(nums[start])){ // 只要访问过了，就不再访问了, 每次都从0开始的一个循环开始， 1,2,3,4  ， 1,2,4,3
                continue;
            }
            current.add(nums[start]);
            permute(nums,current,all);
            current.remove(current.size()-1);
        }

    }
}

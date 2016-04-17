package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/17
 * Time: 22:29
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class Permutations_46 {
    public static void main(String[] args) {

        permute(new int[]{2,3});
    }

    public static List<List<Integer>> permute(int[] nums) {


        return assist(nums,nums.length-1);


    }
    private static List<List<Integer>> assist(int[] nums, int n){


        if (n==0){
            List<List<Integer>> lists = new ArrayList<List<Integer>>();
            List<Integer> list = new ArrayList<Integer>();
            list.add(nums[0]);
            lists.add(list);
            return lists;
        }
        List<List<Integer>> lists = assist(nums,n-1);
        List<List<Integer>> tempList = new ArrayList<List<Integer>>();
        for (List<Integer> list: lists) {
            int i = 0;
            List<Integer> temp;
            for (; i < list.size(); i++) {
                temp = new ArrayList<Integer>(list);
                temp.add(i,nums[n]);
                tempList.add(temp);
            }
            temp = new ArrayList<Integer>(list);
            temp.add(i,nums[n]);
            tempList.add(temp);

        }
        return tempList;

    }

}

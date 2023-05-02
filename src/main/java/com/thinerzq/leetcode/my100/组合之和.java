package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 组合之和 {


    public static void main(String[] args) {



        combinationSum(new int[]{2,3,6,7},7).stream().forEach(t->{t.stream().forEach(System.out::print);
        System.out.println();});




    }



    public static List<List<Integer>> combinationSum(int[] candidates, int target) {


        List<List<Integer>> result = new ArrayList<>();

        comp(candidates,target,new ArrayList<>(),0,result);

        return result;


    }

    public static void comp (int[] candidates, int target , List<Integer> data, int start, List<List<Integer>> result ){

        if (target ==0){
            result.add(new ArrayList<>(data)); // 转存
        }
        //每一次递归都会进行整个数组的遍历,
        for (int i = start; i < candidates.length; i++) {
            if (target < 0)
                break;

            data.add(candidates[i]); // 提前写入进去
            comp(candidates,target-candidates[i],data,i,result); // 关键点是：i ,每一层往下的递归下一次都要从当前节点的下一个节点开始
            data.remove(data.size() - 1); // 如果这一次

        }
    }


}

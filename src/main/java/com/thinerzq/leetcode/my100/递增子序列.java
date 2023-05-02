package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class 递增子序列 {
    public static void main(String[] args) {


        findSubsequences(new int[]{7,7,7,7,8}).stream().forEach(t->{
            t.stream().forEach(s-> System.out.print(s+","));
            System.out.println();
        });
    }

    /**
     * num 可能不是有序的.
     * @param nums
     * @return
     */
    public static List<List<Integer>> findSubsequences(int[] nums) {


        List<List<Integer>> finalResult = new ArrayList<>();
        int[] visited = new int[nums.length];
        int[] globalVisited = new int[202];
        findSubsequences(nums,0,finalResult,new ArrayList<>(),visited,globalVisited);
        return finalResult;

    }

    public static void findSubsequences(int[] nums,int startIndex,List<List<Integer>> finalResult, List<Integer> tempResult ,int[] visited,int[] globalVisited){

        if (tempResult.size()>=2){
            finalResult.add(new ArrayList<>(tempResult));
        }
        //[[1,1],[1,1,1],[1,1,1,1],[1,1,1,1,1],[1,1,1,1,1,1],[1,1,1,1,1,1,1]
        // [1,1],[1,1,1],[1,1,1,1],[1,1,1,1,1],[1,1,1,1,1,1]    ]

        Set<Integer> hashSet = new HashSet<>();
        for (int i = startIndex; i < nums.length; i++) {
            if (!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
                if (tempResult.isEmpty() || tempResult.get(tempResult.size()-1) <=nums[i]){
                    tempResult.add(nums[i]);
                }else{
                    continue;
                }
            }else{
                continue;
            }
            findSubsequences(nums,i+1,finalResult,tempResult,visited,globalVisited);
            tempResult.remove(tempResult.size()-1);
        }


    }

}

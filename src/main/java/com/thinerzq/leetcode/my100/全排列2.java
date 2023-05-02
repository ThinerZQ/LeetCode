package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 输入：nums = [1,1,2]
 * 输出：
 * [[1,1,2],
 *  [1,2,1],
 *  [2,1,1]]
 */
public class 全排列2 {
    public static void main(String[] args) {

        permute(new int[]{1,1,2}).stream().forEach(System.out::print);
    }
    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> all = new ArrayList<>();
        int[] visited = new int[nums.length];

        Arrays.sort(nums);
        permute(nums,new ArrayList<>(),all,visited);
        return all;
    }

    /**
     * 1,1,2   1,2,1  ; 跳过, 跳过；2,1,1 跳过；
     * @param nums
     * @param current
     * @param all
     */
    public static void permute(int[] nums ,List<Integer> current,List<List<Integer>> all,int[] visited) {

        if (current.size()==nums.length){
            all.add(new ArrayList<>(current));
            return;
        }
        for (int start = 0; start < nums.length; start++) {
            if (start>0 && nums[start] == nums[start-1] && visited[start-1]==0){ //  去重，对于同一层的元素，如果前一个元素没有访问过，就跳过，说明在上一批中已经访问过了
                continue;
            }

            if (visited[start]==0){
                visited[start] = 1;
                current.add(nums[start]);
                permute(nums,current,all,visited);
                current.remove(current.size()-1);
                visited[start] = 0;
            }

        }

    }
}

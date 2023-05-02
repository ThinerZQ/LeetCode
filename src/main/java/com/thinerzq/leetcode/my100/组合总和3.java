package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 组合总和3 {
    public static void main(String[] args) {

    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        combinationSum3(k,n,1,result,new ArrayList<>());
        return result;
    }

    public void combinationSum3(int k,int n,int startIndex,List<List<Integer>> result,List<Integer> middleResult){
        //只能使用数字1-9
        // 每次都是从1-9 之间选择，但是一旦选择过就不能再选择了. 所以每一次都需要排除一些选择过的数字
        if (n==0 && k==0){
            result.add(new ArrayList<>(middleResult));
            return;
        }
        for (int i = startIndex; i <= 9; i++) {
            if (middleResult.contains(i)){
                continue;
            }
            if (k==0){
                break;
            }
            middleResult.add(i);
            combinationSum3(k-1,n-i,i+1,result,middleResult);
            middleResult.remove(middleResult.size()-1);
        }
    }
}

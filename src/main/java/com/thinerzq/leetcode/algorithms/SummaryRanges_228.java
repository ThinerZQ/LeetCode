package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/25
 * Time: 13:30
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class SummaryRanges_228 {

    public static void main(String[] args) {

        summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<String>();
        int size = nums.length;
        if (size ==1){
            list.add(nums[0]+"");
            return list;
        }
        boolean flag = false;
        for (int i = 0, j = 0; i < size - 1; ++i) {
            if (nums[i+1] == nums[i] + 1) {
                if (i != size - 2) {
                    continue;
                }
            }
            if (i==size-2){
                if (nums[i + 1] == nums[i] + 1)
                    i++;
                else
                    flag = true;
            }
            if (j == i) {
                list.add(nums[i] + "");
            } else {
                list.add("" + nums[j] + "->" + nums[i]);
            }
            j = i + 1;
        }
        if (flag){
            list.add(nums[size-1]+"");
        }
        return list;
    }

}

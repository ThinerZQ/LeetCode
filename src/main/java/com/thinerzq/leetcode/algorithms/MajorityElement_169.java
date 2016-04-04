package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 18:04
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */


import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ? n/2 ? times.
 * <p>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement_169 {
    public static void main(String[] args) {

    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        for (int temp : nums) {
            if (tempMap.get(temp) != null) {
                tempMap.put(temp, tempMap.get(temp) + 1);
            } else {
                tempMap.put(temp, 1);
            }
        }
        int threshold = nums.length / 2;
        for (Map.Entry<Integer, Integer> temp : tempMap.entrySet()) {
            if (temp.getValue() > threshold) {
                return temp.getKey();
            }
        }
        return 0;
    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 11:30
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate_217 {
    public static void main(String[] args) {

        ContainsDuplicate_217.containsDuplicate(new int[]{1, 2, 3, 4});
    }

    public static boolean containsDuplicate(int[] nums) {

        HashSet hashSet = new HashSet();
        for (int temp : nums) {
            hashSet.add(temp);
        }
        if (hashSet.size() == nums.length) {
            return false;
        } else {
            return true;
        }
    }
}

package com.thinerzq.leetcode.algorithms;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/14
 * Time: 22:29
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class MaximumProductofWordLengths_318 {
    public static void main(String[] args) {

    }

    public static int maxProduct_1(String[] words) {

        int[][] temp = new int[words.length][words.length];
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (!hasIntersection(words[i], words[j])) {
                    temp[i][j] = words[i].length() * words[j].length();
                    if (max < temp[i][j]) {
                        max = temp[i][j];
                    }
                }
            }
        }
        return max;

    }

    public static boolean hasIntersection(String a, String b) {

        int[] temp = new int[26];
        for (int i = 0; i < a.length(); i++) {
            temp[a.charAt(i) - 'a'] = 1;
        }
        for (int i = 0; i < b.length(); i++) {
            if (temp[b.charAt(i) - 'a'] != 0) {
                temp[b.charAt(i) - 'a']++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasIntersection_1(String a, String b) {

        int a_size = a.length();
        int b_size = b.length();
        String temp = "";
        if (a_size < b_size) {
            temp = a + b;
            String[] strings = a.split("");
            LinkedHashSet<String> set = new LinkedHashSet<String>(Arrays.<String>asList(strings));
            for (int i = 0; i < set.size(); i++) {
                //TODO:
                if (temp.lastIndexOf(c) > a_size) {
                    return true;
                }
            }
        } else {
            temp = b + a;
            for (int i = 0; i < b.length(); i++) {
                char c = temp.charAt(i);
                if (temp.lastIndexOf(c) > a_size) {
                    return true;
                }
            }
        }
        return false;
    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 15:37
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class CompareVersionNumbers_165 {
    public static void main(String[] args) {

        System.out.println(compareVersion_1("0.1", "0.0.1"));
    }

    // error method
    public int compareVersion(String version1, String version2) {

        Double v1 = Double.parseDouble(version1);
        Double v2 = Double.parseDouble(version2);

        if (v1 > v2) {
            return 1;
        } else if (v1 < v2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int compareVersion_1(String version1, String version2) {

        String[] str1 = version1.split("\\.");
        String[] str2 = version2.split("\\.");
        int size = str1.length > str2.length ? str2.length : str1.length;
        int i = 0;
        for (; i < size; i++) {

            int v1 = Integer.parseInt(str1[i]);
            int v2 = Integer.parseInt(str2[i]);

            if (v1 > v2) {
                return 1;
            } else if (v1 < v2) {
                return -1;
            }
        }
        if (str1.length == str2.length) {
            return 0;
        } else if (str1.length == size) {
            for (; i < str2.length; i++) {
                if (Integer.parseInt(str2[i]) != 0) {
                    return -1;
                }
            }
            return 0;
        } else {
            for (; i < str1.length; i++) {
                if (Integer.parseInt(str1[i]) != 0) {
                    return 1;
                }
            }
            return 0;
        }
    }
}

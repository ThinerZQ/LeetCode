package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;

/**
 * Created by Money Zheng on 2016/3/23.
 */
public class CountPrimes_204 {

    public static void main(String[] args) {

        long begin = System.currentTimeMillis();
        System.out.println(countPrimes(999983));
        long end = System.currentTimeMillis();
        System.out.println(end - begin);
    }

    public static int countPrimes(int n) {

        int count = 0;
        if (n > 10) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(3);
            list.add(5);
            list.add(7);
            for (int i = 11; i < n; i += 2) {
                int t = String.valueOf(i).length();
                int offset = 0;
                if (t % 2 == 0) {
                    offset = (int) Math.pow(10, t - 2);
                    if (t == 2) {
                        offset = 10;
                    }
                } else {
                    offset = (int) Math.pow(10, t - 1);
                }
                boolean flag = true;
                int size = list.size();
                for (int j = 0; j < size; ++j) {
                    int s = list.get(j);
                    if (i % s == 0) {
                        flag = false;
                        break;
                    }
                    if (s >= offset) {
                        break;
                    }
                }
                if (flag) {
                    list.add(i);
                    ++count;
                }
            }
            count += 4;
        } else {
            if (n > 7) {
                count = 4;
            } else if (n > 5) {
                count = 3;
            } else if (n > 3) {
                count = 2;
            } else if (n > 2) {
                count = 1;
            } else {
                count = 0;
            }
        }
        return count;
    }
}

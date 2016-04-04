package com.thinerzq.leetcode.algorithms;

/**
 * Created by 60109 on 2016/3/25.
 */
public class ZigZagConversion_6 {
    public static void main(String[] args) {

        System.out.println(convert("ashgabskbhakjfjhbas",3));
    }
    public static String convert(String s, int numRows) {

       int first = numRows, two = numRows-2;
        int size = s.length();
        StringBuilder sb = new StringBuilder();
        int cols = size /(first+two);

        for (int i=0;i<=numRows;i++){
            for (int j = 0; j < cols; j++) {

            }
        }
        return null;
    }
}

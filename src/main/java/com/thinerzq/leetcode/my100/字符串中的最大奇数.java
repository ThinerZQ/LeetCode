package com.thinerzq.leetcode.my100;

public class 字符串中的最大奇数 {
    public static void main(String[] args) {

    }
    public static String largestOddNumber(String num) {


        int end = -1;
        for (int i = num.length()-1; i >=0; i--) {
            if (num.charAt(i) %2 ==1){
                //这个数字是奇数的尾巴
                end = i;
                break;
            }
        }
        if (end==-1){
            return "";
        }
        return num.substring(0,end+1);

    }
}

package com.thinerzq.leetcode.my100;

public class 位1的个数 {
    public static void main(String[] args) {

        int n =931281;

        int count =0;

        while (n!=0){
            // 与运算 判断最后一位是否为1
            count +=(n&1);

            // >>>：无符号右移 无论最高位是0还是1，左边补齐0
            n=n>>>1;
        }

        System.out.println(count);
    }
}

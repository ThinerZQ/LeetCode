package com.thinerzq.leetcode.my100;

public class 最大69组成的最大数字 {
    public static void main(String[] args) {


        System.out.println(maximum69Number(9669));
    }
    public static int maximum69Number (int num) {

        int t = num;

        //找出第一个6 ，变成9
        int i = 0;
        int i6=0;
        while (t>0){

            i++;
            if (t%10 != 9){
                i6=i;
            }
            t= t/10;

        }
        if(i6==0){
            return num;
        }
        int add = 3;
        for (int j = 1; j < i6; j++) {
            add*=10;
        }

        return num+add;

    }
}

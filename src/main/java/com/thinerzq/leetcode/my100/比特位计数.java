package com.thinerzq.leetcode.my100;

import java.util.Arrays;

public class 比特位计数 {
    public static void main(String[] args) {
        new 比特位计数().countBits(32);

    }
    public int[] countBits(int n) {

        int[] oneCount  = new int[n+1];
        for (int i = 0; i <= n; i++) {
            int countOne = 0 ;

            int current = i;
            while ((current) >0){
                if ((current&1) ==1){
                    countOne++;
                }
                current = current>>1;
            }
            oneCount[i] = countOne;

            System.out.println(i+","+countOne);
        }

        return oneCount;

    }


    public int[] countBits2(int n) {

        int[] oneCount  = new int[n+1];

        for (int i = 3; i <= n; i++) {
           if (i%2==1){
               oneCount[i] = oneCount[i-1]+1;
           }else{
             oneCount[i] = oneCount[i/2];
           }
        }

        return oneCount;

    }
}

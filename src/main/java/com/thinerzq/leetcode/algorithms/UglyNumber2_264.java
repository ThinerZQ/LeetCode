package com.thinerzq.leetcode.algorithms;

/**
 * Created by root on 16-3-5.
 */
public class UglyNumber2_264 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(999));
    }
    public static int nthUglyNumber(int n) {


        if (n<1){
            return 0;
        }
        int p2=0,p3=0,p5=0;
        int[] array = new int[n+1];
        array[0] =1;

        int i=1;
        while (i<n){
            int temp2 = 2*array[p2];
            int temp3 = 3*array[p3];
            int temp5 = 5*array[p5];

            int min=temp2;
            if (temp2>temp3){
                min=temp3;
            }
            if (min>temp5){
                min = temp5;
            }

            array[i++] = min;

            while (array[p2]*2 <= min)
                ++p2;
            while (array[p3]*3 <= min)
                ++p3;
            while (array[p5]*5 <= min)
                ++p5;


        }
        return array[n-1];
    }
}

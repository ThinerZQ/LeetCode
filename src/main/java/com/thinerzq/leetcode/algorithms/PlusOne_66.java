package com.thinerzq.leetcode.algorithms;

/**
 * Created by root on 16-3-4.
 */
public class PlusOne_66 {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {


        int count =0;
        int n=digits.length;
        for (int i = n-1; i >=0 ; --i) {
            if (digits[i] ==9){
                ++count;
            }else{
                break;
            }
        }
        if (count == n){
            int[] temp = new int[n+1];
            temp[0] =1;
            return temp;
        }else{
            ++digits[n-count-1];
            for (int i=n-count;i<n;++i){
                digits[i] =0;
            }
            return digits;
        }
    }
    public int[] plusOne_1(int[] digits) {

        int count =0;
        for (int i = digits.length-1; i >=0 ; --i) {
            if (digits[i] ==9){
                ++count;
            }else{
                break;
            }
        }
        if (count == digits.length){
            int[] temp = new int[digits.length+1];
            temp[0] =1;
            return temp;
        }else{
            digits[digits.length-count-1]++;
            for (int i=digits.length-count;i<digits.length;i++){
                digits[i] =0;
            }
            return digits;
        }
    }

}

package com.thinerzq.leetcode.cn;

import java.util.ArrayList;
import java.util.Collections;

public class 加一 {
    public static void main(String[] args) {

    }
    public static int[] plusOne(int[] digits) {


        ArrayList<Integer> temp = new ArrayList<>();

        int t = 0;
        int last = digits[digits.length-1]+1;
        if (last>=10){
            temp.add(0);
            t = 1;
        }else{
            temp.add(last);
        }
        for (int i = digits.length -2; i >=0; i--) {
            int s = digits[i] + t;
            if (s >=10){
                t=1;
                temp.add(0);
            }else{t=0;
            temp.add(s);
            }
        }
        if (t==1){
            temp.add(1);
        }
        Collections.reverse(temp);

        return temp.stream().mapToInt(s->s.intValue()).toArray();



    }
}

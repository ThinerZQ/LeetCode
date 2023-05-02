package com.thinerzq.leetcode.my100;

import java.util.Arrays;
import java.util.Comparator;

public class 蓄水 {
    public static void main(String[] args) {

//        System.out.println(Math.ceil(0));
//        System.out.println(Math.ceil(1.3));

       System.out.println(storeWater(new int[]{1,3},new int[]{6,8}));

    }
    public static int storeWater(int[] bucket, int[] vat) {

        int[] val = new int[bucket.length];
        for (int i = 0; i < bucket.length; i++) {
            if (bucket[i]!=0){
                double t = vat[i]*1.0/bucket[i];
                val[i] = (int) Math.ceil(t);
            }else{
                val[i] = Integer.MAX_VALUE;
            }

        }

        // 看差距有多少

        //当前需要操作的次数
        int max = Integer.MIN_VALUE;
        int j = 0; // 每一次max 值所在的index
        int addOp = 0; // 增加操作的次数
        int totalOp = 0;
        int[] opStep = new int[bucket.length];
        while (true ){
            boolean allequal = true;
            for (int i = 0; i < val.length; i++) {
                if (max< val[i]){
                    max = val[i];
                    j=i;
                }
                if ( i>0 && val[i] != val[i-1]){
                    allequal= false;
                }
            }
            //max 是当前需要操作的最大步骤
            if (!allequal){
                val[j] = (int) Math.ceil(vat[j]*1.0/(bucket[j]+1));
                addOp++;
//                opStep[j] = max +
            }else{
                totalOp = max+ addOp;
                break;
            }
        }
        return totalOp;





    }
}

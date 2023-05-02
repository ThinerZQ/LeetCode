package com.thinerzq.leetcode.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 两个数组的交集II {

    public static void main(String[] args) {


        int[] a = new int[]{1,2,2,1};
        int[] b = new int[]{2,2};

        System.out.println(intersect(a,b));


    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);



        //双指针
        int indexa = 0;
        int indexb = 0 ;
        List<Integer> list = new ArrayList<>();
        while(indexa<nums1.length || indexb<nums2.length){

            if (nums1[indexa] == nums2[indexb]){
                list.add(nums1[indexa]);
                    indexa++;
                    indexb++;

            }else if (nums1[indexa] > nums2[indexb]){
                indexb++;
            }else{
                indexa++;
            }
        }


       return  list.stream().mapToInt(t->t.intValue()).toArray();



    }
}

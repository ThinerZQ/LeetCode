package com.thinerzq.leetcode.cn;

import java.util.Arrays;

public class 旋转数组 {
    public static void main(String[] args) {


       int[] nums = new int[]{1,2,3,4,5,6,7};
       int[] nums2 = new int[]{1};

        rotateRecurive(nums2,1);
        Arrays.stream(nums2).forEach(t->{
            System.out.println(t);
        });

    }

    public static void rotate(int[] nums, int k){

        if (k%nums.length<1000){
            rotateRecurive(nums,k);
        }else{
            rotate2(nums,k);
        }



    }




    public static void rotateRecurive(int[] nums, int k){

        if (k==0 || k%nums.length==0){
            return;
        }else{


            int index =  k%nums.length;

            int temp = nums[nums.length-1];
            for (int i = nums.length-1; i >=1; i--) {
                nums[i] = nums[i-1];
            }
            nums[0]=temp;
            rotateRecurive(nums,index-1);
        }
    }



    public static void rotate2(int[] nums, int k) {


        if (k==0 || k%nums.length==0){
            return;
        }
       int index =  k%nums.length;

        //先新建一个数组，保存后面的数据
        int b[] = new int[index];
        int indexb=0;
        for (int i = nums.length-index; i < nums.length; i++) {
            b[indexb++] = nums[i];
        }

        //开始移动源数组

        for (int i = nums.length-1; i >=index; i--) {
            nums[i] =nums[i-index];
        }

        //从头来时将新数组补充到 源数据中心

        for (int i = 0; i <index; i++) {
            nums[i] =b[i];
        }
        return;







    }
}

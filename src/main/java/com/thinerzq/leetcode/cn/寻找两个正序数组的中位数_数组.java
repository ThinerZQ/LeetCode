package com.thinerzq.leetcode.cn;

public class 寻找两个正序数组的中位数_数组 {


    public static void main(String[] args) {

        int[] a = new int[]{1,3};
        int[] b = new int[]{2};
        System.out.println(findMedianSortedArrays(a,b));

    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {


        int size = nums1.length + nums2.length;


        if (nums1.length==0 && nums2.length==0){
            return 0;
        }else if (nums1.length==0){
            if (size%2==0){
                //中位数数最中间的两个数的和
                return ((double)(nums2[nums2.length/2 -1]+ nums2[nums2.length/2]))   /2;
            }else{
                //中位数是最中间的一个数
                return nums2[nums2.length/2];
            }
        }else if (nums2.length==0){
            if (size%2==0){
                //中位数数最中间的两个数的和
                return ((double)(nums1[nums1.length/2 -1]+ nums1[nums1.length/2]))   /2;
            }else{
                //中位数是最中间的一个数
                return nums1[nums1.length/2];
            }
        }


        int[] test = new int[size];



        int index1= 0;
        int index2= 0;
        int index= 0;
        while(true){
            if (index==size){
                break;
            }
            //如果数组1没算完
            if (index1<nums1.length ){
                //如果数组2没算完
                if (index2<nums2.length){
                    if (nums1[index1]< nums2[index2]){
                        test[index] = nums1[index1];
                        index1++;
                    }else{
                        test[index] = nums2[index2];
                        index2++;
                    }
                }else{
                    //数组2算完了
                    test[index] = nums1[index1];
                    index1++;
                }
            }else{
                //数组1算完了
                if (index2<nums2.length){
                    //数组2没算完
                    test[index] = nums2[index2];
                    index2++;
                }
            }
            index++;

        }
        if (size%2==0){
            //中位数数最中间的两个数的和
            return ((double)(test[test.length/2 -1]+ test[test.length/2]))   /2;
        }else{
            //中位数是最中间的一个数
            return test[test.length/2];
        }
    }
}

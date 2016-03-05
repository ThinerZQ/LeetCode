package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 22:03
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MergeSortedArray_88 {
    public static void main(String[] args) {

        int[] nums1 =new int[]{1,4,7,9,11,22,33,44,44,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int[] nums2 = new int[]{1,2,3,4,5,6,7,7,21};
        merge(nums1,9,nums2,9);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < n; i++) {
            //binary search
            int left=0;
            int right=m-1;
            int mid =(left+right)/2;
            while (left<right){
                    if (nums2[i] >nums1[mid]){
                        left = mid+1;
                    }else if (nums2[i] <nums1[mid]){
                        right =mid-1;
                    }
                    mid = (left+right)/2;
            }
            for (int j=m;j>mid;j--){
                nums1[j] = nums1[j-1];
            }
            nums1[mid] = nums2[i];
        }
    }
    public static void merge_1(int[] nums1, int m, int[] nums2, int n) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m;) {
                if (nums1[j]>nums2[i]){
                    j++;
                }
            }
        }
    }
}

package com.thinerzq.leetcode.my100;


/**
 * dp[i][j] 表示 A中0-i 与B中0-j 公共的 、长度最长的子数组的长度 ,i代表第i个元素，而不是下标
 * dp[i][j] = dp[i-1][j-1] +1 ， A[I-1]= B[J-1]
 * dp[i][j] = 0 , A[I-1]!= B[J-1]
 */
public class 最长重复子数组 {
    public static void main(String[] args) {

        System.out.println(new 最长重复子数组().findLength(new int[]{1,2,3,2,1},new int[]{3,2,1,4,7}));

    }

    public int findLength(int[] nums1, int[] nums2) {

        int A = nums1.length;
        int B = nums2.length;
        int dp[][] = new int[A+1][B+1];
        for (int i = 1; i <=A; i++) {
            for (int j = 1; j <=B; j++) {
                if (nums1[i-1] == nums2[j-1]){
                    dp[i][j] = dp[i-1][j-1]+1;
                }
            }
        }
        int max=0;
        for (int i = 1; i <= A; i++) {
            for (int j = 1; j <= B; j++) {
                System.out.print(dp[i][j]+",");
                if (dp[i][j]>max){
                    max  = dp[i][j];
                }
            }
            System.out.println();
        }
        return max;
    }
}

package com.thinerzq.leetcode.my100;

public class 跳跃游戏 {
    public static void main(String[] args) {

        System.out.println(new 跳跃游戏().canJump(new int[]{0,2,3}));

        System.out.println();
        System.out.println(new 跳跃游戏().canJump(new int[]{2,3,1,1,4}));

        System.out.println();
        System.out.println(new 跳跃游戏().canJump(new int[]{0}));


        System.out.println();
        System.out.println(new 跳跃游戏().canJump(new int[]{1,0,1,0}));

        System.out.println();
        System.out.println(new 跳跃游戏().canJump(new int[]{3,2,1,0,4}));
    }



    public boolean canJump(int[] nums) {

        if (nums.length==1){
            return true;
        }

        for (int i = nums.length-1; i >=0; i--) {

            if (nums[i]>0){
                continue;
            }
            int j= i-1;
            boolean find = false;
            while (j>=0 && !find){
                if (nums[j] +j  >= i){
                    find=true;
                }
                j--;
            }
            if (!find){
                return false;
            }
        }
        return true;


    }


//    /**
//     *
//     * @param nums  我的尝试
//     * @return
//     */
//    public boolean canJump(int[] nums) {
//
//        if (nums.length==1){
//            return true;
//        }
//
//        boolean[][] dp = new boolean[nums.length][nums.length];  //  是否能够从i 跳到 j
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]>0){
//                dp[i][i] = true;
//            }
//        }
//
//
//        for (int i = 0; i < nums.length; i++) {
//            int m = nums[i];
//            while (m>0){
//                dp[i][(i+m)>=nums.length? nums.length-1:(i+m)] = true;
//                m--;
//            }
//        }
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                System.out.print(dp[i][j]+",");
//            }
//            System.out.println();
//        }
//         // 将二维数据投影到一维数组
//        boolean[] mp = new boolean[nums.length];
//        for (int i = 0; i < nums.length-1; i++) {
//            for (int j = i; j < nums.length; j++) {
//                if (dp[i][j] && nums[j]>0){
//                    mp[j] = true;
//                }else{
//                   break;
//                }
//            }
//        }
//        for (int i = 0; i < mp.length; i++) {
//            System.out.print(mp[i]+"/");
//        }
//        for (int i = 0; i < mp.length; i++) {
//            if (!mp[i]){
//                return false;
//            }
//        }
//
//
//
//        System.out.println();
//
//        return true;
//
//
//    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created by Intellij IDEA
 * Date: 16-5-23
 * Time: 下午11:52
 * User: thinerzq
 * Github: https://www.github.com/ThinerZQ
 * Blog: http://www.thinerzq.me
 * Email: thinerzq@gmail.com
 */
public class ContainerWithMostWater_11 {

    public static void main(String[] args) {

    }
    //最简单的解法，会超时
    public int maxArea(int[] height) {

        int size = height.length;
        int max =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int temp = height[i]<height[j]?height[i]:height[j];

                max = (temp =temp * Math.abs(i-j))>max?temp:max;
            }
        }


        return max;
    }
    public int maxArea_1(int[] height) {

        int size = height.length;
        int max =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int temp = height[i]<height[j]?height[i]:height[j];

                if(temp * Math.abs(i-j)>max){
                    max = temp * Math.abs(i-j);
                }
            }
        }


        return max;
    }
}

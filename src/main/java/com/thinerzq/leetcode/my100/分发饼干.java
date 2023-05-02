package com.thinerzq.leetcode.my100;

import java.util.Arrays;
import java.util.Collections;

public class 分发饼干 {


    public static void main(String[] args) {

        Integer[] children = new Integer[]{1,4,2,3,5,6,1,1,3,5};
        Integer[] cookies  = new Integer[]{2,1,3,5,6,2,1,6};

        System.out.println(findContentChildren(children,cookies));
    }

    /**
     * 能满足的最大孩子数量 , 贪心算法
     * @param children
     * @param cookies
     * @return
     */
    public static int findContentChildren(Integer[] children,Integer[] cookies){

        int yes = 0;
        Arrays.sort(children, Collections.reverseOrder());
        Arrays.sort(cookies);
        //考虑最小的饼干去 从大到小 适配孩子的胃口
        for (int i = 0; i < cookies.length; i++) {
            for (int j = 0; j <children.length; j++) {
                if (cookies[i] >= children[j]){
                    System.out.println("饼干:"+cookies[i] + " 满足 "+ children[j]);
                    children[j] = Integer.MAX_VALUE;
                    yes++;break;
                }
            }
        }

        return yes;


    }
}
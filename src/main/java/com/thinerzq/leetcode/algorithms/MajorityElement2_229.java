package com.thinerzq.leetcode.algorithms;

import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/20
 * Time: 16:21
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MajorityElement2_229 {
    public static void main(String[] args) {

        System.out.println(majorityElement(new int[]{1,2,3,2,3,2,3,2,2,2,3,3,3,3}));
    }
    public static List<Integer> majorityElement(int[] nums) {

        int a=0,b=0,count_a=0,count_b=0;
        //找出出现频率最高的两个数
        for (int current : nums) {
            if (a == current){
                count_a++;
            }else if (b == current){
                count_b++;
            }else if (count_a ==0){
                a = current;
                count_a++;
            }else if (count_b==0){
                b=current;
                count_b++;
            }else{
                count_a--;
                count_b--;
            }
        }
        System.out.println(0);
        return null;

    }
}

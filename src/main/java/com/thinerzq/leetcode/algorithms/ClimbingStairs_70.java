package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 11:14
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ClimbingStairs_70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
    public static int climbStairs(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        return climbStairs(n-1)+ climbStairs(n-2);
    }
    public static int climbStairs_norecursive(int n) {
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else if (n == 2){
            return 2;
        }
        int i=0;
        int sum =0;
        int sum1 =1;
        int sum2 =2;
        while (n>2){
            sum=sum1+sum2;
            sum1=sum2;
            sum2=sum;
            n--;
        }
       return sum;
    }
}

package com.thinerzq.leetcode.algorithms;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 15:48
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class HappyNumber202 {
    public static void main(String[] args) {

        System.out.println(isHappy(3));

    }
    public static boolean isHappy(int n) {

        String s = String.valueOf(n);
        int count=0;
        Stack<Integer> stack = new Stack<Integer>();
        while (!"1".equals(s)){
            String[] stings = s.split("");
            int sum =0;
            for (String t : stings){
                sum += (Integer.valueOf(t) * Integer.valueOf(t));
            }
            if (!stack.empty() && stack.contains(sum) ){
                return false;
            }else{
                stack.push(sum);
            }

            s  = String.valueOf(sum);
        }
        return true;
    }
}

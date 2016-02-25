package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/25
 * Time: 11:40
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class UglyNumber_263 {
    public static void main(String[] args) {
        System.out.println(isUgly(2));

        System.out.println(2%4);

    }
    public  static boolean isUgly(int num) {
        if( num <=0){
            return false;
        }else if (num == 1 || num == 2 || num == 3 || num == 5){
            return true;
        }

        if (num % 2 ==0){
            return isUgly(num/2);
        }else if (num %3 ==0){
            return isUgly(num/3);
        }else  if (num %5 ==0){
            return isUgly(num/5);
        }else{
            return false;
        }
    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 10:18
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ExcelSheetColumnTitle_168 {

    public static void main(String[] args) {
        System.out.println(convertToTitle(703));
    }

    public static String convertToTitle(int n) {

        int count=0,sum=0;
        while (sum<n){
            sum+=Math.pow(26,++count);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<count;++i){
            int k=n%26,m=k;
            if (k==0){
                n =(n/26)-1;
                k=26;
            }else{
                n/=26;
            }
            sb.append(Character.valueOf((char) (k+64)));
        }
        return sb.reverse().toString();

    }
}

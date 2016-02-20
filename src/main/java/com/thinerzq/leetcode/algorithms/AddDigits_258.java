package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/20
 * Time: 13:57
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class AddDigits_258 {
    public static void main(String[] args) {
        AddDigits_258 addDigits_258 = new AddDigits_258();

        int n=235967104;
        int result = addDigits_258.addDigits(n);
        System.out.println("n = "+ n +" ,result = "+result );
    }
    public int addDigits(int num) {

        String strNum = String.valueOf(num);
        String[] tempStr = strNum.split("");
        int sum=0;
        for (int i=0;i<tempStr.length;i++){
            System.out.println(tempStr[i]);
            sum+=Integer.parseInt(tempStr[i]);
        }
        if (sum<10)
            return sum;
        else
            return addDigits(sum);
    }
}

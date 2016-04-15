package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 22:13
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

import java.math.BigInteger;

/**
 * 令h(0)=1,h(1)=1，catalan数满足递推式[1]  ：
 h(n)= h(0)*h(n-1)+h(1)*h(n-2) + ... + h(n-1)h(0) (n>=2)
 例如：h(2)=h(0)*h(1)+h(1)*h(0)=1*1+1*1=2
 h(3)=h(0)*h(2)+h(1)*h(1)+h(2)*h(0)=1*2+1*1+2*1=5
 另类递推式[2]  ：
 h(n)=h(n-1)*(4*n-2)/(n+1);
 递推关系的解为：
 h(n)=C(2n,n)/(n+1) (n=0,1,2,...)
 递推关系的另类解为：
 h(n)=c(2n,n)-c(2n,n-1)(n=0,1,2,...)

 C(m,n) = n! /(m! * (n-m)!)
 */
public class UniqueBinarySearchTrees_96 {
    public static void main(String[] args) {

        System.out.println(numTrees(19));
    }
    public static int numTrees(int n) {

        //卡特兰数
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        if (n==3){
            return 5;
        }
        BigInteger bigInteger = new BigInteger(numTrees(n-1)+"");
        BigInteger bigInteger1 = new BigInteger((4*n-2)+"");
        BigInteger bigInteger2 = new BigInteger((n+1)+"");

        return bigInteger.multiply(bigInteger1).divide(bigInteger2).intValue();
    }
}

package com.thinerzq.leetcode.algorithms;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 13:53
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class GenerateParentheses_22 {
    public static void main(String[] args) {

    }

    public List<String> generateParenthesis(int n) {


        if (n==1){
            List<String> list1 = new ArrayList<String>();
            list1.add("()");
            return list1;
        }else{

            Stack<String> stack = new Stack<String>();
            List<String> list = generateParenthesis(n-1);

            for (String p : list) {

            }


        }

        //TODO:
        return null;


    }

    public static int numTrees(int n) {

        //卡特兰数
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 5;
        }
        BigInteger bigInteger = new BigInteger(numTrees(n - 1) + "");
        BigInteger bigInteger1 = new BigInteger((4 * n - 2) + "");
        BigInteger bigInteger2 = new BigInteger((n + 1) + "");

        return bigInteger.multiply(bigInteger1).divide(bigInteger2).intValue();
    }
}

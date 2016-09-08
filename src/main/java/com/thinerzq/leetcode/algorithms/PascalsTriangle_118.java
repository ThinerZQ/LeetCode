package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 17:04
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class PascalsTriangle_118 {
    public static void main(String[] args) {

        System.out.println(generate(4));
    }

    public static List<List<Integer>> generate(int numRows) {
        //防御式编程
        if (numRows == 0) {
            return new ArrayList<List<Integer>>();
        }
        //最终返回结果
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        //加入第一行元素
        ArrayList<Integer> first = new ArrayList<Integer>();
        first.add(0, 1);
        lists.add(0, first);
        //对接下来的每一行，取出上一行
        for (int i = 1; i < numRows; i++) {
            //templist 是arraylist，可以保持加入的顺序
            List<Integer> tempLists = new ArrayList<Integer>();
            //取出上一行
            List<Integer> preList = lists.get(i - 1);
            //在templist 上插入第0个元素：1，
            tempLists.add(0, 1);
            // int len = (i)/2+1;
            //本行的第j个元素 = 上一行的第j-1个元素 + 上一行的第j个元素 ， 1<=j<i
            for (int j = 1; j < i; j++) {
                tempLists.add(j, preList.get(j - 1) + preList.get(j));
            }
            //在templist 中Haru最后一个元素：1
            tempLists.add(1);
            lists.add(i, tempLists);
        }
        return lists;
    }
}

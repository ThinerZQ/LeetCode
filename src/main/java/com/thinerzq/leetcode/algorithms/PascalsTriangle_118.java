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

        if (numRows ==0){
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        temp.add(0,1);
        lists.add(0,temp);
        for (int i = 1; i<numRows; i++) {
            List<Integer> tempLists = new ArrayList<Integer>();

            List<Integer> preList =  lists.get(i - 1);

            tempLists.add(0,1);
           // int len = (i)/2+1;
            for (int j = 1; j < i;j++) {
                tempLists.add(j,preList.get(j-1)+preList.get(j));
               // tempLists.add(i-j-1,preList.get(j-1)+preList.get(j));
            }
            tempLists.add(1);
            lists.add(i,tempLists);
        }
        return lists;
    }
}

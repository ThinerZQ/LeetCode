package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 20:44
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class PascalsTriangleII_119 {
    public static void main(String[] args) {

    }
    public List<Integer> getRow(int rowIndex) {

        List<Integer> pre = new ArrayList<Integer>();
        pre.add(0,1);

        for (int i = 0; i<=rowIndex; i++) {
            List<Integer> tempLists =new ArrayList<Integer>();
            tempLists.add(0,1);
            for (int j = 1; j <=i;j++) {
                tempLists.add(j,pre.get(j-1)+pre.get(j));
            }
            tempLists.add(1);
            pre = tempLists;
        }
        return pre;
    }
}

package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/16
 * Time: 22:37
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

public class GrayCode_89 {

    public static void main(String[] args) {

    }
    public List<Integer> grayCode(int n) {

        if (n<=0){
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        int size =1<<n;
        for (int i = 0; i < size; i++) {
            list.add(i ^(i>>1));
        }
        return list;
    }
}

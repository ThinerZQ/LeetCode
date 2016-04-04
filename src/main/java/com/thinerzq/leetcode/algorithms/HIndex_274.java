package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 16:13
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class HIndex_274 {
    public static void main(String[] args) {

    }
    public int hIndex(int[] citations) {

        for (int i = 0; i < citations.length-1; i++) {
            for (int j = 0; j < citations.length-i-1; j++) {
                if (citations[j]<citations[j+1]){
                    int temp = citations[j];
                    citations[j] = citations[j+1];
                    citations[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] <i){
                return i;
            }
        }
        return 0;
    }
}

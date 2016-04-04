package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 9:40
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class FirstBadVersion_278 {
    public int firstBadVersion(int n) {

        /*int left =0,right=n-1;
        int middle=0;
        while (left<=right){
            middle = (left+right)/2;
            if (isBadVersion(middle)) {
                if(middle!=0){
                    if(isBadVersion(middle-1)){
                        right = middle+1;
                    }else{
                        return middle;
                    }
                }else{
                    return middle;
                }

            }else{
                left = middle+1;
            }
        }
        return middle;*/
        return 1;
    }

}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/8
 * Time: 19:46
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ProductofArrayExceptSelf_238 {
    public static void main(String[] args) {

        productExceptSelf(new int[]{1, 2, 3, 4});
    }


    public static int[] productExceptSelf(int[] nums) {

        int product = 1;
        int zeroflag = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroflag++;
                continue;
            }
            product *= nums[i];
        }
        if (zeroflag == 0) {
            // no zero
            for (int i = 0; i < nums.length; i++) {
                nums[i] = product / nums[i];
            }

        } else if (zeroflag == 1) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    nums[i] = product;
                } else
                    nums[i] = 0;
            }
        } else {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = 0;
            }

        }

        return nums;

    }
}

package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/23
 * Time: 11:12
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * Related to question Excel Sheet Column Title

 Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class ExcelSheetColumnNumber_171 {
    public static void main(String[] args) {

        ExcelSheetColumnNumber_171 excelSheetColumnNumber_171 = new ExcelSheetColumnNumber_171();

        System.out.println(excelSheetColumnNumber_171.titleToNumber("AAA"));
    }
    public int titleToNumber(String s) {
        int length = s.length();

        int result =0;
        for (int i=0;i<length;i++){
            Character c = s.charAt(i);
            int temp = (int) ((c.charValue()-64)*Math.pow(26,length-i-1));

            result+=temp;
        }
        return result;
    }
}

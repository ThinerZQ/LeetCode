package com.thinerzq.leetcode.my100;

public class 验证回文串 {
    public static void main(String[] args) {


        System.out.println(validPalindrome("eccer"));
    }
    public static boolean validPalindrome(String s) {

       if (s.length() <=2){
           return true;
       }
       if (isPalindrome(s)){
           return true;
       }
        for (int i = 0; i < s.length(); i++) {
            boolean a = isPalindrome(s.substring(0,i) + s.substring(i+1,s.length()));
            if (a){
                return true;
            }
        }
        return false;
    }

    /**
     * 判断一个字符串是否是 回文串
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s){

        int start = 0; int end = s.length()-1;
        char[] sChars = s.toCharArray();

        while (start<end){
            if (sChars[start] == sChars[end]){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;


    }
}

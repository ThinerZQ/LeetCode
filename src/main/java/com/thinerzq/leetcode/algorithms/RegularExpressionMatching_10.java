package com.thinerzq.leetcode.algorithms;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/2
 * Time: 20:10
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class RegularExpressionMatching_10 {
    public static void main(String[] args) {

        String s="aa";
        String p=".*";

        System.out.println(isMatch_1(s, p));

    }
    public static boolean isMatch_1(String s,String p){
        char[] s_chars = s.toCharArray();
        char[] p_chars = p.toCharArray();
        int j=0;
        for (int i=0;i<p_chars.length;i++){
            if (p_chars[i] == '.'){
                j++;
            }else if (p_chars[i] == '*'){
                if (p_chars[i-1] =='.'){
                    if(j<s_chars.length){
                        char temp =s_chars[j];
                        int k=j;
                        while (k<s_chars.length && temp ==s_chars[k]){
                            k++;
                        }
                        j=k;
                    }
                }else{
                    char t = p_chars[i-1];
                    if(j<s_chars.length){
                        char temp =s_chars[j];
                        int k=j;
                        while (k<s_chars.length && temp ==s_chars[k]){
                            k++;
                        }
                        j=k-1;
                    }
                }
            }else{
                if (i+1<p_chars.length && p_chars[i+1] =='*'){
                    if(j<s_chars.length){
                        char temp =s_chars[j];
                        int k=j;
                        while (k<s_chars.length && temp ==s_chars[k]){
                            k++;
                        }
                        j=k;
                    }
                    i++;
                }else{
                    j++;
                }
                System.out.println(1);
            }
        }

        return j==s_chars.length;
    }
    public static boolean isMatch(String s, String p) {
        char[] s_chars = s.toCharArray();
        char[] p_chars = p.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        int temp=0;
        if (!p.contains(".") && !p.contains("*")){
            for ( int i = 0,j=0; i < s_chars.length && j<p_chars.length; i++) {
                stack.push(s_chars[i]);
                if (stack.peek() == p_chars[j]){
                    temp =stack.pop();
                    j++;
                }else{
                    return false;
                }
            }
        }else if (p.contains(".")){
            for ( int i = 0,j=0; i < s_chars.length && j<p_chars.length; i++) {
                stack.push(s_chars[i]);
                if (stack.peek() == p_chars[j]){
                    temp =stack.pop();
                    j++;
                }else if (p_chars[j] =='.'){
                    temp =stack.pop();
                    j++;
                }else{
                    return false;
                }
            }

        }else if (p.contains("*")){
            for ( int i = 0,j=0; i < s_chars.length && j<p_chars.length;) {
                stack.push(s_chars[i]);
                if (stack.peek() == p_chars[j] && p_chars[j+1] =='*'){
                    temp =stack.pop();
                    i++;
                }else if (stack.peek() != p_chars[j] && j+1<p_chars.length && p_chars[j+1] =='*'){
                    j+=2;
                }else if (stack.peek() != p_chars[j]){
                    return false;
                }
            }
        }else{
            for ( int i = 0,j=0; i < s_chars.length && j<p_chars.length;) {
                stack.push(s_chars[i]);
                if (p_chars[j] =='.' &&p_chars[j+1]=='*'){
                    temp =stack.pop();

                }
                if (stack.peek() == p_chars[j] && p_chars[j+1] =='*'){
                    temp =stack.pop();
                    i++;
                }else if (stack.peek() != p_chars[j] && j+1<p_chars.length && p_chars[j+1] =='*'){
                    j+=2;
                }else if (stack.peek() == p_chars[j]){
                    temp =stack.pop();
                    j++;
                    i++;
                }else if (p_chars[j] =='.'){
                    temp =stack.pop();
                    j++;
                    i++;
                }else{
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}

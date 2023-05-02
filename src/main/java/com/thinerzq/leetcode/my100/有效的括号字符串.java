package com.thinerzq.leetcode.my100;

import java.util.Stack;

public class 有效的括号字符串 {
    public static void main(String[] args) {


        System.out.println(checkValidString("(((((*(()((((*((**(((()()*)()()()*((((**)())*)*)))))))(())(()))())((*()()(((()((()*(())*(()**)()(())"));
    }

    /**
     * 双栈判断
     * @param s
     * @return
     */
    public static boolean checkValidString(String s) {
        Stack<Integer> leftStack = new Stack<>();
        Stack<Integer> starStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                leftStack.push(i); // 记录的是 数组下标
            }else if (s.charAt(i) == '*'){
                starStack.push(i); // 记录的是 数组下标
            }else{
                if (!leftStack.isEmpty()){
                    leftStack.pop();
                }else if (!starStack.isEmpty()){
                    starStack.pop();
                }else{
                    return false;
                }
            }
        }
        if(starStack.size() < leftStack.size()){
            // * 少于 (  不够替换 返回false
            return false;
        }
        //关键在下面这一步
        //还可能空的 又括号都抵消完了，左括号还没抵消完的话，需要用*号都抵消了左括号
        while (!leftStack.empty()){
            // * 必须排在 ( 后面才能当做 ）用
            if(leftStack.pop() > starStack.pop()){
                return false;
            }
        }
        return leftStack.isEmpty();








    }

}

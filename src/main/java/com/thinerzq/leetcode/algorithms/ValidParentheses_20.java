package com.thinerzq.leetcode.algorithms;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/18
 * Time: 22:32
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ValidParentheses_20 {
    public static void main(String[] args) {

    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        char[] characters = s.toCharArray();
        for (char c : characters) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (c == ']' && !stack.isEmpty()) {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

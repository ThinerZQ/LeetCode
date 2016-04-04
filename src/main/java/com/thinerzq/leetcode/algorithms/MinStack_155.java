package com.thinerzq.leetcode.algorithms;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/4/3
 * Time: 10:02
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class MinStack_155 {

    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();


    public void push(int x) {

        dataStack.push(x);
        if (minStack.isEmpty() || minStack.peek() > x){
            minStack.push(x);
        }
    }

    public void pop() {

        if (! dataStack.isEmpty()){
            if (minStack.peek().equals(dataStack.peek())){
                minStack.pop();
            }
            dataStack.pop();
        }

    }

    public int top() {

        if (! dataStack.isEmpty()){
            return dataStack.peek();
        }
        return 0;
    }

    public int getMin() {
        if (! minStack.isEmpty()){
            return  minStack.peek();
        }
       return 0;
    }
}

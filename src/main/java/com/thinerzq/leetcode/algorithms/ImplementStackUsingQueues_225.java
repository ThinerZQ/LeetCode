package com.thinerzq.leetcode.algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/3/4
 * Time: 21:38
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */
public class ImplementStackUsingQueues_225 {
    public static void main(String[] args) {

    }
    class MyStack {
        Queue queue = new LinkedList();
        int top=0;
        // Push element x onto stack.
        public void push(int x) {
            queue.add(x);
            top++;
        }

        // Removes the element on top of the stack.
        public void pop() {

        }

        // Get the top element.
        public int top() {

            return 0;
        }

        // Return whether the stack is empty.
        public boolean empty() {
            return false;
        }
    }
}

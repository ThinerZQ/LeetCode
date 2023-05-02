package com.thinerzq.leetcode.my100;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        //回溯方法 ， 深度优先遍历
        List<String> result = new ArrayList<>();
        kuohao(n,n,"",result);
        return result;
    }
    /**
     *
     * @param left 当前还缺几个左括号
     * @param right  当前还缺几个又
     * @param str  是在遍历过程中需要变化的内容, 需要作为递归函数的参数传递
     * @param result 需要用一个容器记录 每一次变化的终点的内容 ，这个值要么是一个静态变量，要么需要作为递归函数的参数传递
     * @return
     */
    public void kuohao(int left,int right ,String str,List<String> result){

        if (left==0 && right ==0){
            result.add(str);
            return;
        }

        if (left>0){
            kuohao(left-1,right,str+"(",result);
        }
        if (right>left){ // 这里是关键 ，怎么理解：缺的右括号比左括号多 就需要补右括号了
            kuohao(left,right-1,str+")",result);
        }

    }
}

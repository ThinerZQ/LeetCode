package com.thinerzq.leetcode.my100;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 去除重复字母 {
    public static void main(String[] args) {

        System.out.println(removeDuplicateLetters("leetcode"));

    }
    public static String removeDuplicateLetters(String s) {


        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (stack.contains(s.charAt(i))){
                continue;
            }
            while (!stack.isEmpty() && stack.peek()>s.charAt(i) && s.indexOf(stack.peek(),i)>=0   ){
                stack.pop();
            }
            stack.push(s.charAt(i));
        }
        char[] test = new char[stack.size()];
        for (int i = 0; i < test.length; i++) {
            test[i] = stack.get(i);
        }
        return new String(test);
    }
    public static String removeDuplicateLettersError(String s) {


        char[] chars = s.toCharArray();

        int minIndex = -1;
        int minChar =Character.MAX_VALUE;
        Map<Character,Integer> map  = new HashMap<>();
        for (int i = minIndex+1; i < chars.length; i++) {
            if (chars[i]!='0' && chars[i]<minChar){
                minChar=s.charAt(i);
                minIndex = i;
            }
            if (map.get(chars[i])==null){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        //最小值的左边重复元素去除
        int leftIndex = minIndex-1;
        while (leftIndex>=0){
            String right = s.substring(minIndex,s.length());
            String leftChar = String.valueOf(chars[leftIndex]);
            if (right.contains(leftChar)){
                // 把左边的这个移除
                chars[leftIndex] = '0';
            }
            leftIndex--;
        }

        map.clear();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])==null){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }

         // 右边元素处理, 寻找第一个独立元素

        int rightIndex = minIndex+1;
        for (int i = rightIndex; i < chars.length; i++) {
            if (map.get(chars[i])==1){
                int nonDupIndex = i;
                //不重复的元素 , 和 minIndex 之前的元素对比大小.
                for (int j = rightIndex; j <nonDupIndex; j++) {
                    if (chars[j] > chars[nonDupIndex]){
                        // 这个元素应该废弃
                        chars[j] = '0';
                    }
                }
                rightIndex = i+1;
            }
        }
        // 再从后往前遍历一遍，遇到重复的元素直接去掉
        map.clear();
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i])==null){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }
        for (int i = chars.length-1; i >=0; i--) {

            int dupCount = map.get(chars[i]);
            if (chars[i] !='0' && dupCount >1){
                map.put(chars[i],dupCount-1);
                chars[i] = '0' ;
            }
        }

        StringBuilder sb = new StringBuilder();


        return sb.append(chars).toString().replace("0","");



    }
}

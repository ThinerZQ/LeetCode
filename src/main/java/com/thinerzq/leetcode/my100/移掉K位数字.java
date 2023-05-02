package com.thinerzq.leetcode.my100;



import java.util.Stack;

public class 移掉K位数字 {

    public static void main(String[] args) {

        System.out.println(removeKdigits("10200",1));
    }
    public  static String removeKdigits(String num, int k) {


        if (num.length() == k){
            return "0";
        }
        int finalSize = num.length()-k;
        Stack<Integer> integerStack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {

            while (k>0&& integerStack.size()>0 && Integer.valueOf(String.valueOf(num.charAt(i))) <integerStack.peek() ){
               integerStack.pop();
               k--;
            }
            integerStack.push(Integer.valueOf(String.valueOf(num.charAt(i))));
        }
        //没有跳过完, 再减去末尾的k个元素
        for (int i = 0; i < k; i++) {
            integerStack.pop();
        }

        StringBuilder sb = new StringBuilder();
        int zeroIndex = 0;

        for (int i = 0; i < integerStack.size(); i++) {
            if (integerStack.get(zeroIndex) ==0){
                zeroIndex++;
                continue;
            }
            sb.append(integerStack.get(i));
        }
        if (sb.toString().length()==0){
            return "0";
        }
        return sb.toString();

    }
    public  static String removeKdigitsSelf(String num, int k) {

        System.out.println(num.length());
        if (num.length() == k){
            return "0";
        }
        int finalSize = num.length()-k;
        Stack<Integer> integerStack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            if (integerStack.size() == finalSize){
                break;
            }
            if (hasSmallNumber(num.substring(i+1,(i+k+1)>num.length()? num.length():(i+k+1)),Integer.valueOf(String.valueOf(num.charAt(i)))) &&
                    i+(finalSize-integerStack.size())<num.length()){
                continue;
            }
            System.out.print(i+",");

            integerStack.push(Integer.valueOf(String.valueOf(num.charAt(i))));
        }

        System.out.println();
        StringBuilder sb = new StringBuilder();
        int zeroIndex = 0;

        for (int i = 0; i < integerStack.size(); i++) {
            if (integerStack.get(zeroIndex) ==0){
                zeroIndex++;
                continue;
            }
            sb.append(integerStack.get(i));
        }
        if (sb.toString().length()==0){
            return "0";
        }
        return sb.toString();

    }

    public static boolean hasSmallNumber(String num,int val){

        for (int i = 0; i < num.length(); i++) {
            if (Integer.valueOf(String.valueOf(num.charAt(i)))< val){
                return true;
            }
        }
        return false;
    }
}

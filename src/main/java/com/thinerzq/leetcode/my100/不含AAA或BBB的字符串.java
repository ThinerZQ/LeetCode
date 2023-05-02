package com.thinerzq.leetcode.my100;

public class 不含AAA或BBB的字符串 {
    public static void main(String[] args) {


        System.out.println(strWithout3a3b(4,1));
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static String strWithout3a3b(int a, int b) {


        // a, aa , b ,bb  4种case
        // a,b谁大 ,先从谁开始
        char[] c = new char[a+b];
        int index = 0;
        while (a>=0 || b>=0){
            if (a==0 && b==0){
                break;
            }
            if (index>=2 && c[index-1] == c[index-2] ){
                //前面一旦有两个相等 就 补充一个异类
                if (c[index-1] == 'a'){
                    c[index++] = 'b';
                    b--;
                }else{
                    c[index++]='a';
                    a--;
                }
            }
            if (a==0 && b==0){
                break;
            }
            //普通情况下 按照 谁大 先按照谁放
            if (a>b){
                c[index++] = 'a';
                a--;
            }else{
                c[index++] = 'b';
                b--;
            }
        }

        return new String(c);

    }
}

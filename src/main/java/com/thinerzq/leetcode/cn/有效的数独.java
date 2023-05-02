package com.thinerzq.leetcode.cn;

import java.util.HashMap;
import java.util.Map;

public class 有效的数独 {
    public static void main(String[] args) {

        test();
    }


    public static  void test(){
        System.out.println(1<<('5'-'0'));
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(  (i / 3) * 3 + j / 3);
                System.out.print(" ");
            }
            System.out.println();

        }
    }
    public boolean isValidSudoku(char[][] board) {


        for (int i = 0; i < board.length; i++) {
            Map<Character,Integer> map = new HashMap<>();
            for (int j = 0; j < board[i].length; j++) {
                if (map.get(board[i][j])==null){
                    map.put(board[i][j],1);
                }else{
                    return false;
                }
            }
            Map<Character,Integer> map2 = new HashMap<>();
            for (int j = 0; j < board[i].length; j++) {
                if (map2.get(board[j][i])==null){
                    map2.put(board[j][i],1);
                }else{
                    return false;
                }
            }
        }
        return true;

    }
}

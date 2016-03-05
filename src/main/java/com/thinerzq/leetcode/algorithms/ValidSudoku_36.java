package com.thinerzq.leetcode.algorithms;

import java.util.ArrayList;

/**
 * Created by root on 16-3-5.
 */
public class ValidSudoku_36 {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {

        //9 row ,9 col
        if (board ==null || board.length !=9 || board[0].length !=9){
            return false;
        }
        int row = board.length/3;
        int col = board[0].length/3;

        ArrayList<Character> rows = new ArrayList<Character>();
        ArrayList<Character> cols = new ArrayList<Character>();
        ArrayList<Character> cells = new ArrayList<Character>();
        for (int i = 0; i < 9; i++) {
            int count=0;
            for (int j = 0; j <col; j++) {
                for (int k = 0; k <row; k++) {
                    if (board[i+j][j*3+k] !='.')
                        rows.add(board[i+j][j*3+k]);
                    if (board[j*3+k][i+j] !='.')
                        cols.add(board[j*3+k][i+j]);
                    if (board[i][count] !='.')
                        cells.add(board[i][count++]);
                }
            }

            for (Character c: rows)
                if (rows.indexOf(c) != rows.lastIndexOf(c))
                    return false;
            for (Character c: cols)
                if (cols.indexOf(c) != cols.lastIndexOf(c))
                    return false;
            for (Character c: cells)
                if (cells.indexOf(c) != cells.lastIndexOf(c))
                    return false;
            rows.clear();
            cols.clear();
            cells.clear();
        }
        return true;

    }
}
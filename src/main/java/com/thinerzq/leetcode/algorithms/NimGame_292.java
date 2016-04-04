package com.thinerzq.leetcode.algorithms;

/**
 * Created with IntelliJ IDEA
 * Date: 2016/2/20
 * Time: 13:04
 * User: ThinerZQ
 * GitHub: <a>https://github.com/ThinerZQ</a>
 * Blog: <a>http://www.thinerzq.me</a>
 * Email: 601097836@qq.com
 */

/**
 * You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones.
 * <p>
 * Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap.
 * <p>
 * For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
 */
public class NimGame_292 {

    public static void main(String[] args) {
        NimGame_292 nimGame_292 = new NimGame_292();

        int n = 43787328;
        boolean result = nimGame_292.canWinNim(n);
        System.out.println("can win Nim with n = " + n + " result = " + result);
    }


    public boolean canWinNim(int n) {
        if (n % 4 == 0)
            return false;
        else
            return true;
    }

    public boolean canWinNim1(int n) {
        if (n <= 3)
            return true;
        if (n == 4)
            return false;

        return canWinNim1(n - 4);
    }

}

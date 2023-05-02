package com.thinerzq.leetcode.my100;

/**
 * 安排工作能够达到最大收益
 */
public class 安排工作以达到最大收益 {
    public static void main(String[] args) {

    }

    /**
     *
     * @param difficulty  difficulty[i] 表示第 i 个工作的难度，
     * @param profit  profit[i] 表示第 i 个工作的收益。
     * @param worker worker[i] 是第 i 个工人的能力，即该工人只能完成难度小于等于 worker[i] 的工作。
     * @return
     */
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {


        // 每一个工人的能力，去匹配小于这个能力的困难事情，从收益中取最大的收益
        int finalMax = 0;
        for (int i = 0; i < worker.length; i++) {
            int[] difficultyIndex = new int[difficulty.length];
            int k =0;
            for (int j = 0; j < difficulty.length; j++) {
                if (difficulty[j]<=worker[i]){
                    difficultyIndex[k] = j;
                    k++;
                }
            }
            //difficultyIndex 中取最大的收益
            int max = -1;
            for (int j = 0; j <k; j++) {
                if (profit[difficultyIndex[j]] >= max){
                    max = profit[difficultyIndex[j]];
                }
            }
            if (max!=-1){
                finalMax+=max;
            }
        }
        return finalMax;



    }
}

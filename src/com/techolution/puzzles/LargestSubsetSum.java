package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 16/3/18.
 */
public class LargestSubsetSum {

    static long[] maxSubsetSum(int[] k) {
        int length = k.length;
        long[] maxSum = new long[length];
        long sum = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j <= k[i] / 2; j++) {
                if (k[i] % j == 0) {
                    sum = sum + j;
                }
            }
            maxSum[i] = sum + k[i];
            sum = 0;
        }
        return maxSum;
    }
}



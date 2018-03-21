package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 16/3/18.
 */
public class LargestSubsetSum {

    static long[] maxSubsetSum(int[] k) {
        long[] result = new long[k.length];
        int j = 0;
        while (j < k.length) {
            long count = 1;
            for (int i = 2; i <= k[j]/2; i++) {
                if (k[j] % i == 0) {
                    count += i;
                }
            }
            result[j] = count + k[j];
            j++;

        }
        return result;
    }
}



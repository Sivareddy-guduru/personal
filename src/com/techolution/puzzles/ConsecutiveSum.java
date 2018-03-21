package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class ConsecutiveSum {

    static int consecutive(long n) {
        int start = 1, end = 1, sum = 1, count = 0;
        long numValue = n / 2;
        while (start <= numValue) {
            if (sum < n) {
                end += 1;
                sum += end;
            } else if (sum > n) {
                sum -= start;
                start += 1;
            } else if (sum == n) {
                sum -= start;
                start += 1;
                ++count;
            }
        }
        return count;
    }

}

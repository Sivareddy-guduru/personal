package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class InTheFuture {

    static int minNum(int A, int K, int P) {
        if (A >= K) {
            return -1;
        }
        int days = (P / (K - A)) + 1;
        return days;
    }

}

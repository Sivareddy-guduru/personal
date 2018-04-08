package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class InTheFuture {

    static int minNum(int A, int K, int P) {

        int count = 1;
        if (A >= K) {
            return -1;
        }
        while (K <= A + P) {
            A += A;
            K += K;
            count++;
        }
        return count;
    }

}

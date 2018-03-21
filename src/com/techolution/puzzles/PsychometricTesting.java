package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 16/3/18.
 */
public class PsychometricTesting {

    static int[] jobOffers(int[] scores, int[] lowerLimits, int[] upperLimits) {
        int[] result = new int[lowerLimits.length];
        for (int i = 0; i < lowerLimits.length; i++) {
            int lowerLimit = lowerLimits[i];
            int higherLimit = upperLimits[i];
            int count = 0;
            for (int j = 0; j < scores.length; j++) {
                if (lowerLimit <= scores[j] && scores[j] <= higherLimit) {
                    count++;
                }
            }
            result[i] = count;

        }
        return result;
    }
}

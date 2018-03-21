package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 16/3/18.
 */
public class FindTheWinner {

    static String winner(int[] andrea, int[] maria, String s) {
        int andreaCount = 0;
        int mariaCount = 0;

        if (s.equalsIgnoreCase("Even")) {
            int i = 0;
            while (i < andrea.length) {
                andreaCount += andrea[i] - maria[i];
                mariaCount += maria[i] - andrea[i];
                i += 2;
            }

        } else {
            int i = 1;
            while (i < andrea.length) {
                andreaCount += andrea[i] - maria[i];
                mariaCount += maria[i] - andrea[i];
                i += 2;
            }
        }

        return andreaCount >= mariaCount ? andreaCount == mariaCount? "Tie" : "Andrea": "Maria";
    }
}

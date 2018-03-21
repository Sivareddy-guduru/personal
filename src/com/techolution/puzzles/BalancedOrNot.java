package com.techolution.puzzles;

import java.util.Stack;

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class BalancedOrNot {

     static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {

        int[] result = new int[expressions.length];

        for (int j = 0; j < expressions.length; j++) {
            Stack stack = new Stack();
            int count = 0;
            String currentString = expressions[j];
            for (int i = 0; i < currentString.length(); i++) {
                if (currentString.charAt(i) == '<') {
                    stack.add(currentString.charAt(i));
                } else {
                    if (!stack.isEmpty()) {
                        char b = (char) stack.pop();
                        if (b != '<') {
                            count++;
                        }
                    } else {
                        count++;
                    }

                }
            }
            result[j] = (maxReplacements[j] >= count && stack.isEmpty()) ? 1 : 0;
        }
        return result;
    }

}

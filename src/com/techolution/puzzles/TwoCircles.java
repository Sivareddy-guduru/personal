package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 16/3/18.
 */
public class TwoCircles {
     private static final String TOUCHING = "Touching";
    private static final String DISJOINT_INSIDE = "Disjoint-Inside";
    private static final String DISJOINT_OUTSIDE = "Disjoint-Outside";
    private static final String CONCENTRIC = "Concentric";
    private static final String INTERSECTING = "Intersecting";


    static String[] circles(String[] info) {

        String[] result = new String[info.length];
        for (int i = 0; i < info.length; i++) {
            String[] lines = info[i].split(" ");

            int x1 = Integer.valueOf(lines[0]);
            int y1 = Integer.valueOf(lines[1]);
            int x2 = Integer.valueOf(lines[3]);
            int y2 = Integer.valueOf(lines[4]);
            int r1 = Integer.valueOf(lines[2]);
            int r2 = Integer.valueOf(lines[5]);

            if (x1 == 0) {

                if (y1 == y2) {
                    result[i] = CONCENTRIC;
                } else if (Math.abs(y1 - y2) > (r1 + r2)) {
                    result[i] = DISJOINT_OUTSIDE;
                } else if ((Math.abs(y1 - y2) + r1 < r2) || (Math.abs(y1 - y2) + r2 < r1)) {
                    result[i] = DISJOINT_INSIDE;
                } else if (Math.abs(y1 - y2) > Math.abs(r1 - r2)) {
                    result[i] = INTERSECTING;
                } else if (Math.abs(y1 - y2) == Math.abs(r1 - r2)) {
                    result[i] = TOUCHING;
                }

            } else {
                if (x1 == x2) {
                    result[i] = CONCENTRIC;
                } else if (Math.abs(x1 - x2) > (r1 + r2)) {
                    result[i] = DISJOINT_OUTSIDE;
                } else if ((Math.abs(x1 - x2) + r1 < r2) || (Math.abs(x1 - x2) + r2 < r1)) {
                    result[i] = DISJOINT_INSIDE;
                } else if (Math.abs(x1 - x2) > Math.abs(r1 - r2)) {
                    result[i] = INTERSECTING;
                } else if (Math.abs(x1 - x2) == Math.abs(r1 - r2)) {
                    result[i] = TOUCHING;
                }

            }

        }
        return result;
    }
}

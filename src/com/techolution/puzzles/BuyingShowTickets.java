package com.techolution.puzzles;

/**
 * Created by sivareddy.guduru on 14/3/18.
 */
public class BuyingShowTickets {

    static long waitingTime(int[] Tickets, int p) {
        int numOfTickets = Tickets[p];
        long time = Tickets[p];

        for (int i = 0; i < Tickets.length; i++) {
            if (i < p) {
                time += Tickets[i] < Tickets[p] ? Tickets[i] : Tickets[p];
            } else if (i > p) {
                if (Tickets[p] > 1) {
                    time += Tickets[i] < Tickets[p] - 1 ? Tickets[i] : Tickets[p] - 1;
                }
            }

        }

        return time;
    }

}

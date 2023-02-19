package org.example;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        Random rand = new Random();
        while (theatreSeats.bookSeats(rand.nextInt(3) + 1)) {
            System.out.print(".");
        }

        System.out.print("\n");

        System.out.println(theatreSeats.getSoldSeats());
    }
}
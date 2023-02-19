package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheatreSeatsTest {
    @Test
    void getAvailableSeats() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertEquals(15, theatreSeats.getAvailableSeats());
    }

    @Test
    void getSoldSeatsEmpty() {
        TheatreSeats theatreSeats = new TheatreSeats(3,5);

        assertEquals("", theatreSeats.getSoldSeats());
    }

    @Test
    void book1Seat() {
        TheatreSeats theatreSeats = new TheatreSeats(3,5);

        assertEquals(true, theatreSeats.bookSeats(1));
    }
}

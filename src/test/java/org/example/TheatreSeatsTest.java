package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TheatreSeatsTest {
    @Test
    void getAvailableSeats() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertEquals(15, theatreSeats.getAvailableSeats());
    }

    @Test
    void getSoldSeatsEmpty() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertEquals("", theatreSeats.getSoldSeats());
    }

    @Test
    void book1Seat() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertTrue(theatreSeats.bookSeats(1));
    }

    @Test
    void book20Seats() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertFalse(theatreSeats.bookSeats(20));
    }

    @Test
    void book15Seats() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertTrue(theatreSeats.bookSeats(15));
    }

    @Test
    void book1SeatCheckSeatBooked() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertTrue(theatreSeats.bookSeats(1));
        assertEquals("1 A1", theatreSeats.getSoldSeats());
    }

    @Test
    void book15SeatCheckSeatBooked() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertTrue(theatreSeats.bookSeats(15));
        assertEquals("1 A1 A2 A3 A4 A5 B1 B2 B3 B4 B5 C1 C2 C3 C4 C5", theatreSeats.getSoldSeats());
    }

    @Test
    void book1SeatTwiceCheckResult() {
        TheatreSeats theatreSeats = new TheatreSeats(3, 5);

        assertTrue(theatreSeats.bookSeats(1));
        assertTrue(theatreSeats.bookSeats(1));
        assertEquals("1 A1 2 A2", theatreSeats.getSoldSeats());
    }
}

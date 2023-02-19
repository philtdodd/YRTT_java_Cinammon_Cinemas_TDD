package org.example;

public class TheatreSeats {
    private Integer availableSeats;
    private Integer[][] seats;

    public TheatreSeats(Integer rows, Integer seatsPerRow) {
        this.availableSeats = 0;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }
}

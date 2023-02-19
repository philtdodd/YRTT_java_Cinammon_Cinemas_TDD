package org.example;

public class TheatreSeats {
    private Integer availableSeats;
    private Integer[][] seats;

    public TheatreSeats(Integer rows, Integer seatsPerRow) {
        this.availableSeats = rows * seatsPerRow;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }
}

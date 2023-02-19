package org.example;

public class TheatreSeats {
    private Integer availableSeats;
    private Integer[][] seats;

    public TheatreSeats(Integer rows, Integer seatsPerRow) {
        this.availableSeats = rows * seatsPerRow;
        this.seats = new Integer[rows][seatsPerRow];
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public String getSoldSeats() {
        String resultString = "";

        for (int row = 0; row < seats.length; row++) {
            for (int seat = 0; seat < seats[0].length; seat++) {
                resultString += seats[row][seat].toString() + " ";
            }
        }

        return resultString;
    }
}

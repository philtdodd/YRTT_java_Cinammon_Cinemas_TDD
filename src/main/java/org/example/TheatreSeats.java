package org.example;

public class TheatreSeats {
    private Integer availableSeats;
    private Integer customers;
    private Integer[][] seats;

    public TheatreSeats(Integer rows, Integer seatsPerRow) {
        this.availableSeats = rows * seatsPerRow;
        this.customers = 0;
        this.seats = new Integer[rows][seatsPerRow];
        for (int row = 0; row < seats.length; row++)
            for (int seat = 0; seat < seats[0].length; seat++)
                seats[row][seat] = -1;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public String getSoldSeats() {
        String resultString = "";

        for (int row = 0; row < seats.length; row++)
            for (int seat = 0; seat < seats[0].length; seat++)
                if (seats[row][seat] != -1)
                    resultString += seats[row][seat] + " ";

        return resultString;
    }

    public boolean bookSeats(Integer seats) {
        if (availableSeats - seats >= 0) {
            customers++;
            while (seats > 0) {

            }

            return true;
        }

        return false;
    }
}

package org.example;

public class TheatreSeats {
    private Integer availableSeats;
    private Integer customers;
    private Integer[][] seats;
    private Integer currentRow;
    private Integer currentSeat;
    private Integer maxRows;
    private Integer maxSeats;

    private final static String[] rowsLetters = {"A", "B", "C", "D", "E", "F"};

    public TheatreSeats(Integer rows, Integer seatsPerRow) {
        this.availableSeats = rows * seatsPerRow;
        this.customers = 0;
        this.maxSeats = rows;
        this.maxSeats = seatsPerRow;
        this.currentRow = 0;
        this.currentSeat = 0;
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
        Integer currentCustomer = -1;

        for (int row = 0; row < seats.length; row++)
            for (int seat = 0; seat < seats[0].length; seat++)
                if (seats[row][seat] != -1) {
                    if (!currentCustomer.equals(seats[row][seat])) {
                        resultString += seats[row][seat] + " ";
                        currentCustomer = seats[row][seat];
                    }

                    resultString += rowsLetters[row] + (seat + 1) + " ";
                }

        return resultString.trim();
    }

    public boolean bookSeats(Integer seats) {
        if (availableSeats - seats >= 0) {
            customers++;
            while (seats > 0) {
                seats--;
                this.seats[currentRow][currentSeat++] = customers;
                if (currentSeat.equals(maxSeats)) {
                    currentSeat = 0;
                    currentRow++;
                }
            }

            return true;
        }

        return false;
    }
}

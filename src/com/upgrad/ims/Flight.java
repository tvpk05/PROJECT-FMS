package com.upgrad.ims;

public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    static int bookingCounter = 0;

    //Constructor
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {

        ++bookingCounter;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    //Getters and Setters


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public static int getBookingCounter() {
        return bookingCounter;
    }

    public static void setBookingCounter(int bookingCounter) {
        Flight.bookingCounter = bookingCounter;
    }

    ////

    String getFlightDetails(){
        return "Flight Number: " + this.flightNumber + "Airline: " + this.airline+ "Capacity: "+ this.capacity+
                "Booked Seats: "+ this.bookedSeats;
    }

    boolean checkAvailability(){
        if ( this.capacity > this.bookedSeats ){
            return true;
        }else{
            return false;
        }
    }

    static int incrementBookingCounter(){
        return bookingCounter;
    }




}

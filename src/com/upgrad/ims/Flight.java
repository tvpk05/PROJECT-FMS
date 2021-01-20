package com.upgrad.ims;

public class Flight {

    String flightNumber;
    String airline;
    int capacity;
    int bookedSeats;

    static int bookingCounter = 0;

    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {

        ++bookingCounter;
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

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

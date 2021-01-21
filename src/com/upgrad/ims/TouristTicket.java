package com.upgrad.ims;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TouristTicket {

    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private int seatNo;
    private float price;
    private boolean cancelled;
    private String hotelAddress;
    String[] selectedTouristLocation;


    Passenger passenger;
    Flight flight;

    //Constructor
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         int seatNo, float price, boolean cancelled, String hotelAddress,
                         String[] selectedTouristLocation,Flight flight,Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;

        this.flight = flight;
        this.passenger = passenger;

    }

    //Getters and Setters

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }


    ////

    void removeTouristLocations(String location){
        for (int i=0; i < this.selectedTouristLocation.length ; i++){
            if (this.selectedTouristLocation[i] == location){
                this.selectedTouristLocation[i] = null;
                String[] new3 = this.selectedTouristLocation;
                this.selectedTouristLocation = new3;
                break;
            }

        }

    }



    void addTouristLocations(String location){
        for(int i=0; i< this.selectedTouristLocation.length ; i++){
            if(this.selectedTouristLocation[i] == null){
                this.selectedTouristLocation[i] = location;
                String[] new2 = this.selectedTouristLocation;
                this.selectedTouristLocation = new2;
                break;
            }
        }
    }

    String checkStatus(){
        if(cancelled){
            return "Cancelled";
        }else{
            return "Confirmed";
        }
    }

    String  getFlightDuration(){

        String dateArrival  =  this.departureDateTime;
        String dateDeparture = this.arrivalDateTime;
        SimpleDateFormat format = new SimpleDateFormat("yy/MM/dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;
        try {
            d1 = format.parse(dateDeparture);
            d2 = format.parse(dateArrival);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        long diff = d2.getTime() - d1.getTime();
        long diffSeconds = diff / 1000 % 60;
        long diffMinutes = diff / (60 * 1000) % 60;
        long diffHours = diff / (60 * 60 * 1000);

        //Time durationDiff = new Time(diff);
        //durationDiff.toString();
        return  diffHours+" "+diffMinutes+" "+diffSeconds;
    }

    void cancel(){
        cancelled = true;
    }

}

package com.upgrad.ims;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public abstract class Ticket {

    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo,
                  float price, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;

        this.flight = flight;
        this.passenger = passenger;
    }

    public String getPnr(){
        return this.pnr;
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

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
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


    String  getFlightDuration(){

        String dateArrival  =  this.arrivalDateTime;
        String dateDeparture = this.departureDateTime;
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

        System.out.println(diffHours+ " "+diffMinutes+" "+diffSeconds);
        //Time durationDiff = new Time(diff2);

        return diffHours+"Hours, "+diffMinutes+"Minutes, "+diffSeconds+"Seconds";
    }

    String checkStatus(){
        if(cancelled){
            return "Cancelled";
        }else{
            return "Confirmed";
        }
    }

    void cancel(){
        cancelled = true;
    }

}

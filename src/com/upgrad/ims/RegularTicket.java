package com.upgrad.ims;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularTicket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    Passenger passenger;
    Flight flight;

    private String specialServices;

    //Constructor
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled, Passenger passenger,
                         Flight flight, String specialServices) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.passenger = passenger;
        this.flight = flight;
        this.specialServices = specialServices;
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

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    ////

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


    String getSpecialServices(){
        return this.specialServices;
    }

    void updateSpecialServices(String specialServices){
        this.specialServices =this.specialServices + ", "+ specialServices;

    }

}

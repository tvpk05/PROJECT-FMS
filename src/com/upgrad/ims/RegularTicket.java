package com.upgrad.ims;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularTicket {

    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    String seatNo;
    float price;
    boolean cancelled;

    Passenger passenger;
    Flight flight;

    String specialServices;

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

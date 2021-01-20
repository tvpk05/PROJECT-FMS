package com.upgrad.ims;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TouristTicket {

    String pnr;
    String from;
    String to;
    String departureDateTime;
    String arrivalDateTime;
    int seatNo;
    float price;
    boolean cancelled;
    String hotelAddress;
    String[] selectedTouristLocation;


    Passenger passenger;
    Flight flight;

    //Constructor
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime,
                         int seatNo, float price, boolean cancelled, String hotelAddress,
                         String[] selectedTouristLocation) {
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

    }

    String getHotelAddress(){
        return hotelAddress;
    }
    String[] getTouristLocations(){
        return selectedTouristLocation;
    }

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

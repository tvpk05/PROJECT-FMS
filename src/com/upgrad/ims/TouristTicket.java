package com.upgrad.ims;

public class TouristTicket extends Ticket{

    private String hotelAddress;
    String[] selectedTouristLocation;

    //Constructor
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo,
                         float price, boolean cancelled, Flight flight, Passenger passenger,String hotelAddress, String[] selectedTouristLocation) {

        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo,price,cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;

    }

    public String getHotelAddress() {
        return this.hotelAddress;
    }

    public void setHotelAddress(String address){
        this.hotelAddress = address;
    }

    public String[] getSelectedTouristLocation(){
        return this.selectedTouristLocation;
    }

    void removeTouristLocations(String location){
        for (int i=0; i < 5 ; i++){
            if (this.selectedTouristLocation[i] == location){
                this.selectedTouristLocation[i] = null;

            }

        }

    }

    void addTouristLocations(String location){
        for(int i=0; i< 5 ; i++){
            if(this.selectedTouristLocation[i] == null){
                this.selectedTouristLocation[i] = location;
            }
        }
    }


}

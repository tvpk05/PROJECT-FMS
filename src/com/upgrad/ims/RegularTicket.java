package com.upgrad.ims;

public class RegularTicket extends Ticket{

    private String specialServices;

    //Constructor
    public RegularTicket(String specialServices,String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo,
                         float price, boolean cancelled, Flight flight, Passenger passenger) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo,price,cancelled, flight, passenger);

        this.specialServices = specialServices;

    }

    //Getters and Setters

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }

    String getSpecialServices(){
        return this.specialServices;
    }

    void updateSpecialServices(String specialServices){
        this.specialServices =this.specialServices + ", "+ specialServices;
    }

}

package com.upgrad.ims;

import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

public class Main {

    public static void main(String[] args) {


        //Flight Object
        Flight flight1 = new Flight("55871","Boeing",525,501);
        System.out.println(flight1.getFlightNumber());
        System.out.println(flight1.getAirline());
        System.out.println(flight1.getBookedSeats());
        System.out.println(flight1.checkAvailability());

        //Passenger Object
        Passenger passenger1 = new Passenger(125,"Hyderabad","Telangana","AS Rao Nagar",
                "Pavan","9520001478","pavan@gmail.com");
        System.out.println(passenger1.getIdCounter());
        System.out.println(passenger1.getAddress());

        Passenger passenger2 = new Passenger(321,"Khammam","Telanagana","Lenin Nagar",
                "Rao","9555142557","ram5@gmail.com");
        System.out.println(passenger2.getIdCounter());

        //Regular Ticket Object
        RegularTicket regularTicket1 = new RegularTicket("800014579","Hyderabad","Bengalur",
                "15th Mar 5PM","19th Mar 12 Pm","53",
                500.0f,false,passenger1,flight1,"Food");
        System.out.println(regularTicket1.getFrom());
        System.out.println(regularTicket1.getSpecialServices());

        //Tourist Ticket Object
        String[] selectedTouristLocation = {"Dubai","Finland","Malawi"};
        TouristTicket touristTicket = new TouristTicket("234", "hyd","bengaloor","03/12/2021 13:28:03",
                "03/13/2021 08:55:55", 20, 500.0f, true,"AsRao Nagar",
                selectedTouristLocation,flight1,passenger1);


        System.out.println(touristTicket.checkStatus());
        System.out.println(touristTicket.getFrom());
        System.out.println(touristTicket.getHotelAddress());


    }
}

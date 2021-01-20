package com.upgrad.ims;

public class Main {

    public static void main(String[] args) {

        //Address Object
        Address address1 = new Address("AS Rao Nagar","Hyderabad","Telangana");
        System.out.println(address1.addressState);
        System.out.println(address1.addressStreet);
        address1.updateAddressDetails("AK Nagar","Karnataka","Million Road");
        System.out.println(address1.getAddressDetails());

        //Contact Object
        Contact contact1 = new Contact("Pavan","9520001478","pavan@gmail.com");
        System.out.println(contact1.email);
        System.out.println(contact1.name);
        System.out.println(contact1.getContactDetails());
        contact1.updateContactDetails("kausik,900020222,pa5@gmail.com");
        System.out.println(contact1.email);



        //Flight Object
        Flight flight1 = new Flight("55871","Boeing",525,501);
        System.out.println(flight1.flightNumber);
        System.out.println(flight1.airline);
        System.out.println(flight1.bookedSeats);
        System.out.println(flight1.checkAvailability());

        //Passenger Object
        Passenger passenger1 = new Passenger(203,address1,contact1);
        System.out.println(passenger1.id);


        //Regular Ticket Object
        RegularTicket regularTicket1 = new RegularTicket("800014579","Hyderabad","Bengalur",
                "15th Mar 5PM","19th Mar 12 Pm","53",
                500.0f,false,passenger1,flight1,"food");
        System.out.println(regularTicket1.from);
        System.out.println(regularTicket1.specialServices);

        //Tourist Ticket Obkect
        String[] selectedTouristLocation = {"Dubai","Finland","Malawi"};
        TouristTicket touristTicket = new TouristTicket("234", "hyd","bengaloor","03/12/2021 13:28:03",
          "03/13/2021 08:55:55", 20, 500.0f, true,"AsRao Nagar", selectedTouristLocation);


        System.out.println(touristTicket.checkStatus());
        System.out.println(touristTicket.from);
        System.out.println(touristTicket.getHotelAddress());



        

    }
}

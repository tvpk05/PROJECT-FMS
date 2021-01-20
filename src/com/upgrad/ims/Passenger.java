package com.upgrad.ims;

public class Passenger {

    int id;
    Address address;
    Contact contact;

    public Passenger(int id, Address address, Contact contact) {
        this.id = id;
        this.address = address;
        this.contact = contact;
    }

    Contact getContact(){
        return this.contact;
    }

    Address getAddress(){
        return this.address;
    }
}

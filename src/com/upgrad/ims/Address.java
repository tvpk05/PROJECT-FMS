package com.upgrad.ims;

public class Address {

    String addressStreet;
    String addressCity;
    String addressState;

    public Address(String addressStreet, String addressCity, String addressState) {
        this.addressStreet = addressStreet;
        this.addressCity = addressCity;
        this.addressState = addressState;
    }


    String getAddressDetails(){
        return "Address Street: "+ this.addressStreet + "Address City: "+ addressCity+ "Address State: "+ this.addressState;
    }

    void updateAddressDetails(String addressCity, String addressState, String addressStreet){
        this.addressStreet = addressStreet;
        this.addressState = addressState;
        this.addressCity = addressCity;
    }
}

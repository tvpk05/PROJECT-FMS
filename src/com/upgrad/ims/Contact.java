package com.upgrad.ims;

public class Contact {

    String name;
    String phone;
    String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    String getContactDetails(){
        return "Contact Name: " + this.name+ "Contact Phone: "+ this.phone+ "Contact Email: "+ this.email;
    }

    void updateContactDetails(String contactDetails){
        String[] newarr = contactDetails.split(",",3);
        this.name = newarr[0];
        this.phone = newarr[1];
        this.email = newarr[2];
    }



}

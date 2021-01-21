package com.upgrad.ims;

public class Passenger {

    private int id;
    Address address;
    Contact contact;

    private static int idCounter =0;

    //Nested Address Class
    private static class Address {

        private String addressStreet;
        private String addressCity;
        private String addressState;

        //Constructor
        public Address(String addressStreet, String addressCity, String addressState) {
            this.addressStreet = addressStreet;
            this.addressCity = addressCity;
            this.addressState = addressState;
        }

        //getters and Setters


        public String getAddressStreet() {
            return addressStreet;
        }

        public void setAddressStreet(String addressStreet) {
            this.addressStreet = addressStreet;
        }

        public String getAddressCity() {
            return addressCity;
        }

        public void setAddressCity(String addressCity) {
            this.addressCity = addressCity;
        }

        public String getAddressState() {
            return addressState;
        }

        public void setAddressState(String addressState) {
            this.addressState = addressState;
        }

        ///

        String getAddressDetails() {
            return "Address Street: " + this.addressStreet + "Address City: " + addressCity + "Address State: " + this.addressState;
        }

        void updateAddressDetails(String address) {
            String[] newarr = address.split(",",3);
            this.addressStreet = newarr[0];
            this.addressCity = newarr[1];
            this.addressState = newarr[2];
        }
    }

        //Nested Contact Class
    private static class Contact {

        private String name;
        private String phone;
        private String email;

        //Constructor
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        //Getters and Setters


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        ///

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

    //Constructor
    public Passenger(int id,String addressCity, String addressState, String addressStreet,String name,
                     String phone, String email) {
        idCounter = idCounter + 1;
        this.id = id;
        Address address = new Address(addressCity,addressState,addressStreet);
        this.address = address;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;

    }

    //Getters and Setters

    public int getIdCounter(){
        return idCounter;
    }

    public int getPassengerCount(){
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    String getContact(){
        return contact.getContactDetails();
    }

    String getAddress(){
        return address.getAddressDetails();
    }


}

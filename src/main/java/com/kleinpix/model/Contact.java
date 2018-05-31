package com.kleinpix.model;

public class Contact {
    //declare instance variable
    private int id;
    private String cellphone;
    private String address;
    private String postalcode;

    //create private constructor
    private Contact(){

    }
    //getters
    public int getId(){
        return id;
    }
    public String getCellphone() {
        return cellphone;
    }
    public String getAddress() {
        return address;
    }
    public String getPostalcode() {
        return postalcode;
    }

    //create Builder Pattern constructor to pass parameters
    public Contact(Builder builder){
        this.id = builder.id;
        this.cellphone = builder.cellphone;
        this.address = builder.address;
        this.postalcode = builder.postalcode;
    }
    //create Builder Patter class
    public static class Builder{

        private int id;
        private String cellphone;
        private String address;
        private String postalcode;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder cellphone(String value){
            this.cellphone = value;
            return this;
        }
        public Builder address(String value){
            this.address = value;
            return this;
        }
        public Builder postalcode(String value){
            this.postalcode = value;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }
}

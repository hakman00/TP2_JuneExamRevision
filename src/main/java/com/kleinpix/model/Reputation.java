package com.kleinpix.model;

import java.util.Date;

public class Reputation {
    //declare variables
    private int id;
    private Date date;
    private int value;

    //dont allow instantiation of this class
    //default PRIVATE constructor
    private Reputation() {
    }
    //METHODS
    //ONLY create GETTERS - Accessors
    //Setters will be done using the Builder Pattern, hence no setters in ALL classes
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public int getValue() {
        return value;
    }
    //now create Builder Pattern
    public static class Builder{
        private int id;
        private Date date;
        private int value;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder date(Date value){
            this.date = value;
            return this;
        }
        public Builder value(int value){
            this.value = value;
            return this;
        }
        public Reputation build(){
            return new Reputation(this);
        }
    }

    public Reputation(Builder builder) {
        this.date = builder.date;
        this.value = builder.value;
    }
}

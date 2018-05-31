package com.kleinpix.model;

public class AbuseReport {
    //decalare instance variables
    private int id;
    private String description;

    //create private constructor
    private AbuseReport(){

    }
    //create getters
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    //now create builder Pattern
    //create constructor to pass the Builder Pattern parameters
    public AbuseReport(Builder builder) {
        this.id = builder.id;
        this.description = builder.description;
    }
    //create Builder Pattern class
    public static class Builder{

        private int id;
        private String description;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }
        public AbuseReport build(){
            return new AbuseReport(this);
        }
    }
}

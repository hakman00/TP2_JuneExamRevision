package com.kleinpix.model;

public class VoteUp {
    //decalre instance variables
    private int id;
    private int counter;

    //create private constructor
    private VoteUp(){

    }
    //getters
    public int getId() {
        return id;
    }
    public int getCounter() {
        return counter;
    }

    //now, create Builder Patter constructor to pass parameters
    public VoteUp(Builder builder){
        this.id = builder.id;
        this.counter = builder.counter;
    }
    //create Builder Pattern class
    public static class Builder{
        private int id;
        private int counter;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder counter(int value){
            this.counter = value;
            return this;
        }

        public VoteUp build(){
            return new VoteUp(this);
        }
    }
}

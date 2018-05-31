package com.kleinpix.model;

public class VoteDown {
    //declare instance variables
    private int id;
    private int counter;

    //create private constructor
    private VoteDown(){

    }
    //getters
    public int getId() {
        return id;
    }
    public int getCounter() {
        return counter;
    }

    //create Builder Pattern constructor to pass parameters
    public VoteDown(Builder builder){
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

        public VoteDown build(){
            return new VoteDown(this);
        }
    }
}

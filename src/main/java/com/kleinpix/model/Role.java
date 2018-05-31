package com.kleinpix.model;

public class Role {
    //declare instance variables
    private int id;
    private String name;
    private String description;

    //crete private constructor
    private Role(){

    }
    //create getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    //now create builder Pattern
    //create constructor to pass the Builder Pattern parameters
    public Role(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
    }
    //create Builder Pattern class
    public static class Builder{

        private int id;
        private String name;
        private String description;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder description(String value){
            this.description = value;
            return this;
        }
        public Role build(){
            return new Role(this);
        }
    }
}

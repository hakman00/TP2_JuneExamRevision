package com.kleinpix.model;

import java.util.List;

public class User {
    //declare instance variables
    private int id;
    private String email;
    private String screenName;
    private String password;
    private String status;
    private List<Reputation> reputation;

    //create private cnstructor
    public User(){

    }
    //getters
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getScreenName() {
        return screenName;
    }
    public String getPassword() {
        return password;
    }
    public String getStatus() {
        return status;
    }
    public List<Reputation> getReputation() {
        return reputation;
    }

    //create Builder Pattern cnstructor to pass parameters
    public User(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
        this.screenName = builder.screenName;
        this.password = builder.password;
        this.status = builder.status;
    }
    //create Builder Pattern class
    public static class Builder{
        private int id;
        private String email;
        private String screenName;
        private String password;
        private String status;
        private List<Reputation> reputation;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder screenName(String value){
            this.screenName = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        public Builder status(String value){
            this.status = value;
            return this;
        }
        public Builder reputation(List<Reputation> reputation) {
            this.reputation = reputation;
            return this;
        }

        public User build(){
            return new User(this);
        }


    }
}

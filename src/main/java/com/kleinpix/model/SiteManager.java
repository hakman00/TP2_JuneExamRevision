package com.kleinpix.model;

import java.util.List;

public class SiteManager {
    //declare instance variables
    private int id;
    private String email;
    private String firstname;
    private String lastname;
    private String password;
    private List<Site> site;
    private List<Role> role;
    private Contact contact;

    //create private constructor
    public SiteManager(){

    }
    //getters
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getFirstname() {
        return firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public String getPassword() {
        return password;
    }
    public List<Site> getSite() {
        return site;
    }
    public List<Role> getRole() {
        return role;
    }
    public Contact getContact() {
        return contact;
    }

    //create Builder Pattern constructor to pass parameters
    public SiteManager(Builder builder) {
        this.id = builder.id;
        this.email = builder.email;
        this.firstname = builder.firstName;
        this.lastname = builder.lastName;
        this.password = builder.password;
        this.site = builder.site;
        this.role = builder.role;
        this.contact = builder.contact;
    }
    //create Builder Pattern class
    public static class Builder{
        private int id;
        private String email;
        private String firstName;
        private String lastName;
        private String password;
        private List<Site> site;
        private List<Role> role;
        private Contact contact;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder email(String value){
            this.email = value;
            return this;
        }
        public Builder firstName(String value){
            this.firstName = value;
            return this;
        }
        public Builder lastName(String value){
            this.lastName = value;
            return this;
        }
        public Builder password(String value){
            this.password = value;
            return this;
        }
        public Builder site(List<Site> value){
            this.site = value;
            return this;
        }
        public Builder role(List<Role> value){
            this.role = value;
            return this;
        }
        public SiteManager build(){
            return new SiteManager(this);
        }
    }
}

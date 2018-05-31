package com.kleinpix.model;

public class ContentFilter {
    //declare instance variables
    private int id;
    private String contentCheck;

    //create //private// constructor
    public ContentFilter(){

    }
    //create getters
    public int getId() {
        return id;
    }
    public String getContentCheck() {
        return contentCheck;
    }

    //now create builder Pattern
    //create constructor to pass the Builder Pattern parameters
    public ContentFilter(Builder builder) {
        this.id = builder.id;
        this.contentCheck = builder.contentCheck;
    }
    //create Builder Pattern class
    public static class Builder{

        private int id;
        private String contentCheck;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder contentCheck(String value){
            this.contentCheck = value;
            return this;
        }
        public ContentFilter build(){
            return new ContentFilter(this);
        }
    }
}



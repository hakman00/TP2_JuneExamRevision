package com.kleinpix.model;

public class Site {
    //declare instance variables
    private int id;
    private String name;
    private String url;
    private String storyurl;

    //create private constructor
    private Site(){

    }
    //create getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUrl() {
        return url;
    }
    public String getStoryurl() {
        return storyurl;
    }

    //now create builder Pattern
    //create constructor to pass the Builder Pattern parameters
    public Site(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.url = builder.url;
        this.storyurl = builder.storyurl;
    }
    //create Builder Pattern class
    public static class Builder{
        private int id;
        private String name;
        private String url;
        private String storyurl;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder name(String value){
            this.name = value;
            return this;
        }
        public Builder url(String value){
            this.url = value;
            return this;
        }
        public Builder storyurl(String value){
            this.storyurl = value;
            return this;
        }
        public Site build(){
            return new Site(this);
        }
    }
}

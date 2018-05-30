package com.kleinpix.model;

import java.util.Date;
import java.util.List;

public class Comment {
    //declaring instance variables
    private int id;
    private String comment;
    private Date date;
    private String ipaddress;
    private User user;
    private VoteDown voteDown;
    private Site site;
    private VoteUp voteUp;
    private List<Response> response;
    private List<AbuseReport> abuseReport;
    private ContentFilter contentFilter = new ContentFilter();

    //create private constructor
    private Comment(){

    }
    //create getters
    public String getComment() {
        return comment;
    }
    public Date getDate() {
        return date;
    }
    public String getIpaddress() {
        return ipaddress;
    }
    public User getUser() {
        return user;
    }
    public VoteDown getVoteDown() {
        return voteDown;
    }
    public Site getSite() {
        return site;
    }
    public VoteUp getVoteUp() {
        return voteUp;
    }
    public List<Response> getResponse() {
        return response;
    }
    public List<AbuseReport> getAbuseReport() {
        return abuseReport;
    }
    public ContentFilter getContentFilter() {
        return contentFilter;
    }

    //now, create Builder Pattern
    //constructor to pass the Builder Pattern parameters
    public Comment(Builder builder) {
        this.id = builder.id;
        this.comment = builder.comment;
        this.date = builder.date;
        this.ipaddress = builder.ipaddress;
        this.user = builder.user;
        this.voteDown = builder.voteDown;
        this.site = builder.site;
        this.voteUp = builder.voteUp;
        this.response = builder.response;
        this.abuseReport = builder.abuseReport;
        this.contentFilter = builder.contentFilter;
    }

    //the Builder Patter class
    public static class Builder{
        private int id;
        private String comment;
        private Date date;
        private String ipaddress;
        private User user;
        private VoteDown voteDown;
        private Site site;
        private VoteUp voteUp;
        private List<Response> response;
        private List<AbuseReport> abuseReport;
        private ContentFilter contentFilter;

        public Builder id(int value){
            this.id = value;
            return this;
        }
        public Builder comment(String value){
            this.comment = value;
            return this;
        }
        public Builder date(Date value){
            this.date = value;
            return this;
        }
        public Builder ipaddress(String value){
            this.ipaddress = value;
            return this;
        }
        public Builder user(User value){
            this.user = value;
            return this;
        }
        public Builder voteDown(VoteDown value){
            this.voteDown = value;
            return this;
        }
        public Builder site(Site value){
            this.site = value;
            return this;
        }
        public Builder voteUp(VoteUp value){
            this.voteUp = value;
            return this;
        }
        public Builder response(List<Response> value){
            this.response = value;
            return this;
        }
        public Builder abuseReport(List<AbuseReport> value){
            this.abuseReport = value;
            return this;
        }
        public Builder contentFilter(ContentFilter value){
            this.contentFilter = value;
            return this;
        }

        public Comment build(){
            return new Comment(this);
        }
    }
}

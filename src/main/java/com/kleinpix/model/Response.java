package com.kleinpix.model;

import java.util.Date;
import java.util.List;

public class Response {

    private int id;
    private String comment;
    private Date date;
    private String ipaddress;
    private ContentFilter contentFilter = new ContentFilter();
    private VoteDown voteDown;
    private User user;
    private VoteUp voteUp;
    private List<AbuseReport> abuseReport;

    //create private constructor
    private Response(){

    }
    //getters
    public int getId() {
        return id;
    }
    public String getComment() {
        return comment;
    }
    public Date getDate() {
        return date;
    }
    public String getIpaddress() {
        return ipaddress;
    }
    public ContentFilter getContentFilter() {
        return contentFilter;
    }
    public VoteDown getVoteDown() {
        return voteDown;
    }
    public User getUser() {
        return user;
    }
    public VoteUp getVoteUp() {
        return voteUp;
    }
    public List<AbuseReport> getAbuseReport() {
        return abuseReport;
    }

    //now create builder Pattern
    //create constructor to pass the Builder Pattern parameters
    public Response(Builder builder) {
        this.id = builder.id;
        this.comment = builder.comment;
        this.date = builder.date;
        this.ipaddress = builder.ipaddress;
        this.contentFilter = builder.contentFilter;
        this.voteDown = builder.voteDown;
        this.user = builder.user;
        this.voteUp = builder.voteUp;
        this.abuseReport = builder.abuseReport;
    }
    //create Builder Pattern class
    public static class Builder{
        private int id;
        private String comment;
        private Date date;
        private String ipaddress;
        private ContentFilter contentFilter;
        private VoteDown voteDown;
        private User user;
        private VoteUp voteUp;
        private List<AbuseReport> abuseReport;

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
        public Builder contentFilter(ContentFilter value){
            this.contentFilter = value;
            return this;
        }
        public Builder voteDown(VoteDown value){
            this.voteDown = value;
            return this;
        }
        public Builder user(User value){
            this.user = value;
            return this;
        }
        public Builder voteUp(VoteUp value){
            this.voteUp = value;
            return this;
        }
        public Builder abuseReport(List<AbuseReport> value){
            this.abuseReport = value;
            return this;
        }

        public Response build(){
            return new Response(this);
        }
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comment comment = (Comment) o;

        return id.equals(comment.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
    */
}

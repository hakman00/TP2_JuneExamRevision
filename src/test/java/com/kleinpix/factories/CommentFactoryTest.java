package com.kleinpix.factories;

import com.kleinpix.model.Comment;
import com.kleinpix.model.Reputation;
import com.kleinpix.model.Site;
import com.kleinpix.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CommentFactoryTest {

    //using map to insert and also hold values of user
    Map<String, String> userList;

    //using map to insert and also hold values of comment
    Map<String,String> commentList;

    //using map to insert and also hold values of site
    Map<String,String> siteList;

    //using Map to insert ArrayList of User and Site
    Map<String, List> UsersAndSite;

    //Date instance variable
    Date date;

    //class Reputation
    Reputation reputation;

    //class User
    User users;

    //class Site
    Site sites;

    List<Reputation> rep;
    List<User> user;
    List<Site> site;
    Comment comment;

    @Before
    public void setUp() throws Exception {
        //date
        date = new Date();

        //values for comment
        commentList = new HashMap<String, String>();
        commentList.put("ID", "1001");
        commentList.put("COMMENT: ", "Thankyou for your comment! ");
        commentList.put("IP_Address", "192.168.10.5");

        //values for reputation
        reputation = ReputationFactory.getCustomer(1001,date,42);  //getReputation(1001, date, 65);
        rep = new ArrayList<Reputation>();
        rep.add(reputation);

        //values for user
        userList = new HashMap<String, String>();
        userList.put("ID: ","1001");
        userList.put("e-mail: ","kleinh001@gmail.com");
        userList.put("Screen Name: ","Hakman00");
        userList.put("password: ", "H.K_123456");
        userList.put("status: ", "Successfully Registered! ");

        ///Get values of user from factory
        users = UserFactory.getUser(userList, rep, 1001);

        ///Store values into ArrayList
        user = new ArrayList<User>();
        user.add(users);

        //values for site
        siteList = new HashMap<String, String>();
        siteList.put("ID: ","1001");
        siteList.put("Name: ","KLEINPIX");
        siteList.put("URL: ","http://www.kleinpix.co.za");
        siteList.put("StoryURL: ", "Photography Service");

        ///Get the values of site from factory
        sites = SiteFactory.getSite(siteList, 1001);

        ///Store the values in an ArrayList
        site = new ArrayList<Site>();
        site.add(sites);

        //Store the ArrayList of User and
        UsersAndSite = new HashMap<String, List>();
        UsersAndSite.put("USER: ", user);
        UsersAndSite.put("SITE: ", site);
        comment = CommentFactory.getComment(commentList,UsersAndSite,date,1001);
    }

    @Test
    public void getComment() throws Exception{

        assertEquals(42, comment.getUser().getReputation().get(0).getValue());
    }
    @Test
    public void testCommentObject() throws Exception {
        assertEquals(true, comment.equals(comment));
    }
}
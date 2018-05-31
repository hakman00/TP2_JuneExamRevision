package com.kleinpix.model;

import com.kleinpix.factories.ReputationFactory;
import com.kleinpix.factories.UserFactory;
import com.kleinpix.services.Impl.UserServicesImpl;
import com.kleinpix.services.UserServices;

import java.util.*;

public class RunApp {


    public static void main(String[]args)
    {
        Map<String, String> userList;
        Map<String,String> commentList;
        Map<String, List> UsersAndSite;
        UserServices service;

        Date date;
        Reputation reputation;
        User user;

        List<Reputation> rep;
        List<User> users;
        //date
        date = new Date();

        //values for comment
        commentList = new HashMap<String, String>();
        commentList.put("ID: ", "1001");
        commentList.put("Comment: ", "Thankyou for your comment! ");
        commentList.put("IP_Address: ", "192.168.10.5");

        //values for reputation
        rep = new ArrayList<Reputation>();
        reputation = ReputationFactory.getCustomer(1001, date, 42);
        rep.add(reputation);

        //values for user
        userList = new HashMap<String, String>();
        userList.put("ID: ","1001");
        userList.put("e-mail","kleinh001@gmail.com");
        userList.put("Screen Name: ","Hakman00");
        userList.put("password", "H.K_123456");
        userList.put("status", "Successfully Registered! ");
        users = new ArrayList<User>();
        user = UserFactory.getUser(userList, rep,1001);
        users.add(user);

        //put the Reputation and User into the HashMap
        service = new UserServicesImpl();
        user = UserFactory.getUser(userList, rep,1001);

        System.out.println("User created succssefully: " + service.create(user).equals(user));

        User readUser = service.read(1001);
        System.out.println("User ID is: " + readUser.getId());
    }
}

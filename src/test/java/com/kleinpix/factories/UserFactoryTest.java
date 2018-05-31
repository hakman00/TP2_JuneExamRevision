package com.kleinpix.factories;

import com.kleinpix.model.Reputation;
import com.kleinpix.model.User;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class UserFactoryTest {

    Map<String,String> values;
    Reputation reputation;
    Date date;
    List<Reputation> rep;
    User user;

    @Before
    public void setUp() throws Exception {

        values = new HashMap<String, String>();
        values.put("ID: ","1001");
        values.put("e-mail","kleinh001@gmail.com");
        values.put("Screen Name: ","Hakman00");
        values.put("password", "H.K_123456");
        values.put("status", "Successfully Registered! ");

        date = new Date();
        reputation = ReputationFactory.getCustomer(1001, date, 65);
        rep = new ArrayList<Reputation>();
        rep.add(reputation);

        user = UserFactory.getUser(values, rep, 1001);
    }

    @Test
    public void getUser() throws Exception{
        assertEquals("1001", user.getReputation().get(0).getId());
    }
    @Test
    public void testScreenName() throws Exception{
        assertEquals("Hakman00", user.getScreenName());
    }
    @Test
    public void testUserObject() throws Exception{
        assertEquals(true, user.equals(user));
    }
}
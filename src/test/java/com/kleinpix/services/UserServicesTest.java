package com.kleinpix.services;

import com.kleinpix.factories.ReputationFactory;
import com.kleinpix.factories.UserFactory;
import com.kleinpix.model.Reputation;
import com.kleinpix.model.User;
import com.kleinpix.services.Impl.UserServicesImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class UserServicesTest {

    UserServices service;
    Map<String, String> userMap;
    List<Reputation> rep;
    Reputation reputation;
    Date date;
    User user;
    int id;

    @Before
    public void setUp() throws Exception {

        service = new UserServicesImpl();
        userMap = new HashMap<String, String>();
        userMap.put("id","1001");
        userMap.put("e-mail","kleinh001@gmail.com");
        userMap.put("Screen Name: ","Hakman00");
        userMap.put("password", "H.K_123456");
        userMap.put("status", "Successfully Registered! ");

        reputation = ReputationFactory.getCustomer(1001, date, 51);
        rep = new ArrayList<Reputation>();
        rep.add(reputation);
    }

    @Test
    public void create() throws Exception{

        user = UserFactory.getUser(userMap, rep,1001);
        service.create(user);
        assertEquals(true, service.create(user).equals(user));
    }

    @Test
    public void read() throws Exception{

        User readUser = service.read(1001);
        assertEquals(true, readUser.equals(user));
    }

    @Test
    public void update() throws Exception{

        User readUser = service.read(1001);

        userMap = new HashMap<String, String>();
        userMap.put("ID: ","1001");
        userMap.put("e-mail","kleinh001@gmail.com");
        userMap.put("Screen Name: ","Hakman00");
        userMap.put("password", "H.K_123456");
        userMap.put("status", "Successfully Registered! ");

        User updateUser = new User.Builder()
                .id(id)
                .email(userMap.get("e-mail"))
                .screenName(userMap.get("Screen Name: "))
                .password(userMap.get("password"))
                .status(userMap.get("status"))
                .reputation(rep)
                .build();

        service.update(updateUser);

        assertEquals("Hakman00", updateUser.getScreenName());
    }
    @Test
    public void readUpdated() throws Exception {
        User readUser = service.read(1001);
        assertEquals("Hakman00", readUser.getScreenName());
    }

    @Test
    public void delete() throws Exception{

        service.delete(1001);
        User user = service.read(1001);
        assertNull(user);
    }
}
package com.kleinpix.repositories;

import com.kleinpix.factories.ReputationFactory;
import com.kleinpix.factories.UserFactory;
import com.kleinpix.model.Reputation;
import com.kleinpix.model.User;
import com.kleinpix.repositories.Implementation.UserRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class UserRepositoryTest {

    UserRepository repository;
    Map<String, String> userMap;
    List<Reputation> rep;
    Reputation reputation;
    Date date;
    User user;
    int id;

    @Before
    public void setUp() throws Exception {

        repository = UserRepositoryImpl.getInstance();
        userMap = new HashMap<String, String>();
        //userMap.put("ID: ","1001");
        userMap.put("e-mail","kleinh001@gmail.com");
        userMap.put("Screen Name: ","Hakman00");
        userMap.put("password", "H.K_123456");
        userMap.put("status", "Successfully Registered! ");

        reputation = ReputationFactory.getCustomer(1001, date, 65);
        rep = new ArrayList<Reputation>();
        rep.add(reputation);
    }

    @Test
    public void create() {

        user = UserFactory.getUser(userMap, rep,1001);
        repository.create(user);
        assertEquals(true, repository.create(user).equals(user));
    }

    @Test
    public void read() {

        User readUser = repository.read(1001);
        assertEquals(true, readUser.equals(user));
    }

    @Test
    public void update() {

        User readUser = repository.read(1001);

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

        repository.update(updateUser);

        assertEquals("Hakman00", updateUser.getScreenName());
    }

    @Test
    public void delete() {

        repository.delete(1001);
        User user = repository.read(1001);
        assertNull(user);
    }
}
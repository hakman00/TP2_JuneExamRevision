package com.kleinpix.factories;

import com.kleinpix.model.Reputation;
import com.kleinpix.model.User;

import java.util.List;
import java.util.Map;

public class UserFactory {

    public static User getUser(Map<String, String> values, List<Reputation> reputation,int id)
    {
        User user = new User.Builder()
                .id(id)
                .email(values.get("e-mail"))
                .screenName(values.get("Screen Name: "))
                .password(values.get("password"))
                .status(values.get("status"))
                .reputation(reputation)
                .build();
        return user;
    }
}

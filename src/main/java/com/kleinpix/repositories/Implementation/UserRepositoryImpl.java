package com.kleinpix.repositories.Implementation;

import com.kleinpix.model.User;
import com.kleinpix.repositories.UserRepository;

import java.util.HashMap;
import java.util.Map;

public class UserRepositoryImpl implements UserRepository {

    public static UserRepositoryImpl repository = null;

    private Map<Integer, User> userTable;

    private UserRepositoryImpl()
    {
        userTable = new HashMap<Integer, User>();
    }

    //Singleton pattern
    public static UserRepositoryImpl getInstance()
    {
        if(repository == null)
            repository = new UserRepositoryImpl();
        return repository;
    }


    public User create(User user) {
        userTable.put(user.getId(),user);
        User savedUser = userTable.get(user.getId());
        return savedUser;
    }

    public User read(int id) {
        User user = userTable.get(id);
        return user;
    }

    public User update(User user) {
        userTable.put(user.getId(), user);
        User updateUser = userTable.get(user.getId());
        return updateUser;
    }

    public void delete(int id) {
        userTable.remove(id);
    }
}

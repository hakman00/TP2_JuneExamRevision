package com.kleinpix.services.Impl;

import com.kleinpix.model.User;
import com.kleinpix.repositories.Implementation.UserRepositoryImpl;
import com.kleinpix.repositories.UserRepository;
import com.kleinpix.services.UserServices;

public class UserServicesImpl implements UserServices {

    UserRepository repository = UserRepositoryImpl.getInstance();

    public User create(User user) {
        return repository.create(user);
    }

    public User read(int id) {
        return repository.read(id);
    }

    public User update(User user) {
        return repository.update(user);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}

package com.kleinpix.repositories;

import com.kleinpix.model.User;

public interface UserRepository {

    User create(User user);

    User read(int id);

    User update(User person);

    void delete(int id);
}

package com.kleinpix.services;

import com.kleinpix.model.User;

public interface UserServices {

    User create(User user);

    User read(int id);

    User update(User user);

    void delete (int id);
}

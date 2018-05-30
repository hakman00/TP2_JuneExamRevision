package com.kleinpix.services;

import com.kleinpix.model.Reputation;

public interface ReputationService {

    Reputation create(Reputation reputation);

    Reputation read(int id);

    Reputation update(Reputation reputation);

    void delete(int id);
}

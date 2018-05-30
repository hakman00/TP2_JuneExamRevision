package com.kleinpix.repositories;

import com.kleinpix.model.Reputation;

public interface ReputationRepository {

    Reputation create(Reputation reputation);

    Reputation read(int id);

    Reputation update(Reputation reputation);

    void delete(int id);
}

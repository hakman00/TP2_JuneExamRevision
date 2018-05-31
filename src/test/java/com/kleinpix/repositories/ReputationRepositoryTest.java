package com.kleinpix.repositories;

import com.kleinpix.factories.ReputationFactory;
import com.kleinpix.model.Reputation;
import com.kleinpix.repositories.Implementation.ReputationRepositoryImpl;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReputationRepositoryTest {

    Reputation reputation;
    ReputationRepository repository;
    Date date = new Date();

    @Before
    public void setUp() throws Exception {

        reputation = ReputationFactory.getCustomer(1001, date, 65);
        repository = ReputationRepositoryImpl.getInstance();
    }

    @Test
    public void create() throws Exception{

        repository.create(reputation);
        assertEquals(true, reputation.equals(reputation));
    }

    @Test
    public void read() throws Exception{

        Reputation readReputation = repository.read(1001);
        assertEquals(date, reputation.getDate());
    }

    @Test
    public void update() throws Exception{

        Reputation UpdateReputation = repository.read(1001);
        Reputation rep = new Reputation.Builder()
                .id(1001)
                .date(date)
                .value(31)
                .build();
        repository.update(rep);
        assertEquals(31, rep.getValue());
    }

    @Test
    public void delete() throws Exception{

        repository.delete(1001);
        Reputation deleteReputation = repository.read(1001);
        assertNull(deleteReputation);
    }
}
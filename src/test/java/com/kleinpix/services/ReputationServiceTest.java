package com.kleinpix.services;

import com.kleinpix.factories.ReputationFactory;
import com.kleinpix.model.Reputation;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReputationServiceTest {

    Reputation reputation;
    ReputationService service;
    Date date = new Date();

    @Before
    public void setUp() throws Exception {

        reputation = ReputationFactory.getCustomer(1001, date, 65);
        service = new com.kleinpix.services.ReputationServiceImpl();
    }

    @Test
    public void create() throws Exception{

        service.create(reputation);
        assertEquals(true, reputation.equals(reputation));
    }

    @Test
    public void read() throws Exception{

        Reputation readReputation = service.read(1001);
        assertEquals(date, reputation.getDate());
    }

    @Test
    public void update() throws Exception{

        Reputation UpdateReputation = service.read(1001);
        Reputation rep = new Reputation.Builder()
                .id(1001)
                .date(date)
                .value(42)
                .build();
        service.update(rep);
        assertEquals(42, rep.getValue());
    }

    @Test
    public void delete() throws Exception{

        service.delete(1001);
        Reputation deleteReputation = service.read(1001);
        assertNull(deleteReputation);
    }
}
package com.kleinpix.factories;

import com.kleinpix.model.Reputation;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class ReputationFactoryTest {

    Reputation reputation;
    Date date = new Date();

    @Before
    public void setUp() throws Exception {

        reputation = ReputationFactory.getCustomer(1001, date, 42);
    }

    @Test
    public void getCustomer() {
        assertEquals(42, reputation.getValue());
    }
    @Test
    public void testReputationObject() throws Exception{
        assertEquals(true, reputation.equals(reputation));
    }
}
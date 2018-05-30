package com.kleinpix.factories;

import com.kleinpix.model.Reputation;

import java.util.Date;
import java.util.Map;

public class ReputationFactory {
    public static Reputation getCustomer(int id,Date date, int value) {
        Reputation reputation = new Reputation.Builder()
                .id(id)
                .date(date)
                .value(value)
                .build();
        return reputation;
    }
}

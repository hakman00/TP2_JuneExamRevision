package com.kleinpix.repositories.Implementation;

import com.kleinpix.model.Reputation;
import com.kleinpix.repositories.ReputationRepository;

import java.util.HashMap;
import java.util.Map;

public class ReputationRepositoryImpl implements ReputationRepository {

    private static ReputationRepositoryImpl repository = null;

    private Map<Integer,Reputation> reputationTable;

    private ReputationRepositoryImpl(){
        reputationTable = new HashMap<Integer, Reputation>();
    }

    public static ReputationRepositoryImpl getInstance(){
        if(repository == null)
            repository = new ReputationRepositoryImpl();

        return repository;
    }

    public Reputation create(Reputation customer){
        reputationTable.put(customer.getId(),customer);
        Reputation savedCustomer = reputationTable.get(customer.getId());
        return savedCustomer;
    }

    public Reputation read(int id){
        Reputation customer = reputationTable.get(id);
        return customer;
    }

    public Reputation update(Reputation customer){
        reputationTable.put(customer.getId(),customer);
        Reputation savedCustomer = reputationTable.get(customer.getId());
        return savedCustomer;
    }

    public void delete(int id){
        reputationTable.remove(id);
    }
}

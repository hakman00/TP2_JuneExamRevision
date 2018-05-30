package com.kleinpix.services;

import com.kleinpix.model.Reputation;
import com.kleinpix.repositories.ReputationRepository;
import com.kleinpix.repositories.ReputationRepositoryImpl;

public class ReputationServiceImpl implements ReputationService{

    private static ReputationServiceImpl service = null;

    ReputationRepository repository = ReputationRepositoryImpl.getInstance();

    public static ReputationServiceImpl getInstance(){
        if(service == null)
            service = new ReputationServiceImpl();

        return service;
    }

    public Reputation create(Reputation reputation){
        return repository.create(reputation);
    }

    public Reputation read(int id){
        return repository.read(id);
    }

    public Reputation update(Reputation reputation){
        return repository.update(reputation);
    }

    public void delete(int id){
        repository.delete(id);
    }
}

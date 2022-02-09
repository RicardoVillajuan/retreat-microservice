package com.bank.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.bank.model.Retreat;



public interface RetreatRepository  extends ReactiveMongoRepository<Retreat, String>{

}

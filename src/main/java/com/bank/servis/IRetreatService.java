package com.bank.servis;



import com.bank.model.Retreat;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IRetreatService {
	Flux<Retreat> findAll();
	
	Mono<Retreat> save(Retreat product);
	
	Mono<Retreat> findRetreatById(String id);
	
	Mono<Retreat> update(Retreat retreat);
	
	void deleteById(String id);
}

package com.bank.servis;


import org.springframework.stereotype.Service;

import com.bank.model.Retreat;
import com.bank.repository.RetreatRepository;

import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RequiredArgsConstructor
@Service
public class ServiceRetreatImpl implements IRetreatService{
	private final RetreatRepository repository;

	@Override
	public Flux<Retreat> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Mono<Retreat> save(Retreat retreat) {
		// TODO Auto-generated method stub
		return repository.save(retreat);
	}

	@Override
	public Mono<Retreat> findRetreatById(String id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Retreat> update(Retreat product) {
		// TODO Auto-generated method stub
		return repository.save(product);
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id).subscribe();
		
	}

	

}

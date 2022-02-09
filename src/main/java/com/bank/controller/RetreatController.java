package com.bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.bank.model.Retreat;
import com.bank.servis.IRetreatService;


import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("/retreats")
public class RetreatController {
	private final IRetreatService service;
	@GetMapping("/findAll")
	public Flux<Retreat> getRetreat(){
		
		return service.findAll();
	}
	
	@PostMapping("/save")
	Mono<Retreat> postClient(@RequestBody Retreat retreat)
	{
		return service.save(retreat);
	}
	@PostMapping("/update")
	public Mono<Retreat> saveProduct(@RequestBody Retreat retreat){
		
		return service.save(retreat);
	}
	
	@PostMapping("/delete/{id}")
	void deleteProduct(@PathVariable String id){
		
		service.deleteById(id);
	}
	
	@GetMapping("/findbyid/{id}")
	public Mono<Retreat> findById(@PathVariable String id){
		return service.findRetreatById(id);
	}

}

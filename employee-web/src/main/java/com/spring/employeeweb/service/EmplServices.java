package com.spring.employeeweb.service;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.spring.employeeweb.entity.Empl;

import reactor.core.publisher.Flux;

@Service
public class EmplServices {
	private List<Empl> emplList = new ArrayList<>(Arrays.asList(

            new Empl("001", "Mitalee", "Playing"),
            new Empl("002", "Pratham", "Drawing"),
            new Empl("003", "Sham", "Reading")

    ));
	
	@Autowired
	WebClient webClient;

	public Flux<Empl> findAll()

	{
		return webClient.get()
			.uri("http://localhost:8080/api/tan/employee")
			.retrieve()
			.bodyToFlux(Empl.class)
			.timeout(Duration.ofMillis(10_000));
	}


	public List<Empl> getAll() {
		return emplList;
	}
	
}

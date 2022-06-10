package com.example.tan;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@Service
public class IntrestServices{
	private List<Intrests> intrestList = new ArrayList<>(Arrays.asList(

            new Intrests("001", "Mitalee", "Playing"),
            new Intrests("002", "Pratham", "Drawing"),
            new Intrests("003", "Sham", "Reading")

    ));
	
	@Autowired
	WebClient webClient;

	public Flux<Intrests> findAll()

	{
		return webClient.get()
			.uri("/get/all")
			.retrieve()
			.bodyToFlux(Intrests.class)
			.timeout(Duration.ofMillis(10_000));
	}


	public List<Intrests> getAllIntrest() {
		// TODO Auto-generated method stub
		return intrestList;
	}
}

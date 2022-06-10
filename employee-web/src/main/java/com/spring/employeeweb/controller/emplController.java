package com.spring.employeeweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.spring.employeeweb.entity.Empl;
import com.spring.employeeweb.service.EmplServices;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/empl")
public class emplController {
	@Autowired
	private EmplServices emplService;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@GetMapping("/getAll")
	public Flux<Empl> allIntrest(){
		return emplService.findAll();
		
	}
	
	@GetMapping("/message")
	public String DisplayMessage()
	{
		return "Hello Employee";
	}
	@GetMapping("/getAllEmployee")
	public List<Empl> allEmpl(){
		return emplService.getAll();
	}
	

}

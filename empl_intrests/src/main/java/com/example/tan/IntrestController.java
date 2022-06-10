package com.example.tan;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.http.HttpStatus;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/intrests")
public class IntrestController {

	@Autowired
	private IntrestServices intrestService;
	
//	@GetMapping("/intrests")
//	public List<Intrests> allIntrest(){
//		return intrestService.getAllIntrest();
//		
//	}
	
	@GetMapping("/intrests/message")
	public String DisplayMessage()
	{
		return "Hello Employee";
	}


    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    //using Flux for collection of employees
    public Flux<Intrests> findAll() {
    	return intrestService.findAll();
    }
//	@RequestMapping("/{id}")
//	public List<Intrests> getIntrest(@PathVariable("id") String id)
//	{
//		RestTemplate restTemplate= new RestTemplate();
////		Intrests result =restTemplate.getForObject("http://localhost:8080/api/tan/employee", Intrests.class);
//		
//		List<TaEmployee> employee = Arrays.asList();
//				
//		return employee.stream().map(employee -> {
//			Intrests result = restTemplate.getForObject("http://localhost:8080/api/tan/employee/"+employee.getId(), Intrests.class);
//		
//		}).collect(Collectors.toList());
//	}
	
}

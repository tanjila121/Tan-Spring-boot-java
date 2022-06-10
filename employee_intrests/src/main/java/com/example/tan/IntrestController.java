package com.example.tan;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/intrests")
public class IntrestController {

	@Autowired
	private IntrestServices intrestService;
	
	@Autowired
	   RestTemplate restTemplate;
	
	@GetMapping("/getAll")
	public List<Intrests> allIntrest(){
		return intrestService.getAllIntrest();
		
	}
	
	@GetMapping("/message")
	public String DisplayMessage()
	{
		return "Hello Employee";
	}
	
	@RequestMapping(value = "/getEmp")
	   public String getEmployeeList() {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange("http://localhost:8080/api/tan/employee", HttpMethod.GET, entity, String.class).getBody();
	}
	
}

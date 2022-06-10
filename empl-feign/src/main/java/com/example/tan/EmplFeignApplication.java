package com.example.tan;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableFeignClients
public class EmplFeignApplication {
	
	@Autowired
	private EmplClient client;
	
	@GetMapping("/findAllEmployee")
	public List<TaEmployee> getAllEmployee(){
		return client.getEmployee();
	}

	public static void main(String[] args) {
		SpringApplication.run(EmplFeignApplication.class, args);
	}

}

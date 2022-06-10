package com.example.tan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@EnableAutoConfiguration(exclude = HypermediaAutoConfiguration.class)
public class EmplIntrestsApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(EmplIntrestsApplication.class, args);
		
		System.out.println("Welcome to Spring Boot");
	}
	@Bean
	   public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }
}

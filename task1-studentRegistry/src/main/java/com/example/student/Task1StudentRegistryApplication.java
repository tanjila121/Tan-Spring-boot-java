package com.example.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example.student.entity")
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class Task1StudentRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Task1StudentRegistryApplication.class, args);
	}
}

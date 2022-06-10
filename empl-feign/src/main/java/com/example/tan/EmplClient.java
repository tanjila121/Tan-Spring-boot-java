package com.example.tan;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="localhost:8080/api/tan",name="EMPLOYEE-CLIENT")
public interface EmplClient {
	
	@GetMapping("/employee")
	public List<TaEmployee> getEmployee();

}

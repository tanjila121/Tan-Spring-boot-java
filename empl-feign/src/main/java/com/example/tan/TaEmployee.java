package com.example.tan;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
@Data
public class TaEmployee {
	
	private Long id;
	
	
    private String name;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private LocalDate dob;
	
	private Long salary;
	
	private String city;
	
	public TaEmployee(Long id, String name, Long salary, String city, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.salary = salary;
		this.city = city;
		
	}

	public TaEmployee() {
		super();
	}


}

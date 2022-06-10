package com.spring.employeeweb.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Long getSalary() {
		return salary;
	}

	public void setSalary(Long salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}

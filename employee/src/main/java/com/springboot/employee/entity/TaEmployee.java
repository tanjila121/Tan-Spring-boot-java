package com.springboot.employee.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name="ta_employee")
@Data
public class TaEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
    private String name;
	
	@Column(name="dob")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	//@Min(value = 18, message = "Age must not be less than 18.")
	private LocalDate dob;
	
	@Column(name="salary")
	private Long salary;
	
	@Column(name="city")
	private String city;
	
//	@Min(value = 18, message = "Age must not be less than 18.")
//	@Max(value = 60, message = "Age must not be greater than 60.")
//	private Long age;

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
		// TODO Auto-generated constructor stub
	}

//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public LocalDate getDob() {
//		
//		return dob;
//	}
//
//	public void setDob(LocalDate dob) {
//		this.dob = dob;
//	}
//
//	public Long getSalary() {
//		return salary;
//	}
//
//	public void setSalary(Long salary) {
//		this.salary = salary;
//	}
//
//	public String getCity() {
//		return city;
//	}
//
//	public void setCity(String city) {
//		this.city = city;
//	}

}

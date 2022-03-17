package com.jpahibernate.demo;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class TaPartTimeEmployee extends TanjilaEmployee {
	protected TaPartTimeEmployee() {}
	
	public TaPartTimeEmployee(String name , BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage =hourlyWage;
	}
private BigDecimal hourlyWage;
}

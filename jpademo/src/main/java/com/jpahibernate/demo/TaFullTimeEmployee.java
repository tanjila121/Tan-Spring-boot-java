package com.jpahibernate.demo;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class TaFullTimeEmployee extends TanjilaEmployee {
	protected TaFullTimeEmployee() {}
	
	public TaFullTimeEmployee(String name , BigDecimal salary) {
		super(name);
		this.salary =salary;
	}
private BigDecimal salary;
}

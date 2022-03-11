package com.jpahibernate.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TanjilaPassport {

@Id
@GeneratedValue
private Long id;

@Column(nullable= false)
private String number;



protected TanjilaPassport() {

}

public TanjilaPassport(String number) {

this.number = number;
}

public String getNumber() {
	return number;
}

public void setNumber(String number) {
	this.number = number;
}

public Long getId() {
	return id;
}

@Override
public String toString() {
	return String.format("tanjila_passport[%s]", number);
}



}

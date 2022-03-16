package com.jpahibernate.demo;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TanjilaPassport {

@Id
@GeneratedValue
private Long id;

@Column(nullable= false)
private String number;

@OneToOne(fetch=FetchType.LAZY, mappedBy ="passport")
private TanjilaStudent student ;

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
public TanjilaStudent getStudent() {
	return student;
}

public void setStudent(TanjilaStudent student) {
	this.student = student;
}

@Override
public String toString() {
	return String.format("TanjilaPassport[%s]", number);
}



}

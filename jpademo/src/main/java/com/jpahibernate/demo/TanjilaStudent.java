package com.jpahibernate.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class TanjilaStudent {

@Id
@GeneratedValue
private Long id;
                       //RENAME TABLE tanjila_Student TO tanjila_student;
private String name;

@OneToOne
private TanjilaPassport passport ;

protected TanjilaStudent() {

}

public TanjilaStudent(String name) {

this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public TanjilaPassport getPassport() {
	return passport;
}

public void setPassport(TanjilaPassport passport) {
	this.passport = passport;
}

public Long getId() {
	return id;
}

@Override
public String toString() {
	return String.format("tanjila_student[%s]", name);
}



}

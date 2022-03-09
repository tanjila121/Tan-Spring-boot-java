package com.jpahibernate.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class tanjila_Course {

@Id
@GeneratedValue
private Long id;

private String name;

protected tanjila_Course() {

}

public tanjila_Course(String name) {

this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Long getId() {
	return id;
}


}

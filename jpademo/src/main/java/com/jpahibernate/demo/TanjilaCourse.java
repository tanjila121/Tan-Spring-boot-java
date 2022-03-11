package com.jpahibernate.demo;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity

@NamedQuery(name="query_get_all_courses",query="Select c From TanjilaCourse c")
@NamedQuery(name="query_get_database",query="Select c From TanjilaCourse c where name like '%database'")
public class TanjilaCourse {

@Id
@GeneratedValue
private Long id;

private String name;

@UpdateTimestamp
private LocalDateTime lastUpdatedDate;

@CreationTimestamp
private LocalDateTime createdDate;


protected TanjilaCourse() {

}

public TanjilaCourse(String name) {

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

@Override
public String toString() {
	return  String.format("tanjila_course",name);
}



}

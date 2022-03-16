package com.tan.database.database2demo;


import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name="find_all_persons",query="select p from tanjila_Person p")
public class tanjila_Person {
@Id
@GeneratedValue
private int id;
private String name;
private String location;
private Date birthdate ;

public tanjila_Person() {
	
}


public tanjila_Person(int id, String name, String location, Date birthdate) {
	super();
	this.id = id;
	this.name = name;
	this.location = location;
	this.birthdate = birthdate;
}

public tanjila_Person(String name, String location, Date birthdate) {
	super();
	this.name = name;
	this.location = location;
	this.birthdate = birthdate;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Date getBirthdate() {
	return birthdate;
}
public void setBirthdate(Date birthdate) {
	this.birthdate = birthdate;
}

@Override
public String toString() {
	return "\n tanjila_Person [id=" + id + ", name=" + name + ", location=" + location + ", birthdate=" + birthdate + "]";
}


}
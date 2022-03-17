package com.jpahibernate.demo;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class TanjilaStudent {

@Id
@GeneratedValue
private Long id;
                       //RENAME TABLE tanjila_Student TO tanjila_student;
private String name;

@OneToOne(fetch=FetchType.LAZY)
private TanjilaPassport passport ;


@ManyToMany
@JoinTable(name="TanjilaStudent_TanjilaCourse_course",
joinColumns = @JoinColumn(name = "student_id"),
inverseJoinColumns = @JoinColumn(name = "course_id"))

private List<TanjilaCourse> courses = new ArrayList<>();

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

public List<TanjilaCourse> getCourses() {
	return courses;
}

public void addCourse(TanjilaCourse course) {
	this.courses.add(course);
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
	return String.format("TanjilaStudent[%s]", name);
}

 
}

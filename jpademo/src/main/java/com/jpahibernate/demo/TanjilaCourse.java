package com.jpahibernate.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

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

@OneToMany(mappedBy = "course")
private List<TanjilaReview> reviews = new ArrayList<>();

@ManyToMany(mappedBy="courses")

private List<TanjilaStudent> students = new ArrayList<>();

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

public List<TanjilaReview> getReviews() {
	return reviews;
}

public void addReview(TanjilaReview review) {
	this.reviews.add(review);
}
public void removeReview(TanjilaReview review) {
	this.reviews.remove(review);
}

public void setReviews(List<TanjilaReview> reviews) {
	this.reviews = reviews;
}

public Long getId() {
	return id;
}

public List<TanjilaStudent> getStudents() {
	return students;
}

public void addStudents(TanjilaStudent student) {
	this.students.add(student);
}

@Override
public String toString() {
	return  String.format("TanjilaCourse",name);
}



}

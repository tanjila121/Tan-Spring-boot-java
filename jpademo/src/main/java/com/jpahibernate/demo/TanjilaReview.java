package com.jpahibernate.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TanjilaReview {

@Id
@GeneratedValue
private Long id;
private String rating;

private String description;



protected TanjilaReview() {

}

public TanjilaReview(String rating,String description) {
this.rating = rating;
this.description = description;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public Long getId() {
	return id;
}

public String getRating() {
	return rating;
}

public void setRating(String rating) {
	this.rating = rating;
}

@Override
public String toString() {
	return String.format("tanjila_review[%s %s]", rating, description);
}



}

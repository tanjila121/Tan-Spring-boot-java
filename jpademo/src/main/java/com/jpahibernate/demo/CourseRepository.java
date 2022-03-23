package com.jpahibernate.demo;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {
	
//	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public TanjilaCourse findById(Long id) {
		TanjilaCourse course = em.find(TanjilaCourse.class, id);
		System.out.println("TanjilaCourse ->{}"+course);
		return course;
		}
	
	public TanjilaCourse save(TanjilaCourse course) {
		if(course.getId()==null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;
	}
	public void playWithEntityManager() {
		// System.out.println("playWithEntityManager - started");  //printed only to check if this running or not
//		tanjila_course course1 = new tanjila_course("Annotations(@)"); //insert first and then update it
//		em.persist(course1);
//		TanjilaCourse course2 =findById(1026L);
//		course2.setName("Native Queries with parameter");
		
//		tanjila_course course2 = new tanjila_course("Angular Js");
//		em.persist(course2);
//		em.flush(); //above two queries will be added to database using flush()
//		
//		// em.clear();  //is used same as detach but no need to specify any entity
////		em.detach(course1);
////		em.detach(course2);
//		course2.setName("Angular Js - Updated");
//		course1.setName("Annotations(@) - Updated");
//		em.refresh(course1); //will refresh contents of course1(refresh updated contents)i.e print @Annotations(@)
//		em.flush();
		
	}

	public void addHardcodedReviewsForCourse() {
		//get the course 1002
		TanjilaCourse course =findById(1002L);
		System.out.println("course.getReviews()->{}"+course.getReviews());

		//add 2 reviews to it
		TanjilaReview review1 = new TanjilaReview(ReviewRating.FOUR,"Great hands on stuff");
		TanjilaReview review2 = new TanjilaReview(ReviewRating.FIVE,"Good work");
		
		//setting the relationship
		course.addReview(review1);
		review1.setCourse(course);
		
		course.addReview(review2);
		review2.setCourse(course);
		
		//save it to the database
		em.persist(review1);
		em.persist(review2);
	}
	public void addReviewsForCourse(Long courseId, List<TanjilaReview> reviews) {
	
//		TanjilaCourse course =findById(courseId);
//		System.out.println("course.getReviews()->{}"+course.getReviews());
//
//		for(TanjilaReview review:reviews)
//		{
//		course.addReview(review);
//		review.setCourse(course);
//		em.persist(review);
//		}
	}
	
	public void deleteById(Long id) {
		TanjilaCourse course = findById(1004L);
		em.remove(course);   
		}

}

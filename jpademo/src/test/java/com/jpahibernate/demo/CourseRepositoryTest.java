package com.jpahibernate.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseRepositoryTest {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;
	
	@Autowired
	EntityManager em;

	@Test
	public void findById_basic() {

//	TanjilaCourse course = repository.findById(1001L);
//	assertEquals("JPA in 50 steps", course.getName());
	//logger.info("Testing is Running");
	//System.out.println("Testing is Running");
	}
	
//	@Test
//	@DirtiesContext
//	public void save_basic() {
//		//get a course
//		TanjilaCourse course = repository.findById(1015L);
//		assertEquals("Unit testing", course.getName());
//		
//		//update details
//		course.setName("SQL queries");
//		repository.save(course);
//		
//		//check the value
//		TanjilaCourse course1 = repository.findById(1019L);
//		assertEquals("JPA queries", course1.getName());
//		//assertNull(repository.findById(1014L));  //compare 
//	}
	@Test
	@DirtiesContext
	public void playWithEntityManager() {
		repository.playWithEntityManager();
	}
	
//	@Test   //one to many
//	@Transactional
//	public void retrieveReviewsForCourse() {
//		TanjilaCourse course = repository.findById(1001L);
//		System.out.println("course.getReviews()->{}" + course.getReviews());
//	}
//	
//	@Test    //many to one
//	@Transactional
//	public void retrieveCourseForReviews() {
//		TanjilaReview review = em.find(TanjilaReview.class , 4005L);
//		System.out.println("review.getCourse()->{}" + review.getCourse());
//	}
	
	
//	@Test
//	@DirtiesContext
//	public void deleteById_basic() {
//
//		repository.deleteById(1003L);
//		assertNull(repository.findById(1003L)); // to check particular entry does not exist
//		// here in this part of testing it is changing the data which is present in database
//	}

	
}

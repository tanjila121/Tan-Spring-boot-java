package com.jpahibernate.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Optional;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseSpringDataRepositoryTest {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseSpringDataRepository repository;
	

	@Test
	public void findById_course_present() {
		Optional<TanjilaCourse> courseOptional = repository.findById(1001L);
		System.out.printf("{}",courseOptional.isPresent());
		//will print true 
	}
	@Test
	public void findById_course_notpresent() {
		Optional<TanjilaCourse> courseOptional = repository.findById(2001L);
		System.out.printf("{}",courseOptional.isPresent());
		//will print false
	}
	
//	@Test
//	public void playingWithSpringDataRepository() {
////		TanjilaCourse course =new TanjilaCourse("Microservices in 100 steps");
////		repository.save(course);    // insert new course
////		course.setName("Microservices in 100 steps- updated");
////		repository.save(course);	//and update inserted course
//		System.out.printf("Courses ->{}"+ repository.findAll());  // list of all courses
//		System.out.printf("Count ->{}"+ repository.count());  //Count ->{}6
//		
//	}
	@Test
	public void sort() {
//		TanjilaCourse course =new TanjilaCourse("Microservices in 100 steps");
//		repository.save(course);    // insert new course
//		course.setName("Microservices in 100 steps- updated");
//		repository.save(course);	//and update inserted course
		
		Sort sort = Sort.by(Sort.Direction.DESC,"name"); //for sorting
		
		System.out.printf("Courses ->{}"+ repository.findAll(sort));  // list of all courses
		System.out.printf("Count ->{}"+ repository.count());  //Count ->{}6
		
	}
	@Test
	public void pagination() {

		PageRequest pageRequest = PageRequest.of(0, 3);
		
		Page<TanjilaCourse> firstPage = repository.findAll(pageRequest);
		System.out.printf("First Page ->{}"+ firstPage.getContent());  
		/*First Page ->{}[
TanjilaCourse [name=Microservices in 100 steps- updated], 
TanjilaCourse [name=JDBC], 
TanjilaCourse [name=Junit]]	*/
		
		//will print contents of 2nd page
		PageRequest secondpageable = PageRequest.of(0, 3);
		Page<TanjilaCourse> secondPage = repository.findAll(secondpageable);
		System.out.printf("Second Page ->{}"+ secondPage.getContent());  
	}
	@Test
	public void findUsingName() {
		System.out.printf("Find By Name ->{}"+ repository.findByName("Unit testing"));  
		
		
	}

}

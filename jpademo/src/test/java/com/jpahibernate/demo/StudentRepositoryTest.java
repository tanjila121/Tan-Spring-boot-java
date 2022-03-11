package com.jpahibernate.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentRepositoryTest {

	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	CourseRepository repository;

	@Test
	public void findById_basic() {

	TanjilaCourse course = repository.findById(1001L);
	assertEquals("JPA in 50 steps", course.getName());
	//logger.info("Testing is Running");
	//System.out.println("Testing is Running");
	}
	
	
}


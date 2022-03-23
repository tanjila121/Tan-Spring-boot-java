package com.jpahibernate.demo;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;

import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class StudentRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	StudentRepository repository;
	
	@Autowired
	EntityManager em;

//	@Test
////	@Transactional
//	public void someTest() {
//		repository.someOperationToUnderstandPersistentContext();
//	}
	
//	@Test
//	@Transactional
//	public void RetriveStudentAndPassportDetails() {
//		TanjilaStudent student = em.find(TanjilaStudent.class, 2004L);
//		logger.info("student ->{}",student);
//		logger.info("passport ->{}",student.getPassport());
//	}
	
	@Test
	@Transactional
	public void RetrivePassportAndAssociatedStudent() {
		TanjilaPassport passport = em.find(TanjilaPassport.class, 4L);
		logger.info("passport ->{}",passport);
		logger.info("student ->{}",passport.getStudent());
	}
	
	@Test
	@Transactional
	public void RetriveStudentAndCourses() {
		TanjilaStudent student = em.find(TanjilaStudent.class ,2001L);
		System.out.printf("student ->{}"+student);
		System.out.printf("courses ->{}"+student.getCourses());
		
	}
	@Test
	@Transactional
	public void setAddressDetails() {
		TanjilaStudent student = em.find(TanjilaStudent.class, 2003L);
		student.setAddress(new Address("98 no","flat","Saswad"));
		em.flush(); 			//to ensure this update will be pushed to database
		System.out.printf("student ->{}"+student);
		System.out.printf("passport ->{}"+student.getPassport());
	}
	
}


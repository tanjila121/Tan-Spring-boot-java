package com.jpahibernate.demo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpademoApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository courseRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
public void run(String... args) throws Exception {
	
		//	studentRepository.SaveStudentWithPassport();
		//repository.playWithEntityManager();
//		tanjila_course course = repository.findById(1001L);  //find with id 
//		logger.info("tanjila_course 1001 -> {}", course);		//printing the line
		//studentRepository.deleteById(2005L);  						 //delete entry 
//		repository.save(new tanjila_course("Unit testing"));  //inserting entry 
		
		// courseRepository.addHardcodedReviewsForCourse();
		
//		List<TanjilaReview> reviews= new ArrayList<>();
//		reviews.add(new TanjilaReview("4","New things to learn"));
//	    reviews.add(new TanjilaReview("5","Easy to learn"));
//		courseRepository.addReviewsForCourse(1004l, reviews);
		
//		studentRepository.insertHardcodedStudentAndCourse();
//		studentRepository.insertStudentAndCourse(new TanjilaStudent("Ginny"),new TanjilaCourse("Entities"));
		
//		employeeRepository.insert(new TaPartTimeEmployee("Harry", new BigDecimal("40")));
//		employeeRepository.insert(new TaFullTimeEmployee("Pooja", new BigDecimal("15000")));
		System.out.printf("All Employees ->{}"+ employeeRepository.retrieveAllPartTimeEmployees());
		System.out.printf("All Employees ->{}"+ employeeRepository.retrieveAllFullTimeEmployees());
	}

}

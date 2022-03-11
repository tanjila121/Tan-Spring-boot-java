package com.jpahibernate.demo;

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
	
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}

	@Override
public void run(String... args) throws Exception {
		studentRepository.SaveStudentWithPassport();
		//repository.playWithEntityManager();
//		tanjila_course course = repository.findById(1001L);  //find with id 
//		logger.info("tanjila_course 1001 -> {}", course);		//printing the line
//		 repository.deleteById(1003L);  						 //delete entry 
//		repository.save(new tanjila_course("Unit testing"));  //inserting entry 
		
}

}

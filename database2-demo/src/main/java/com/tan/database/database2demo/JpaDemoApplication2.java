package com.tan.database.database2demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaDemoApplication2 implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("User id 01 ->{}" + repository.findById(01));
//		logger.info("Updating 07 ->{}",repository.update(new tanjila_Person(07,"Sunny","Keral", new Date())));
        //changing only city
//	logger.info("Inserting ->{}",repository.insert(new tanjila_Person("Sujay","Surat", new Date())));
	// repository.deleteById(18);
	//logger.info("All users ->{}");
		
	}
	
}

package com.tan.database.database2demo;

//import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("All users ->{}",dao.findAll());
		//logger.info("User id 01 ->{}",dao.findById(01));
	//logger.info("deleting 02 -> No of rows Deleted - {}",dao.deleteById(02));
	//logger.info("Inserting 05 ->{}",dao.insert(new tanjila_Person(05,"Sitara","Delhi", new Date())));
	//logger.info("Updating 03 ->{}",dao.update(new tanjila_Person(03,"Sneha","Kolhapur", new Date())));
	                          //changing only city
		
	}
	
}

package com.jpahibernate.demo;

//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNull;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_Course;

@RunWith(SpringRunner.class)
@SpringBootTest
class JPQLTest2 {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;

	//@Test
//	public void jpql_basic() {
//		Query query = em.createNamedQuery("Select c From tanjila_Course c");
//		List resultList = query.getResultList();
//		logger.info("Select c From tanjila_Course c ->{}", resultList);
//	}
//	@Test
//	public void jpql_typed() {
//		TypedQuery<tanjila_Course> query = 
//				em.createNamedQuery("query_get_all_courses", tanjila_Course.class);
//		List<tanjila_Course> resultList = query.getResultList();
//		logger.info("Select c From tanjila_Course c ->{}", resultList);
//	}
//	@Test
//	public void jpql_where() {
//		TypedQuery<tanjila_Course> query = 
//				em.createNamedQuery("query_get_database", tanjila_Course.class);
//		List<tanjila_Course> resultList = query.getResultList();
//		logger.info("Select c From tanjila_Course c where name like '%database'->{}", resultList);
//	}
	
}

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
import org.springframework.transaction.annotation.Transactional;

//import com.jpahibernate.demo.CourseRepository;
//import com.jpahibernate.demo.tanjila_course;

@RunWith(SpringRunner.class)
@SpringBootTest
class NativeQueryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;

//	@Test
//	public void native_queries_parameter() {
//		Query query = em.createNativeQuery("SELECT * FROM tanjila_course where id=?",tanjila_Course.class);
//		query.setParameter(1,1001L);
//		List resultList = query.getResultList();
//		logger.info("SELECT * FROM tanjila_course where id=?->{}", resultList);
//	}
//	@Test
//	public void native_queries_named_parameter() {
//		Query query = em.createNativeQuery("SELECT * FROM tanjila_course where id=:id",tanjila_course.class);
//		query.setParameter("id",1001L);
//		List resultList = query.getResultList();
//		logger.info("SELECT * FROM tanjila_course where id=:id->{}", resultList);
//	}
	@Test
	@Transactional
	public void native_queries_to_update() {
		Query query = em.createNativeQuery("Update tanjila_course set lastUpdatedDate = sysdate()",TanjilaCourse.class);
		int noOfRowsUpdated = query.executeUpdate();
		logger.info("noOfRowsUpdated->{}", noOfRowsUpdated);
	}
	
}

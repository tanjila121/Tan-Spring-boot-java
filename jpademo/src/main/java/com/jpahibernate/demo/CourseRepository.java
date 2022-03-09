package com.jpahibernate.demo;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class CourseRepository {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public tanjila_Course findById(Long id) {
		return em.find(tanjila_Course.class, id);
		}
	
	public tanjila_Course save(tanjila_Course course) {
		if(course.getId()==null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;
	}
	public void playWithEntityManager() {
		// System.out.println("playWithEntityManager - started");  //printed only to check if this running or not
		tanjila_Course course = new tanjila_Course("Annotations(@)");
		em.persist(course);
		course.setName("Annotations(@) - Updated");
	}
//	public void deleteById(Long id) {
//		tanjila_Course course = findById(1003L);
//		em.remove(course);   
//		}

}

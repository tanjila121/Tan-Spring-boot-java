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
	
	public TanjilaCourse findById(Long id) {
		return em.find(TanjilaCourse.class, id);
		}
	
	public TanjilaCourse save(TanjilaCourse course) {
		if(course.getId()==null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		return course;
	}
	public void playWithEntityManager() {
		// System.out.println("playWithEntityManager - started");  //printed only to check if this running or not
//		tanjila_course course1 = new tanjila_course("Annotations(@)"); //insert first and then update it
//		em.persist(course1);
		TanjilaCourse course2 =findById(1026L);
		course2.setName("Native Queries with parameter");
		
//		tanjila_course course2 = new tanjila_course("Angular Js");
//		em.persist(course2);
//		em.flush(); //above two queries will be added to database using flush()
//		
//		// em.clear();  //is used same as detach but no need to specify any entity
////		em.detach(course1);
////		em.detach(course2);
//		course2.setName("Angular Js - Updated");
//		course1.setName("Annotations(@) - Updated");
//		em.refresh(course1); //will refresh contents of course1(refresh updated contents)i.e print @Annotations(@)
//		em.flush();
		
	}
	
//	public void deleteById(Long id) {
//		tanjila_course course = findById(1003L);
//		em.remove(course);   
//		}

}

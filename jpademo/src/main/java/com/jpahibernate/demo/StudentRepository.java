package com.jpahibernate.demo;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class StudentRepository {
	
	//private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	EntityManager em;
	
	public TanjilaStudent findById(Long id) {
		return em.find(TanjilaStudent.class, id);
		}
	
	public TanjilaStudent save(TanjilaStudent student) {
		if(student.getId()==null) {
			em.persist(student);
		} else {
			em.merge(student);
		}
		return student;
	}
	
	public void SaveStudentWithPassport() {
		TanjilaPassport passport = new TanjilaPassport("B345123");
		em.persist(passport);
		
	    TanjilaStudent student1 = new TanjilaStudent("Abhi"); //insert first and then update it
	    
	    student1.setPassport(passport);
	    em.persist(student1);
	}
	
//	public void deleteById(Long id) {
//		tanjila_Student student = findById(1003L);
//		em.remove(student);   
//		}

}

package com.jpahibernate.demo;

import javax.persistence.EntityManager;
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
	
	public void someOperationToUnderstandPersistentContext() {
		//retrieve student
		TanjilaStudent student = em.find(TanjilaStudent.class, 2004L);
		//persistence Context( student)
		
		//retrieve passport
		TanjilaPassport passport=student.getPassport();
		//persistence Context( student and passport)
		
		//update passport
		passport.setNumber("H786512");
		//persistence Context( student and passport++)
		
		//update student
		student.setName("Sabina");
		//persistence Context( student++ and passport++)
		
	}
	
//	public void SaveStudentWithPassport() {
//		TanjilaPassport passport = new TanjilaPassport("F655123");
//		em.persist(passport);
//		
//	    TanjilaStudent student1 = new TanjilaStudent("Siya"); //insert first and then update it
//	    
//	    student1.setPassport(passport);
//	    em.persist(student1);
//	}
	
//	public void deleteById(Long id) {
//		TanjilaStudent student = findById(2005L);
//		em.remove(student);   
//		}

}

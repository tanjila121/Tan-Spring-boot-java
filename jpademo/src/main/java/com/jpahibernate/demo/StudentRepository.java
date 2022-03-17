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
		TanjilaStudent student = em.find(TanjilaStudent.class, 2009L);
		//persistence Context( student)
		
		//retrieve passport
		TanjilaPassport passport=student.getPassport();
		//persistence Context( student and passport)
		
		//update passport
		passport.setNumber("W126512");
		//persistence Context( student and passport++)
		
		//update student
		student.setName("Sneha");
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
//	public void insertHardcodedStudentAndCourse() {
//		TanjilaStudent student = new TanjilaStudent("Amara");
//		TanjilaCourse course = new TanjilaCourse("Microservices");
//		em.persist(student);
//		em.persist(course);
//		//new to persist the relationship between student and course
//		student.addCourse(course);
//		course.addStudents(student); 
//		
//		//persist owning site
//		em.persist(student);
		/*  inserted in 3 tables student course and new joint table student_course
   1 	insert 
    into
        TanjilaStudent
        (name, passport_id) 
    values
        (?, ?)
  2     insert 
    into
        TanjilaCourse
        (createdDate, lastUpdatedDate, name) 
    values
        (?, ?, ?) 
  3       insert 
    into
        TanjilaStudent_TanjilaCourse_course
        (student_id, course_id) 
    values
        (?, ?)*/
//	}
//	public void insertStudentAndCourse(TanjilaStudent student,TanjilaCourse course) {
//
//		student.addCourse(course);
//		course.addStudents(student); 
//		
//		em.persist(student);
//		em.persist(course);
//		}
	
}

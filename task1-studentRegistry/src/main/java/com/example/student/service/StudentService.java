package com.example.student.service;

import java.util.List;
import lombok.extern.slf4j.Slf4j;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student) {
		return repository.save(student);
		
	}
		
	public List<Student> getStudents(){
		return repository.findAll();
	
	}
	
	public Student getStudentById(Long id){
		return repository.findById(id).orElse(null);
	}
	
	public String deleteStudent(Long id) {
		repository.deleteById(id);
		//log.info(" Record has been deleted id : "+id);
		return "Student Removed ||"+id;
	}
//	public void delete(Student st) {
//		// TODO Auto-generated method stub
//		repository.delete(st);
//	}
	
	public Student updateStudent(Student student) {
		Student existingStudent=repository.findById(student.getId()).orElse(null);
		existingStudent.setName(student.getName());	
		existingStudent.setBirth_date(student.getBirth_date());
		existingStudent.setCity(student.getCity());
		existingStudent.setIncome(student.getIncome());
		existingStudent.setEducation(student.getEducation());
		existingStudent.setScholorship(student.isScholorship());
		return repository.save(existingStudent);	
}
}
package com.example.student.controller;
import org.springframework.http.HttpStatus;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.advice.NoSuchElementFoundException;
import com.example.student.entity.Student;
import com.example.student.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@RequestMapping("/api/tan")
@Slf4j
@RestController
public class StudentController {
	
	//Logger log=LoggerFactory.getLogger(SpringBootLoggingApplication.class);

	@Autowired 	
	private StudentService service;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		LocalDate curDate = LocalDate.now();
		int age = Period.between(student.getBirth_date(), curDate).getYears();
	    if(age<=5) {
	    	throw new RuntimeException("Student must be at least 5 years old");
	    }	
		return service.saveStudent(student);
	}

	@GetMapping("/students")
	public List<Student> findAllStudents(){
		return service.getStudents();
	}
	
	@GetMapping("/student/{id}")
	public Student findStudentById(@PathVariable Long id) throws UserNotFoundException {
		Student student=service.getStudentById(id);
		if(student == null)
			throw new UserNotFoundException("id is not available :"+id, null);
		//log.info("id is : "+id);
		//return service.getStudentById(id);
		return student;
	}
	
//	@GetMapping("/students/{id}")
//	public String findStudentById(@PathVariable Long id) {
//		log.debug("Request {} : ",id);
//		String response = "id " + id ;
//		log.debug("Response {}",response);
//		return "The id you want to search is " +response;
//	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		LocalDate curDate = LocalDate.now();
		int age= Period.between(student.getBirth_date(), curDate).getYears();
		    if(age<=5) {
		    	throw new RuntimeException("You must be at least 5 years old");
		    }
		return service.updateStudent(student);	
	}
	
	@DeleteMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable Long id) {
		service.deleteStudent(id);
		log.info("Record is Deleted whose id is : "+id);
		return "Record deleted!";		
	}	
	
	@ExceptionHandler()
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleNoSuchElementFoundException(
          NoSuchElementFoundException exception){
    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }
}

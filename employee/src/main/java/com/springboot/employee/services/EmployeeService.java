package com.springboot.employee.services;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.springboot.employee.entity.TaEmployee;
import com.springboot.employee.repository.EmployeeRepository;
@Service
@Component
@Transactional
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<TaEmployee> findAll() {
		return employeeRepository.findAll();
	}

	public TaEmployee save(TaEmployee employee) {
		return employeeRepository.save(employee);
	}

	public Optional<TaEmployee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	public TaEmployee getById(Long id) {
		return employeeRepository.getById(id);
	}

	public void deleteEmployeeById(Long id) {
		 employeeRepository.deleteById(id);
	}

	public LocalDate findByDob(LocalDate dB) {
	TaEmployee taEmployee = new TaEmployee();
	return taEmployee.getDob();
		
	}
	
//	public long getAge(Calendar dob) throws Exception {
//        Calendar today = Calendar.getInstance();
// 
//        int curYear = today.get(Calendar.YEAR);
//        int dobYear = dob.get(Calendar.YEAR);
// 
//        int age = curYear - dobYear;
//        return age;
//        }

	public void delete(TaEmployee em) {
		// TODO Auto-generated method stub
		employeeRepository.delete(em);
	}

	public TaEmployee update(TaEmployee taemployee) {
		
		TaEmployee empl=employeeRepository.findById(taemployee.getId()).orElse(null);
			empl.setId(taemployee.getId());	
			empl.setName(taemployee.getName());
			empl.setDob(taemployee.getDob());
			empl.setSalary(taemployee.getSalary());
			empl.setCity(taemployee.getCity());
			return employeeRepository.save(empl);	
	
	}
	
}
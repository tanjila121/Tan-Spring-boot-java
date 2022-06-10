package com.example.demo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.TaEmployee;
import com.example.demo.repository.EmployeeRepository;

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
	
}

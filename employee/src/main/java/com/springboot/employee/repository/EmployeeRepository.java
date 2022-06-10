package com.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employee.entity.TaEmployee;

@Repository
public interface EmployeeRepository extends JpaRepository<TaEmployee, Long>{

	//TaEmployee getDob();

    //TaEmployee getById(Date dob);

}
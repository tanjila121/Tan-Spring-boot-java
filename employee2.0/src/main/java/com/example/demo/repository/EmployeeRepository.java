package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TaEmployee;

public interface EmployeeRepository extends JpaRepository<TaEmployee, Long>{

}

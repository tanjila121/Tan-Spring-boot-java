package com.jpahibernate.demo;


import java.util.List;

import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class EmployeeRepository {
	
	@Autowired
	EntityManager em;
	//insert the employee
	public void insert(TanjilaEmployee employee) {
		em.persist(employee);
	}
	//retrieve all employees
	public List<TanjilaEmployee> retrieveAllEmployees() {
		return em.createQuery("select e from TanjilaEmployee e",TanjilaEmployee.class).getResultList();
		}

}

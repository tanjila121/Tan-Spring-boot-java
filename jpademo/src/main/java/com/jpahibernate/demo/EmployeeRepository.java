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
	//retrieve all part time employees
	public List<TaPartTimeEmployee> retrieveAllPartTimeEmployees() {
		return em.createQuery("select e from TaPartTimeEmployee e",TaPartTimeEmployee.class).getResultList();
		//SELECT * FROM ta_part_time_employee ,TanjilaEmployee WHERE ta_part_time_employee.id = TanjilaEmployee.id
		
		}
	//retrieve all part time employees
		public List<TaFullTimeEmployee> retrieveAllFullTimeEmployees() {
			return em.createQuery("select e from TaFullTimeEmployee e",TaFullTimeEmployee.class).getResultList();
			//SELECT * FROM ta_full_time_employee ,TanjilaEmployee WHERE ta_full_time_employee.id = TanjilaEmployee.id
			
			}

}

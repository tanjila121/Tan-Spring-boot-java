package com.tan.database.database2demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PersonJpaRepository {
@PersistenceContext
EntityManager entityManager;

//public tanjila_Person findById(int id) {
//	return entityManager.find(tanjila_Person.class, id);  //JPA
//}
//public void findAll(){
//	TypedQuery<tanjila_Person> namedQuery = entityManager.createNamedQuery("find_all_persons", tanjila_Person.class);
//    namedQuery.getResultList();
//}
public Object findById(int id) {
	// TODO Auto-generated method stub
	return entityManager.find(tanjila_Person.class, id);  //JPA;
}

//public tanjila_Person update(tanjila_Person person) {
//	return entityManager.merge(person);
//}

//public tanjila_Person insert(tanjila_Person person) {
//	return entityManager.merge(person);
//}
//public void deleteById(int id){
//	tanjila_Person person = (tanjila_Person) findById(id);
//	entityManager.remove(person);
//}


}
